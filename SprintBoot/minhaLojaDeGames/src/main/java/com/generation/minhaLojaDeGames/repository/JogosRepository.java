package com.generation.minhaLojaDeGames.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.minhaLojaDeGames.model.Jogos;

public interface JogosRepository extends JpaRepository<Jogos, Long> 
{

	Jogos findByDescricao(String descricao);

	 

	

}
