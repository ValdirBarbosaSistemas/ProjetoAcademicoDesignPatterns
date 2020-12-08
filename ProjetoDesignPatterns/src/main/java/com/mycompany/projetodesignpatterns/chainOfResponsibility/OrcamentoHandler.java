package com.mycompany.projetodesignpatterns.chainOfResponsibility;

public abstract class OrcamentoHandler {

	protected OrcamentoHandler next = null;

	public OrcamentoHandler setNext(OrcamentoHandler handler) {
		this.next = handler;
		return handler;
	}

	// Responsavel por repassar o problema
	public OrcamentoCliente handler(OrcamentoCliente orcamento) {
		if (this.next != null) {
			return this.next.handler(orcamento);
		}
		return orcamento;
	}

}
