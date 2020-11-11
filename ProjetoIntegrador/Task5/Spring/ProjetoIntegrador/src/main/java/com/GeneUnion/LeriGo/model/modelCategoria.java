package com.GeneUnion.LeriGo.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_categoria")
public class modelCategoria {

	//Inicio Colunas da Tabela
	
	@Column
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id_categoria;
	
	@Column
	@NotNull
	private String tipo;
	
	@Column
	@NotNull
	private String destino;
	
	@Column
	@NotNull
	private String classificacao;

	//Fim Colunas da Tabela
	
	//Inicio Get's e Set's
	
	public Long getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(Long id_categoria) {
		this.id_categoria = id_categoria;
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

	//Fim Get's e Set's
}
