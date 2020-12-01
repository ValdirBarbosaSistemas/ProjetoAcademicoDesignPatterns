package com.mycompany.projetodesignpatterns.command.commands;

import com.mycompany.projetodesignpatterns.command.portoes.Portao;

public class AbrirCommand implements Command {
	private Portao portao;

	public AbrirCommand(Portao portao) {
		this.portao = portao;
	}

	public void execute() {
		portao.abrir();
	}

	public void undo() {
		portao.fechar();
	}
}
