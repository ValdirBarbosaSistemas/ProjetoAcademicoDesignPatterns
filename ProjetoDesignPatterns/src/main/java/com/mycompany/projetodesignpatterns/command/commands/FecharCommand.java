package com.mycompany.projetodesignpatterns.command.commands;

import com.mycompany.projetodesignpatterns.command.portoes.Portao;

public class FecharCommand implements Command {
	
	private Portao portao;

	public FecharCommand(Portao portao) {
		this.portao = portao;
	}

	public void execute() {
		portao.fechar();
	}

	public void undo() {
		portao.abrir();
	}
}
