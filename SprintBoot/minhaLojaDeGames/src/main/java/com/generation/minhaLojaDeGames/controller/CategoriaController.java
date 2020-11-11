package com.generation.minhaLojaDeGames.controller;
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
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.generation.minhaLojaDeGames.model.Categoria;
import com.generation.minhaLojaDeGames.repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
public class CategoriaController implements WebMvcConfigurer
{

	
	public void addViewControllers(ViewControllerRegistry index) {
		index.addViewController("/").setViewName("forward:/index.html");
	}
	
	
			//INJETOU O REPOSITÓRIO DO SERVICO PARA COMUNICAR COM O BANCO DE DADOS
			@Autowired
			private CategoriaRepository repository;
			
			//CRIA UMA NOVA CATEGORIA
			@PostMapping
			public Categoria criar(@RequestBody Categoria categoria) {
				repository.save(categoria);
				return categoria;
			}
			
			//BUSCA TODAS AS CATEGORIAS
			@GetMapping 
			public ResponseEntity<List<Categoria>> findAllCategoria() 
			{		
				return ResponseEntity.ok(repository.findAll());
			}
			
			//BUSCA AS CATEGORIAS PELO ID
			@GetMapping ("/{id}")
			public ResponseEntity<Categoria> findByIdCategoria(@PathVariable Long id) 
			{		
				return repository.findById(id)
						.map(resposta -> ResponseEntity.ok(resposta))
						.orElse(ResponseEntity.notFound().build());
			}
			
			//BUSCA UMA CATEGORIA PELA DESCRICAO
			@GetMapping ("/descricao/{descricao}")
			public ResponseEntity<Categoria> findAllByDescricaoCategoria(@PathVariable String descricao) 
			{		
				return ResponseEntity.ok(repository.findByDescricao(descricao));
						
			}
			
			//ATUALIZA UMA CATEGORIA PELO ID
			@PutMapping("/{id}")
			public ResponseEntity<Categoria> putCategoria(@PathVariable Long id, @RequestBody Categoria categoria) 
			{
				categoria.setId(id);
				return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
			}
			
			//DELETA UMA CATEGORIA PELO ID
			@DeleteMapping ("/{id}")
			public void deleteCategoria(@PathVariable Long id) 
			{		
				repository.deleteById(id);
			}
			
			
	
	
	
}
