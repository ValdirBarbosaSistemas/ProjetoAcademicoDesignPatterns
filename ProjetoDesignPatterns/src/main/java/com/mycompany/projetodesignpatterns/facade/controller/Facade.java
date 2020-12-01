package com.mycompany.projetodesignpatterns.facade.controller;

import com.mycompany.projetodesignpatterns.facade.model.BancoDeDados;
import com.mycompany.projetodesignpatterns.facade.model.Carrinho;
import com.mycompany.projetodesignpatterns.facade.model.Cliente;
import com.mycompany.projetodesignpatterns.facade.model.Produto;

public class Facade {
	BancoDeDados banco = new BancoDeDados();
	// BancoDeDadosbanco= Sistema.obterBanco();

	public void registrar(String nome, int id) {
		Cliente c = new Cliente();
		c.create(nome, id);
		Carrinho ca = Carrinho.create();
		c.adicionarCarrinho(ca);
	}

	public void comprar(int prodID, int clienteID) {
		Cliente c = banco.selectCliente(clienteID);
		Produto p = banco.selectProduto(prodID);
	}

	public void fecharCompra(int clienteID) {
		Cliente cl = banco.selectCliente(clienteID);
		int valor = 300;
		banco.processarPagamento(cl, valor);
	}
}
