package com.mycompany.projetodesignpatterns.chainOfResponsibility;

public class Principal {
	public static void main(String[] args) {
		OrcamentoCliente orcamento = new OrcamentoCliente(50001);

		VendedorHandler vendedor = new VendedorHandler();

		vendedor.setNext(new GerenteHandler()); // Faz o tratamento de acordo com o valor passado chamando o responsável
		vendedor.setNext(new DiretorHandler());
		vendedor.setNext(new CEOHandler());

		vendedor.handler(orcamento); // Mostra quem foi que tratou o orcamento

		System.out.println(orcamento);
	}
}
