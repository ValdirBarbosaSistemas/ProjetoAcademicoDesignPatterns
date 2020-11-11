package com.mycompany.projetodesignpatterns.ted.tedBuilder;

public class CarroImportado extends CarroBuilder {

	private String somMultimidia;

	public CarroImportado() {
		super();
	}

	public String getSomMultimidia() {
		return this.somMultimidia;
	}

	public void setSomMultimidia(String somMultimidia) {
		this.somMultimidia = somMultimidia;
	}
}
