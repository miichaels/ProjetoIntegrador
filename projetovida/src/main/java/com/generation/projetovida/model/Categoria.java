package com.generation.projetovida.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity  //Faz o objeto virar uma table no BD
@Table(name ="tb_categoria") //Dá um nome para a tabela no meu banco de dados
public class Categoria {
	
	@Id  // Definir a coluna de id como chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Equivalente ao auto_increment no mysql
	public Long id;
	
	@NotBlank  	// Define que o campo é obrigatorio
	@Size(min=3, max=100,message = "O campo deve ter no minimo 3 caracteres e no maximo 100 caracteres")
	private String produtos;
	
	@NotBlank
	@Size(min=3, max=100,message = "O campo deve ter no minimo 3 caracteres e no maximo 100 caracteres")
	private String cursos;

	// Métodos - O método getter retorna o valor do atributo. 
	//O método setter pega um parâmetro e o atribui ao atributo.
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProdutos() {
		return produtos;
	}

	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}

	public String getCursos() {
		return cursos;
	}

	public void setCursos(String cursos) {
		this.cursos = cursos;
	}
	
}
