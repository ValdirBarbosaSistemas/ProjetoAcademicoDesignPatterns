package com.mycompany.projetodesignpatterns.ted.tedBuilder;

public abstract class ConstrutorCarro {

	public ConstrutorCarro() {

	}

	public abstract void passoUm();

	public abstract void passoDois();

	public abstract CarroBuilder obterCarro();
}
