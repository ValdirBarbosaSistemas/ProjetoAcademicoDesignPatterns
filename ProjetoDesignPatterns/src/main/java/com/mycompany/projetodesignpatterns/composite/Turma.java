package com.mycompany.projetodesignpatterns.composite;

import java.util.ArrayList;

/**
 * @author valdir-sistemas
 */
public class Turma {

	private String idTurma;
	private ArrayList<Aluno> listaAluno;

	public Turma(String idTurma) {
		this.idTurma = idTurma;
		listaAluno = new ArrayList<Aluno>();
	}

	public void adicionarAluno(Aluno alunoNovo) {
		listaAluno.add(alunoNovo);
	}

	public void removerAluno(Aluno alunoRemovido) {
		listaAluno.remove(alunoRemovido);
	}

	public ArrayList<Aluno> getListaAluno() {
		return listaAluno;
	}

	public String getIdTurma() {
		return this.idTurma;
	}

}
