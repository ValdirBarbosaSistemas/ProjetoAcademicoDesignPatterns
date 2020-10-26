package com.mycompany.projetodesignpatterns.ted.tedSingleton;

/**
 * 
 * @author valdir-sistemas
 *
 */
public class Incremental {
	// Atributos
	private static int count = 0;
	private int numero;

	// Atributos dele mesmo

	private static Incremental instance;

	// Construtor privado
	private Incremental() {
		for (this.numero = 0; this.numero < 10; this.numero++) {
			System.out.println(this.numero++);
		}
//		numero = ++count;
	}

	// Método estático
	public static Incremental getResultado() {
		if (instance == null) {
			instance = new Incremental();
		}
		return instance;
	}

	@Override
	public String toString() {
		return "Novo valor é: " + numero;
	}
}
