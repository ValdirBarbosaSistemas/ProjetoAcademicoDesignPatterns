package com.mycompany.projetodesignpatterns.adapterObject.model;

public class ClasseExistente {
	
	public ClasseExistente() {
	}

	public void metodoUtilUm(String texto) {
		System.out.println(texto);
	}

	public String metodoUtilDois(String texto) {
		return texto.toUpperCase();
	}
}
