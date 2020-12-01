package com.mycompany.projetodesignpatterns.facade.model;

import java.util.ArrayList;

public class Carrinho {
	private ArrayList listaP = new ArrayList();

	public Carrinho() {
	}

	public static Carrinho create() {
		return null;
	}

	public void adicionar(Produto p) {
		System.out.println("Adicionar Produto");
		listaP.add(p);
	}

	public double getTotal() {
		return 0;
	}
}
