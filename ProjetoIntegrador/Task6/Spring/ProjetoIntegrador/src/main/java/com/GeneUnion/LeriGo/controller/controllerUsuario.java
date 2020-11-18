package com.GeneUnion.LeriGo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GeneUnion.LeriGo.UsuarioService;
import com.GeneUnion.LeriGo.model.UsuarioLogin;
import com.GeneUnion.LeriGo.model.modelUsuario;
import com.GeneUnion.LeriGo.repository.repositoryUsuario;

@RestController
@RequestMapping("/usuario")
public class controllerUsuario {

	@Autowired
	private repositoryUsuario repository;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public List<modelUsuario> buscarTodos(){
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<modelUsuario> GetById(@PathVariable Long id){
		return repository.findById(id);
	}
	
	@GetMapping("/nome.{nome}")
	public ResponseEntity<List<modelUsuario>> GetByNome(@PathVariable String nome){
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));	
	}
	
	@PostMapping
	public ResponseEntity<modelUsuario> post (@RequestBody modelUsuario nome){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(nome));
	}
	
	@PutMapping
	public ResponseEntity<modelUsuario> put (@RequestBody modelUsuario nome){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(nome));
	}
	
	@DeleteMapping("/delete.{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}

	@PostMapping("/logar")
	public ResponseEntity<UsuarioLogin> Autentication(@RequestBody Optional<UsuarioLogin> user){
		return usuarioService.Logar(user).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<modelUsuario> Post(@RequestBody modelUsuario usuario){
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.CadastrarUsuario(usuario));
	}
	
}
