package com.mycompany.projetodesignpatterns.mediator;

public interface ChatMediator {
	/*
	 * Toda a classe que for implementar essa interface precisará desses métodos
	 */

	public void enviarMensagem(String mensagem, Usuario user);

	public void adicionarUsuario(Usuario user);
}
