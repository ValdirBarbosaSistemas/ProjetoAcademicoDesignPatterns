package com.mycompany.projetodesignpatterns.TemplateMethod.view;

import com.mycompany.projetodesignpatterns.TemplateMethod.model.PrimeiraCasa;
import com.mycompany.projetodesignpatterns.TemplateMethod.model.SegundaCasa;
import com.mycompany.projetodesignpatterns.TemplateMethod.model.TerceiraCasa;

public class Cliente {
	public static void main(String[] args) {
		System.out.println("PRIMEIRA CASA");
		PrimeiraCasa pc = new PrimeiraCasa();
		pc.construcaoBasica();

		System.out.println("SEGUNDA CASA");
		SegundaCasa sc = new SegundaCasa();
		sc.construcaoBasica();

		System.out.println("TERCEIRA CASA");
		TerceiraCasa tc = new TerceiraCasa();
		tc.construcaoBasica();
	}
}
