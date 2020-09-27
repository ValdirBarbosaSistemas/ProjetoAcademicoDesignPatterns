package com.mycompany.projetodesignpatterns.ted.tedFactoryMethod;

public class Main {
	public static void main(String[] args) {
		FactoryUsuario fabrica = new FactoryUsuario();
		Usuarios usu = fabrica.getSexo("Indeciso");
		usu.setNome("Valdir");
		System.out.println(usu.getGenero());
	}
}
