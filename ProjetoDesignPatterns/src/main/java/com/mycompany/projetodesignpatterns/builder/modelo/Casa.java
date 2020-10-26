package com.mycompany.projetodesignpatterns.builder.modelo;

public class Casa extends Edificacao {
	/*
	 * Separar a construção de um objeto complexo de sua representação para que o
	 * mesmo processo da construção possa criar representações diferentes.
	 */

	private int m2;

	public Casa() {
		super();
	}

	// Getters e Setters
	
	public int getM2() {
		return this.m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	@Override
	public String toString() {
		return "Casa [m2=" + this.m2 + ", getEndereco()=" + this.getEndereco() + ", getPreco()=" + this.getPreco()
				+ "]";
	}
}
