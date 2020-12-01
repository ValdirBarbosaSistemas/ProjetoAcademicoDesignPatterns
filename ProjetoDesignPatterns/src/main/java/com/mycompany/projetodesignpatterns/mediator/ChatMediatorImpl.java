package com.mycompany.projetodesignpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

	private List<Usuario> usuarios;

	public ChatMediatorImpl() {
		this.usuarios = new ArrayList<Usuario>();
	}

	@Override
	public void enviarMensagem(String mensagem, Usuario user) {
		for (Usuario u : usuarios) {
			if (u != user) {
				u.receberMensagem(mensagem);
			}
		}
	}

	@Override
	public void adicionarUsuario(Usuario user) {
		usuarios.add(user);
	}
}
