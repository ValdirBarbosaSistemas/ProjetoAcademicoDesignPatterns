package com.mycompany.projetodesignpatterns.ted.tedFactoryMethod;

public class Indeciso extends Usuarios {

	// Construtor vazio
	public Indeciso() {
		super();
	}
	
	@Override
	public String getGenero() {
		return "Bem vindo " + getNome();
	}
}
