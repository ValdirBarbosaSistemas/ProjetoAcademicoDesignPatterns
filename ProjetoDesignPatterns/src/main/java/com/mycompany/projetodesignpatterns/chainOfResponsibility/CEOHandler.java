package com.mycompany.projetodesignpatterns.chainOfResponsibility;

public class CEOHandler extends OrcamentoHandler {
	@Override
	public OrcamentoCliente handler(OrcamentoCliente orcamento) {
		System.out.println("O CEO trata QUALQUER orcamento...");
		orcamento.setAprovado(true);
		return orcamento;
	}
}
