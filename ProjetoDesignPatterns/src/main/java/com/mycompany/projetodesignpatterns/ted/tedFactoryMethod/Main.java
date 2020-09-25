package com.mycompany.projetodesignpatterns.ted.tedFactoryMethod;

public class Main {
	public static void main(String[] args) {
		FactoryUsuario fabrica = new FactoryUsuario();
		Usuarios u = fabrica.getSexo("Indeciso");
		u.setNome("Aline");
		System.out.println(u.getGenero());
	}
}
