package com.mycompany.projetodesignpatterns.bridge;

import com.mycompany.projetodesignpatterns.bridge.model.Refrigerante;

public abstract class Tamanho {
	protected Refrigerante refrigerante;

	public Tamanho(Refrigerante refrigerante) {
		this.refrigerante = refrigerante;
	}
	
	public abstract void beber();
}
