package com.GeneUnion.LeriGo.model;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")
public class modelCategoria {

	//Inicio Colunas da Tabela
	
	@Column
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idCategoria;
	
	@Column
	@NotNull
	private String tipo;
	
	@Column
	@NotNull
	private String destino;
	
	@Column
	@NotNull
	private String classificacao;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<modelProdutos> modelProdutos;

	//Fim Colunas da Tabela
	
	//Inicio Get's e Set's
	
	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public List<modelProdutos> getModelProdutos() {
		return modelProdutos;
	}

	public void setModelProdutos(List<modelProdutos> modelProdutos) {
		this.modelProdutos = modelProdutos;
	}
	
	//Fim Get's e Set's
}
