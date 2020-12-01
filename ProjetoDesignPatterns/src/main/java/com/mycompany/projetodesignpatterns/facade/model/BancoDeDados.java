package com.mycompany.projetodesignpatterns.facade.model;

public class BancoDeDados {
	// BancoDeDadosbanco= Sistema.obterBanco();

	public Cliente selectCliente(int id) {
		return null;
	}

	public Produto selectProduto(int id) {
		return null;
	}

	public void processarPagamento(Cliente c, int v) {
		System.out.println("Processar Pagamento");
	}
}
