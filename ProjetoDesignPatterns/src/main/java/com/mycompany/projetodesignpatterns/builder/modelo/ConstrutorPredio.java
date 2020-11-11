package com.mycompany.projetodesignpatterns.builder.modelo;

public class ConstrutorPredio extends Construtor {

	/*
	 * FIXME OBS: Para melhor entendimento colocar essa classe como se fosse um
	 * "MESTRE DE OBRA RESPONSÁVEL PELO PRÉDIO", pois é ele quem vai ter o passo do
	 * prédio para fazer o negócio. É AQUI ONDE SERÁ IMPLEMENTADO O PRÉDIO.
	 */

	// MODELO PARA PŔEDIO

	private Predio predio = new Predio();

	public ConstrutorPredio(Predio predio) {
		this.predio = predio;
	}

	public ConstrutorPredio() {

	}

	@Override
	public void passoUm() {
		// Informacoes e Cálculos complexos
		System.out.println("Passo UM predio");
		predio.setAndares(10);
	}

	@Override
	public void passoDois() {
		// Informações e Cálculos complexos
		System.out.println("Passo DOIS predio");
		predio.setPreco(100000);
	}

	@Override
	public Edificacao obterProduto() {
		return this.predio;
	}
}
