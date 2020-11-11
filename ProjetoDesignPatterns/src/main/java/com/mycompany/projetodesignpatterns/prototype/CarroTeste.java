package com.mycompany.projetodesignpatterns.prototype;

public class CarroTeste {
	public static void main(String[] args) {
		PalioPrototype prototipoPalio = new PalioPrototype();
		prototipoPalio.setValorCompra(15000);
		System.out.println(prototipoPalio.getValorCompra());
		
		CarroPrototype palioNovo = prototipoPalio.clonar();
		System.out.println(palioNovo.getValorCompra());
		palioNovo.setValorCompra(27900.0);
		System.out.println(palioNovo.getValorCompra());
		
		CarroPrototype palioUsado = prototipoPalio.clonar();
		palioUsado.setValorCompra(11000.0);
		
		System.out.println(palioNovo.exibirInfo());
		System.out.println(palioUsado.exibirInfo());
	}
}
