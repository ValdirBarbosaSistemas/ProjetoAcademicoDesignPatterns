package com.mycompany.projetodesignpatterns.chainOfResponsibility;

public class OrcamentoCliente {
	private int total;
	private boolean aprovado = false;

	public OrcamentoCliente(int total) {
		this.total = total;
	}

	public int getTotal() {
		return this.total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public boolean isAprovado() {
		return this.aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	
	@Override
	public String toString() {
		return "Orcamento do cliente = [ Total = " + total + ", aprovado = " + aprovado + " ]";
	}
}
