package com.mycompany.projetodesignpatterns.ted.tedFactoryMethod;

public class Main {
	public static void main(String[] args) {
		FactoryUsuario fabrica = new FactoryUsuario();
		Usuarios usu1 = fabrica.getSexo("Masculino");
		usu1.setNome("Valdir");
		System.out.println(usu1.getNome());
		// TODO VER ALGUMA FORMA DE MELHORAR A EXIBIÇAO
	}
}
