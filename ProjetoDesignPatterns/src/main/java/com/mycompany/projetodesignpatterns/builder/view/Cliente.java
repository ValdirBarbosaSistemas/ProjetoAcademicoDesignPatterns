package com.mycompany.projetodesignpatterns.builder.view;

import com.mycompany.projetodesignpatterns.builder.modelo.ConstrutorCasa;
import com.mycompany.projetodesignpatterns.builder.modelo.ConstrutorPredio;
import com.mycompany.projetodesignpatterns.builder.modelo.Diretor;

public class Cliente {
	public static void main(String[] args) {

		// Não Obrigatório
		ConstrutorPredio cP = new ConstrutorPredio();
		ConstrutorCasa cC = new ConstrutorCasa();

		Diretor d1 = new Diretor(cP);

		// Predio
		d1.construir();
		System.out.println(cP.obterProduto()); // Único tipo de acesso p/ construtor

		Diretor d2 = new Diretor(cC);
		d2.construir();
		System.out.println(cC.obterProduto());
	}
}
