package com.mycompany.projetodesignpatterns.mediator;

public class UsuarioImpl extends Usuario {

	public UsuarioImpl(String nomeUsuario, ChatMediator mediator) {
		super(nomeUsuario, mediator);
	}

	@Override
	public void enviarMensagem(String mensagem) {
		System.out.println(nomeUsuario + "Enviando a Mensagem " + mensagem);
		super.mediator.enviarMensagem(mensagem, this); // Chamando o mediator
	}

	@Override
	public void receberMensagem(String mensagem) {
		System.out.println(nomeUsuario + "Recebendo a mensagem " + mensagem);
	}
}
