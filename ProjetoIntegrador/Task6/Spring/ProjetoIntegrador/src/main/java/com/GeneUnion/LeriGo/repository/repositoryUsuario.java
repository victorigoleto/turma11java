package com.GeneUnion.LeriGo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GeneUnion.LeriGo.model.modelUsuario;

public interface repositoryUsuario extends JpaRepository<modelUsuario,Long>{

	public List<modelUsuario> findAllByNomeContainingIgnoreCase(String nome);

	public Optional<modelUsuario> findByNome(String nome);

}
