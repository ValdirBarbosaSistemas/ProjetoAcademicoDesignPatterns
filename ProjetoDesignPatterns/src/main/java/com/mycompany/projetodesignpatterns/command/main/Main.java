package com.mycompany.projetodesignpatterns.command.main;

import com.mycompany.projetodesignpatterns.command.commands.AbrirCommand;
import com.mycompany.projetodesignpatterns.command.commands.Command;
import com.mycompany.projetodesignpatterns.command.commands.FecharCommand;
import com.mycompany.projetodesignpatterns.command.controller.Controle;
import com.mycompany.projetodesignpatterns.command.portoes.Portao;

public class Main {
	public static void main(String[] args) {
		Portao portao = new Portao();

		Command abrirCommand = new AbrirCommand(portao);
		Command fecharCommand = new FecharCommand(portao);

		Controle controle = new Controle(abrirCommand, fecharCommand);

		controle.abrirPortao();

		controle.fecharPortao();

		controle.desfazer();
	}

}
