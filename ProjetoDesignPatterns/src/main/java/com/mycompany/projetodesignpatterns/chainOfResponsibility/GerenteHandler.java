package com.mycompany.projetodesignpatterns.chainOfResponsibility;

public class GerenteHandler extends OrcamentoHandler {
	@Override
	public OrcamentoCliente handler(OrcamentoCliente orcamento) {
		if (orcamento.getTotal() <= 5000) {
			System.out.println("O gerente tratou o orcamento...");
			orcamento.setAprovado(true);
			return orcamento;
		}
		return super.handler(orcamento);
	}
}
