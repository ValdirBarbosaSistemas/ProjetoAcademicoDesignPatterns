package com.mycompany.projetodesignpatterns.ted.tedFactoryMethod;

public class Feminino extends Usuarios {

	// Construtor vazio
	public Feminino() {
		super();
	}

	@Override
	public String getGenero() {
		return "Bem vindo Sra." + getNome();
	}
}