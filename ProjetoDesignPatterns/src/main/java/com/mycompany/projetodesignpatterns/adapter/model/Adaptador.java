package com.mycompany.projetodesignpatterns.adapter.model;

public class Adaptador extends ClasseExistente implements Alvo {

	public Adaptador() {

	}

	public void operacao() {
		String texto = metodoUtilDois("Operação Realizada.");
		metodoUtilUm(texto);

	}

}
