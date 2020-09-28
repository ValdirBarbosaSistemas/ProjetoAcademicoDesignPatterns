package com.mycompany.projetodesignpatterns.ted.tedFactoryMethod;

public class Main {
	public static void main(String[] args) {
		FactoryUsuario fabrica = new FactoryUsuario();
		Usuarios usu = fabrica.getSexo("Masculino");
		usu.setNome("Valdir");
		System.out.println(usu.getGenero());
	}
}
