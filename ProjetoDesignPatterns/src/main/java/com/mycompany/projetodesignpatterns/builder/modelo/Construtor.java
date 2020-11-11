package com.mycompany.projetodesignpatterns.builder.modelo;

public abstract class Construtor {

	/*
	 * FIXME OBS: Para melhor entendimento colocar essa classe como se fosse um
	 * "MESTRE DE OBRA", pois é ele quem vai ter o passo a passo para fazer o
	 * negócio.
	 */
	public Construtor() {

	}

	// MODELO PARA A IMPLEMENTAÇÃO DA CASA/PREDIO

	public abstract void passoUm();

	public abstract void passoDois();

	public abstract Edificacao obterProduto();
}
