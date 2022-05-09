package com.generation.projetovida.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // Faz o objeto virar uma table no BD
@Table(name = "tb_usuario") // Dá um nome para a tabela no meu banco de dados
public class Usuario {
		
		@Id // Definir a coluna de id como chave primaria
		@GeneratedValue(strategy = GenerationType.IDENTITY) // Equivalente ao auto_increment no mysql
		private Long id;

		@NotBlank // Define que o campo não pode ter espaços vazios e em branco
		private String nome;

		@NotBlank // Define que o campo não pode ter espaços vazios e em branco
		private String email_usuario;
		
		@NotNull // Define que o campo não pode ter espaços vazios
		@Size (min=11, max=11)
		private int cpf;
		
		@NotBlank // Define que o campo não pode ter espaços vazios e em branco
		private String data_nascimento;
		
		@NotBlank // Define que o campo não pode ter espaços vazios e em branco
		private String senha;
		
		@NotNull // Define que o campo não pode ter espaços vazios
		private boolean voluntario;
		
		@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL) // Um usuário para vários produtos
		@JsonIgnoreProperties("usuario") // recursividade - Ignora o termo usuário na busca
		private List<Produto> produto;
		
		//Getters and Setters - Permite que outras classes podem intereragir com os atributos privados dessa classe
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail_usuario() {
			return email_usuario;
		}

		public void setEmail_usuario(String email_usuario) {
			this.email_usuario = email_usuario;
		}

		public int getCpf() {
			return cpf;
		}

		public void setCpf(int cpf) {
			this.cpf = cpf;
		}

		public String getData_nascimento() {
			return data_nascimento;
		}

		public void setData_nascimento(String data_nascimento) {
			this.data_nascimento = data_nascimento;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public boolean isVoluntario() {
			return voluntario;
		}

		public void setVoluntario(boolean voluntario) {
			this.voluntario = voluntario;
		}
		
}