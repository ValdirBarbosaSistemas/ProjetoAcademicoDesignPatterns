package com.mycompany.projetodesignpatterns.abstractFactory.view;

import com.mycompany.projetodesignpatterns.abstractFactory.model.Carro;

public class Main {

	private static Carro montarCarro(String tipo) {
		CarroFactory cf = null;
		if (tipo.compareTo("luxo") == 0)
			cf = new CarroLuxoFactory();
		else if (tipo.compareTo("popular") == 0)
			cf = new CarroPopularFactory();

		Carro c = new Carro();
		c.setRoda(cf.montarRoda());
		c.setSom(cf.montarSom());
		return c;

		/*
		 * O Abstract Factory é um padrão que os métodos implementados ficam na classe
		 * main e que também necessitam de classes abstratas para implementar de uma
		 * forma obrigatoria e organizada, ou seja, os artefatos de cada objeto serão
		 * declarados de forma abstrata para que a implementação dos mesmos sejam como
		 * regras quando os objetos forem criados 
		 * FÁBRICAS ABSTRATAS PARA A CRIAÇÃO DE REGRAS PARA CONSTRUÇÃO DO OBJETO
		 */
	}

	public static void main(String[] args) {
		Carro c1 = montarCarro("luxo");
		Carro c2 = montarCarro("popular");

		System.out.println("\n" + c1);
		System.out.println("\n" + c2);
	}
}
