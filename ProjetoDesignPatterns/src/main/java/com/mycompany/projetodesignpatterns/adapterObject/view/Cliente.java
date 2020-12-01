package com.mycompany.projetodesignpatterns.adapterObject.view;

import com.mycompany.projetodesignpatterns.adapterObject.model.Adaptador;
import com.mycompany.projetodesignpatterns.adapterObject.model.Alvo;

public class Cliente {
	static Alvo[] alvos = new Alvo[10];

	public static void inicializaAlvos() {
		for (int i = 0; i < alvos.length; i++) {
			alvos[i] = new Adaptador();
		}

	}

	public static void executaAlvos() {
		for (int i = 0; i < alvos.length; i++) {
			alvos[i].operacao();
		}
	}

	public static void main(String[] args) {

		inicializaAlvos();
		executaAlvos();

	}
}
