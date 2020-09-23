package com.mycompany.projetodesignpatterns.factoryMethod;

public class Polygon extends Shape {

	// Construtor
	public Polygon(String tipo) {
		super(tipo);
		System.out.println("Construiu Polígono...");
	}

}
