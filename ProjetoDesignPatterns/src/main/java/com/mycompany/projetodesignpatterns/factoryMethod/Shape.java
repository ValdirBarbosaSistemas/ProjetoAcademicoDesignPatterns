package com.mycompany.projetodesignpatterns.factoryMethod;

public class Shape {

	// Atributos
	private String tipo;

	// Construtor
	public Shape(String tipo) {
		this.tipo = tipo;
	}

	// Getters e Setters

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	// Métodos
	public String draw() {
		return "Desenhou...";
	}

}
