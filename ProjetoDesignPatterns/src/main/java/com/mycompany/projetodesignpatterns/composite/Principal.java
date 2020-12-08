package com.mycompany.projetodesignpatterns.composite;

public class Principal {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("João", 3000); // Criação do aluno
		Aluno a2 = new Aluno("Maria", 2000);
		Aluno a3 = new Aluno("Jose", 1000);

		Turma turmaNova = new Turma("2019"); // Incluindo na turma
		turmaNova.adicionarAluno(a1);
		turmaNova.adicionarAluno(a2);
		turmaNova.adicionarAluno(a3);

		Aluno a4 = new Aluno("Pedro", 4000);
		Aluno a5 = new Aluno("Lucas", 5000);

		turmaNova.adicionarAluno(a4); // Adicionando novos alunos
		turmaNova.adicionarAluno(a5);

		turmaNova.removerAluno(a1); // Removendo os alunos
		turmaNova.removerAluno(a2);
		
		System.out.println("Alunos da turma " + turmaNova.getIdTurma());
		
		for (Aluno alunos : turmaNova.getListaAluno()) {
			System.out.println(alunos.getNome() + " " + alunos.getMatricula());
		}
	}
}
