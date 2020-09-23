package com.mycompany.projetodesignpatterns.ted.tedFactoryMethod;

/**
 * @author valdir-sistemas
 *
 */
public class Usuarios {

	// Atributos
	private String nome;
	private String genero;

	// Construtor vazio
	public Usuarios(String nome, String genero) {
		this.nome = nome;
		this.genero = genero;
	}

	// Getters e Setters
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	// Métodos
	public String sexo(String genero) {
		return genero;
	}

}
