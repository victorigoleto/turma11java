package com.generation.minhaLojaDeGames.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;


@Entity
@Table(name="tb_jogos")
public class Jogos 
{

		//ATRIBUTOS
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long Id;
		
		@Column
		@NotNull
		private String nome;

		@Column
		@NotNull
		private String descricao;
		
		@Column
		@NotNull
		private Double preco;
		
		@Column
		@NotNull
		private int estoque;
		
		@Column
		@NotNull
		private int restricao;
		
		@Column
		@NotNull
		private String tipo;
		
		
		//CHAVE ESTRANGEIRA
		@ManyToOne
		@JsonIgnoreProperties("jogos")
		private Categoria categoria;
		
		
		

		//GETTERS AND SETTERS
		public Long getId() {
			return Id;
		}


		public void setId(Long id) {
			Id = id;
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public String getDescricao() {
			return descricao;
		}


		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}


		public Double getPreco() {
			return preco;
		}


		public void setPreco(Double preco) {
			this.preco = preco;
		}


		public Categoria getCategoria() {
			return categoria;
		}


		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}


		public int getRestricao() {
			return restricao;
		}


		public void setRestricao(int restricao) {
			this.restricao = restricao;
		}


		public int getEstoque() {
			return estoque;
		}


		public void setEstoque(int estoque) {
			this.estoque = estoque;
		}


		public String getTipo() {
			return tipo;
		}


		public void setTipo(String tipo) {
			this.tipo = tipo;
		}


		
		
		
		
	
	
}