package com.mycompany.projetodesignpatterns.prototype;

public abstract class CarroPrototype {

	protected double valorCompra;

	public CarroPrototype() {

	}

	public abstract String exibirInfo();

	public abstract CarroPrototype clonar();

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
}
