package com.mycompany.projetodesignpatterns.TemplateMethod.model;

public class PrimeiraCasa extends EstruturaBasica {

	@Override
	public void addExtra() {
		System.out.println("Adicionando a bandeira...");
	}

}
