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
	public Usuarios getSexo(String genero) {
		if(genero.equals("Masculino"))
			return new Masculino();
		else if(genero.equals("Feminino"))
			return new Feminino();
		else
			return new Usuarios();
		
		//TODO VER DE OUTRA FORMA
	}
}
