package com.mycompany.projetodesignpatterns.factoryMethod;

public class FactoryShape {

	// Construtor vazio
	public FactoryShape() {

	}

	/*
	 * Método que vai implementar a construção do objeto através do getShape, ou
	 * seja, é aqui que vai estar a implementação de criar o objeto. Dessa forma
	 * estou centralizando a criação do objeto nessa classe (FACTORY METHOD).
	 */
	public Shape getShape(String tipo) {
		if (tipo.equals("retangulo"))
			return new Rectangle("retangulo");
		else if (tipo.equals("poligono"))
			return new Polygon("poligono");
		else if (tipo.equals("circulo"))
			return new Circle("circulo");
		else
			return null;
	}
}
