package com.mycompany.projetodesignpatterns.command.commands;

public interface Command {

	public void execute();

	public void undo(); // Opção de refazer uma operacao
}
