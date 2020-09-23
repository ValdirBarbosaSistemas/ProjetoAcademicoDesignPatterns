package com.mycompany.projetodesignpatterns.factoryMethod;

public class Circle extends Shape {

	// Construtor
	public Circle(String tipo) {
		super(tipo);
		System.out.println("Construiu círculo...");
	}

	// Métodos
	@Override
	public String draw() {
		return "Desenhou...";
	}
}
