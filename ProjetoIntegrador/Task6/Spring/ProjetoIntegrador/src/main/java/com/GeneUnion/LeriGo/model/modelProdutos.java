package com.GeneUnion.LeriGo.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name="tb_produtos")
public class modelProdutos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduto;
	
	@Column
	@NotNull
	private String nome;
	
	@Column
	@NotNull
	private String tamanho;
	
	@Column
	@NotNull
	private int quantidade;
	
	@Column
	@NotNull
	private double preco;
	
	@Column
	@NotNull
	private String foto;
	
	@ManyToOne
	@JsonIgnoreProperties("modelProdutos")
	private modelCategoria categoria;

	//Getters e Setters
	
	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long id_produto) {
		this.idProduto = id_produto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public modelCategoria getCategoria() {
		return categoria;
	}

	public void setCategoria(modelCategoria categoria) {
		this.categoria = categoria;
	}

}
