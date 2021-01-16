package com.mycompany.projetodesignpatterns.bridge;

import com.mycompany.projetodesignpatterns.bridge.model.Refrigerante;

public class TamanhoFamilia extends Tamanho {

	public TamanhoFamilia(Refrigerante refrigerante) {
		super(refrigerante);
	}

	@Override
	public void beber() {
		System.out.println("Tomou um gole de " + refrigerante);
	}

}
