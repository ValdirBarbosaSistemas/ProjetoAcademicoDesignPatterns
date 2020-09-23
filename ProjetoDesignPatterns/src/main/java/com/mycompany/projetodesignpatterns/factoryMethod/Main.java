package com.mycompany.projetodesignpatterns.factoryMethod;

public class Main {
	public static void main(String[] args) {
		FactoryShape fabrica = new FactoryShape();
		Shape sh = fabrica.getShape("circulo");

		System.out.println(sh.draw());
	}
}
