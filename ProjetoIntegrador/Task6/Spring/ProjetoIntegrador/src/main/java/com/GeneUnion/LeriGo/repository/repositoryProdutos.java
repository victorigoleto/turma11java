package com.GeneUnion.LeriGo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GeneUnion.LeriGo.model.modelProdutos;

public interface repositoryProdutos  extends JpaRepository<modelProdutos ,Long>{

	public List<modelProdutos>findAllByNomeContainingIgnoreCase(String nome);

}
