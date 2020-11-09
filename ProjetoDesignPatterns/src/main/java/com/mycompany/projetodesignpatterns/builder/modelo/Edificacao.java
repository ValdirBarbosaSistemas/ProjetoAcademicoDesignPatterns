package com.mycompany.projetodesignpatterns.builder.modelo;

public class Edificacao {

	// MODELO/MOLDE PARA CONSTRUIR
	
	private String endereco;
	private double preco;

	public Edificacao() {

	}

	public Edificacao(String endereco, double preco) {
		this.endereco = endereco;
		this.preco = preco;
	}

	// Getters e Setters
	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getPreco() {
		return this.preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
