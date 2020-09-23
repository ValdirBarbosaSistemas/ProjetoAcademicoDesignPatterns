package com.mycompany.projetodesignpatterns.ted.tedFactoryMethod;

public class Masculino extends Usuarios {

	// Construtor vazio
	public Masculino() {
		super();
		System.out.println("Bem vindo Sr." + getNome());
		// TODO VER DE ALGUMA FORMA PARA MELHORAR ISSO
	}

}
