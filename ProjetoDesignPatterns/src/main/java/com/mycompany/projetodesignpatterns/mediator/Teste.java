package com.mycompany.projetodesignpatterns.mediator;

public class Teste {
	
	public static void main(String[] args) {
		ChatMediator chat = new ChatMediatorImpl();

		Usuario u1 = new UsuarioImpl("Alana", chat);
		Usuario u2 = new UsuarioImpl("Aline", chat);
		Usuario u3 = new UsuarioImpl("Carlos", chat);
		Usuario u4 = new UsuarioImpl("Fábio", chat);

		chat.adicionarUsuario(u1);
		chat.adicionarUsuario(u2);
		chat.adicionarUsuario(u3);
		chat.adicionarUsuario(u4);
		// -------------------Simulando a chamada da primeira pessoa

		u1.enviarMensagem("Bom dia meus queridos!!!");
	}
}
