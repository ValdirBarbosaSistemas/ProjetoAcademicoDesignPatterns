package com.mycompany.projetodesignpatterns.singleton.model;

public class SingletonObject {

	/*
	 * Garantir que UMA CLASSE só tenha UMA ÚNICA INSTÂNCIA, e prover um ponto de
	 * acesso global a ela. A cada criação de objeto, voce cria um novo endereço de
	 * memória em cada um deles por padrão, porém, quando é no singleton, voce cria
	 * vários objetos NO MESMO ENDEREÇO DE MEMÓRIA. OBS: GARANTIR QUE APENAS UM
	 * OBJETO EXISTA, INDEPENDENTEMENTE DO NÚMERO DE REQUISIÇÕES QUE ELE RECEBER
	 * QUANDO CRIÁ-LO. (FORMAS DE GARANTIR QUE APENAS UM OBJETO EXISTA)
	 */
	
	// Declaração de uma variável
	private int estoque = 10;

	// criação de um atributo do mesmo tipo da classe ESTÁTICO e instanciando o
	// mesmo
	private static SingletonObject instance = new SingletonObject();

	// Construtor nunca será público
	private SingletonObject() {
		System.out.println("Construtor de classe SingletonObject");
	}

	// Implementar metodo getInstance ESTÁTICO
	public static SingletonObject getInstance() {
		if (instance == null)
			instance = new SingletonObject(); // Outra maneira de instanciar é pelo método 'getIsntance'
		return instance;
	}

	public int getEstoque() {
		return this.estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}
}
