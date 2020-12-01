package com.mycompany.projetodesignpatterns.mediator;

public abstract class Usuario {

	protected String nomeUsuario;
	protected ChatMediator mediator; // Criando o mediator

	public Usuario(String nomeUsuario, ChatMediator mediator) {
		this.nomeUsuario = nomeUsuario;
		this.mediator = mediator;
	}

	public abstract void enviarMensagem(String mensagem);

	public abstract void receberMensagem(String mensagem);
}
