package com.mycompany.projetodesignpatterns.ted.tedBuilder;

public class CarroHatch extends CarroBuilder {

	private String som;

	public CarroHatch() {
		super();
	}

	public String getSom() {
		return this.som;
	}

	public void setSom(String som) {
		this.som = som;
	}
	
	@Override
	public String toString() {
		return "CarroHatch: [" + this.getRoda() + this.som + this.getTipo() + "]";
	}

	
}
