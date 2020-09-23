package com.mycompany.projetodesignpatterns.ted.tedFactoryMethod;

public class Feminino extends Usuarios {

	// Construtor vazio
	public Feminino() {
		super();
		System.out.println("Bem vindo Sra." + getNome());
	}
}
