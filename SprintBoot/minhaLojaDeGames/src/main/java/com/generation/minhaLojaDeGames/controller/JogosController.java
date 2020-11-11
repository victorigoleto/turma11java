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

import com.generation.minhaLojaDeGames.model.Jogos;
import com.generation.minhaLojaDeGames.repository.JogosRepository;
		
@RestController
@RequestMapping("/jogos")
public class JogosController implements WebMvcConfigurer
{

	
	public void addViewControllers(ViewControllerRegistry index) {
		index.addViewController("/").setViewName("forward:/index.html");
	}
	
	

			//INJETOU O REPOSITÓRIO DO SERVICO PARA COMUNICAR COM O BANCO DE DADOS
			@Autowired
			private JogosRepository repository;

			//CRIA UM NOVO JOGO
			@PostMapping 
			public ResponseEntity<Jogos> postJogos(@RequestBody Jogos jogos)
			{
				return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(jogos));	
			}
			
			//BUSCA TODOS OS JOGOS
			@GetMapping 
			public ResponseEntity<List<Jogos>> findAllJogos() 
			{		
				return ResponseEntity.ok(repository.findAll());
			}
			
			//BUSCA UM JOGO PELO ID
			@GetMapping ("/{id}")
			public ResponseEntity<Jogos> findByIdJogos(@PathVariable Long id) 
			{		
				return repository.findById(id)
						.map(resposta -> ResponseEntity.ok(resposta))
						.orElse(ResponseEntity.notFound().build());
			}
			
			//BUSCA UM JOGO PELA DESCRIÇÃO
			@GetMapping ("/descricao/{descricao}")
			public ResponseEntity<Jogos> findByDescricaoJogos(@PathVariable String descricao) 
			{		
				return ResponseEntity.ok(repository.findByDescricao(descricao));
						
			}
			
			//ATUALIZA UM JOGO PELO ID
			@PutMapping("/{id}")
			public ResponseEntity<Jogos> putJogos(@PathVariable Long id, @RequestBody Jogos jogos) 
			{
				jogos.setId(id);
				return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(jogos));
			}
			
			//DELETA UM JOGO PELO ID
			@DeleteMapping ("/{id}")
			public void deleteJogos(@PathVariable Long id) 
			{		
				repository.deleteById(id);
			}
}