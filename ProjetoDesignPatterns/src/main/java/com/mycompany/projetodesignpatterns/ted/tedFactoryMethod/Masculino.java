package com.mycompany.projetodesignpatterns.ted.tedFactoryMethod;

public class Masculino extends Usuarios {

	// Construtor vazio
	public Masculino() {
		super();
	}

	@Override
	public String getGenero() {
		return "Bem vindo Sr." + getNome();
	}

}
