package com.mycompany.projetodesignpatterns.builder.modelo;

public class ConstrutorCasa extends Construtor {

	/*
	 * FIXME OBS: Para melhor entendimento colocar essa classe como se fosse um
	 * "MESTRE DE OBRA RESPONSÁVEL PELA CASA", pois é ele quem vai ter o passo da
	 * casa para fazer o negócio. É AQUI ONDE SERÁ IMPLEMENTADO A CASA.
	 */

	// MODELO PARA A CASA

	private Casa casa = new Casa(); // Instanciando a casa

	public ConstrutorCasa(Casa casa) {
		this.casa = casa;
	}

	public ConstrutorCasa() {

	}

	@Override
	public void passoUm() {
		// Informações e Cálculos complexos
		System.out.println("Passo UM casa");
		casa.setM2(10000);
	}

	@Override
	public void passoDois() {
		// Informações e Cálculos complexos
		System.out.println("Passo DOIS casa");
		casa.setPreco(5000000);
	}

	@Override
	public Edificacao obterProduto() {
		return this.casa;
	}

}
