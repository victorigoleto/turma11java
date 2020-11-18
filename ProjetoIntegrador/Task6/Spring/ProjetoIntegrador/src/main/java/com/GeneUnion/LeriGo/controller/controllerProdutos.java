package com.GeneUnion.LeriGo.controller;

import java.util.List;

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

import com.GeneUnion.LeriGo.model.modelProdutos;
import com.GeneUnion.LeriGo.repository.repositoryProdutos;

@RestController
@RequestMapping("/produtos")
public class controllerProdutos {

	@Autowired
	private repositoryProdutos repository;
	
	@GetMapping
	public ResponseEntity<List<modelProdutos>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/id.{id}")
	public ResponseEntity<modelProdutos>getById(@PathVariable Long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nome.{nome}")
	public ResponseEntity<List<modelProdutos>> getByNome(@PathVariable String nome){
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
	}
	
	@PostMapping
	public ResponseEntity<modelProdutos> post (@RequestBody modelProdutos produto){
		return ResponseEntity.ok(repository.save(produto));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<modelProdutos> put (@RequestBody modelProdutos produto){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(produto));
	}
	
	@DeleteMapping("/id.{id}")
	public void delete (@PathVariable Long id) {
		repository.deleteById(id);
	}
}
