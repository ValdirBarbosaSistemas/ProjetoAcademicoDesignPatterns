package com.mycompany.projetodesignpatterns.composite;

public class Principal {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("João", 3000);
		Aluno a2 = new Aluno("Maria", 2000);
		Aluno a3 = new Aluno("Jose", 1000);

		Turma turmaNova = new Turma("2019");
		turmaNova.adicionarAluno(a1);
		turmaNova.adicionarAluno(a2);
		turmaNova.adicionarAluno(a3);

		// TODO https://www.youtube.com/watch?v=p0YPcMUppg8 (ver assunto/explicacao de composite)
	}
}
