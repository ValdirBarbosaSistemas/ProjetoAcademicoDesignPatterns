package com.mycompany.projetodesignpatterns.builder.view;

import com.mycompany.projetodesignpatterns.builder.modelo.ConstrutorCasa;
import com.mycompany.projetodesignpatterns.builder.modelo.ConstrutorPredio;
import com.mycompany.projetodesignpatterns.builder.modelo.Diretor;

public class Cliente {
	public static void main(String[] args) {

		// Não Obrigatório
		ConstrutorPredio cP = new ConstrutorPredio(); // Chamando o construtor do prédio
		ConstrutorCasa cC = new ConstrutorCasa(); // chamando o construtor da casa

		Diretor d1 = new Diretor(cP); // Chamando o DIRETOR PARA CONSTRUIR O PRÉDIO

		// Predio
		d1.construir();
		System.out.println(cP.obterProduto()); // Único tipo de acesso p/ construtor

		// Casa
		Diretor d2 = new Diretor(cC);
		d2.construir();
		System.out.println(cC.obterProduto());
	}
}
