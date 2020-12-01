package com.mycompany.projetodesignpatterns.adapterObject.model;

public class Adaptador extends Alvo {
	// composição
	ClasseExistente existente = new ClasseExistente();

	public void operacao() {
		String texto = existente.metodoUtilDois("Operação Realizada.");
		existente.metodoUtilUm(texto);

	}
}
