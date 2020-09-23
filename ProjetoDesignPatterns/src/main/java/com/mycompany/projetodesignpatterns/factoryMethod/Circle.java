package com.mycompany.projetodesignpatterns.factoryMethod;

public class Circle extends Shape {

	// Construtor
	public Circle(String tipo) {
		super(tipo);
		System.out.println("Construiu círculo...");
	}

	// Métodos
	public String draw() {
		return "Desenhou...";
	}
}
