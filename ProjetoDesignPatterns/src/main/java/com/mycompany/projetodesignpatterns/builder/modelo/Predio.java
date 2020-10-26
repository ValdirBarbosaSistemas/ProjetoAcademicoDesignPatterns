package com.mycompany.projetodesignpatterns.builder.modelo;

public class Predio extends Edificacao {

	private int andares;

	public Predio() {
		super();
	}

	// Getters e Setters

	public int getAndares() {
		return this.andares;
	}

	public void setAndares(int andares) {
		this.andares = andares;
	}

	@Override
	public String toString() {
		return "Predio [andares=" + this.andares + ", getEndereco()=" + this.getEndereco() + ", getPreco()="
				+ this.getPreco() + "]";
	}
}
