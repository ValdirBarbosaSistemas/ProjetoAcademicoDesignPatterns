package com.mycompany.projetodesignpatterns.builder.modelo;

public abstract class Construtor {

	public Construtor() {

	}

	public abstract void passoUm();

	public abstract void passoDois();

	public abstract Edificacao obterProduto();
}
