package com.mycompany.projetodesignpatterns.ted.tedBuilder;

public class CarroBuilder {

	private String roda;
	private String tipo;

	public CarroBuilder() {

	}

	public CarroBuilder(String roda, String tipo) {
		this.roda = roda;
		this.tipo = tipo;
	}

	public String getRoda() {
		return this.roda;
	}

	public void setRoda(String roda) {
		this.roda = roda;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
