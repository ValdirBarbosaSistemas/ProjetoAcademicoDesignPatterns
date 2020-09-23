package com.mycompany.projetodesignpatterns.ted.tedFactoryMethod;

/**
 * @author valdir-sistemas
 *
 */
public class FactoryUsuario {

	// Construtor vazio
	public FactoryUsuario() {

	}

	// Métodos que irão ser implementados
	public Usuarios getSexo(String tipo) {
		if(tipo.equals("Masculino"))
			return new Masculino("Masculino");
		else if(tipo.equals("Feminino"))
			return new Feminino(nome, genero);
		else
			return new Usuarios();
		
		//TODO VER DE OUTRA FORMA
	}
}
