package com.mycompany.projetodesignpatterns.chainOfResponsibility;

public class DiretorHandler extends OrcamentoHandler {
	@Override
	public OrcamentoCliente handler(OrcamentoCliente orcamento) {
		if (orcamento.getTotal() <= 50000) {
			System.out.println("O diretor tratou o orcamento...");
			orcamento.setAprovado(true);
			return orcamento;
		}
		return super.handler(orcamento);
	}
}
