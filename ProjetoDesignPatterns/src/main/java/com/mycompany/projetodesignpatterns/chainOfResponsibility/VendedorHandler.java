package com.mycompany.projetodesignpatterns.chainOfResponsibility;

public class VendedorHandler extends OrcamentoHandler {
	@Override
	public OrcamentoCliente handler(OrcamentoCliente orcamento) {
		if (orcamento.getTotal() <= 1000) {
			System.out.println("O vendedor tratou o orcamento...");
			orcamento.setAprovado(true);
			return orcamento;
		}
		return super.handler(orcamento);
	}
}
