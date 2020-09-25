package com.mycompany.projetodesignpatterns.ted.tedFactoryMethod;

/**
 * @author valdir-sistemas
 *
 */
public class FactoryUsuario extends Usuarios {

	// Construtor vazio
	public FactoryUsuario() {
		super();
	}

	// Métodos que irão ser implementados
	public Usuarios getSexo(String genero) {
		if (genero.equals("Masculino"))
			return new Masculino();
		else if (genero.equals("Feminino"))
			return new Feminino();
		else if (genero.equals("Indeciso"))
			return new Indeciso();
		return null;
	}
}
