package com.mycompany.projetodesignpatterns.interpreter;

public class Teste {
	public static void main(String[] args) {
		Operador somar = new Somar(new Numero(2), new Numero(4));
		System.out.println("O resultado da soma é: " + somar.interpretar());
	}
}
