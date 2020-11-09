package com.mycompany.projetodesignpatterns.builder.modelo;

public class Diretor {
	private Construtor constr;

	// O DIRETOR É O RESPONSÁVEL PELA CONSTRUÇÃO DA CASA
	
	public Diretor(Construtor constr) {
		this.constr = constr;
	}

	public void construir() {
		this.constr.passoUm();
		this.constr.passoDois();
	}

	public Construtor getConstr() {
		return constr;
	}

	public void setConstr(Construtor constr) {
		this.constr = constr;
	}
}
