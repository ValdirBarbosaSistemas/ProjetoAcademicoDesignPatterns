package com.mycompany.projetodesignpatterns.ted.tedSingleton;

public class TesteIncremental {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			Incremental valor = Incremental.getResultado();
			System.out.println(valor);
		}

	}
}
