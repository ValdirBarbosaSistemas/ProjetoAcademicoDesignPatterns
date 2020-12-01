package com.mycompany.projetodesignpatterns.adapter.controller;

import com.mycompany.projetodesignpatterns.adapter.model.Adaptador;
import com.mycompany.projetodesignpatterns.adapter.model.Alvo;

public class Cliente {
	Alvo[] alvos = new Alvo[10];

	public Cliente() {
	}

	public void inicializaAlvos() {
		alvos[0] = new Adaptador();
		// alvos[1] = new AlvoFilho1();
	}

	public void executaAlvos() {
		for (int i = 0; i < alvos.length; i++) {
			alvos[i].operacao();
		}
	}
}
