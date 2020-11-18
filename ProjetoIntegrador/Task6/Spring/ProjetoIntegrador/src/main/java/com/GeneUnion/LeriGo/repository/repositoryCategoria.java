package com.GeneUnion.LeriGo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.GeneUnion.LeriGo.model.*;

public interface repositoryCategoria extends JpaRepository<modelCategoria, Long>{

	public List<modelCategoria>findAllByTipoContainingIgnoreCase(String tipo);
	
}
