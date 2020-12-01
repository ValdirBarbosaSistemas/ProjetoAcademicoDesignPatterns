package com.mycompany.projetodesignpatterns.adapter.visao;

import com.mycompany.projetodesignpatterns.adapter.model.Adaptador;
import com.mycompany.projetodesignpatterns.adapter.model.Alvo;

public class AdapterDemo {

	public static void main(String[] args) {
		Alvo contrato = new Adaptador();
		contrato.operacao();

	}
}
