package com.mycompany.projetodesignpatterns.ted.tedFactoryMethod;

public class Main {
	public static void main(String[] args) {
		FactoryUsuario fabrica = new FactoryUsuario();
		Usuarios usu1 = new Usuarios("Valdir", "masculino");
		fabrica.sexoGenero("masculino");
		System.out.println();
		// TODO ver como implementar de forma correta
	}
}
