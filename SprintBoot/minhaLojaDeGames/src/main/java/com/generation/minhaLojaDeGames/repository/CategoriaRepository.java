package com.generation.minhaLojaDeGames.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.minhaLojaDeGames.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	Categoria findByDescricao(String descricao);

}