package com.generation.minhaLojaDeGames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name="tb_categoria")
public class Categoria 
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
		private String plataforma;
		
		
		
		@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
		@JsonIgnoreProperties("categoria")
		private List<Jogos> jogos;
		
		

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



		public List<Jogos> getJogos() {
			return jogos;
		}



		public void setJogos(List<Jogos> jogos) {
			this.jogos = jogos;
		}



		public String getPlataforma() {
			return plataforma;
		}



		public void setPlataforma(String plataforma) {
			this.plataforma = plataforma;
		}




		
		
}
