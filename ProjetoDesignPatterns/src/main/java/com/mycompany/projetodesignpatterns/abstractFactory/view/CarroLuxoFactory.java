package com.mycompany.projetodesignpatterns.abstractFactory.view;

import com.mycompany.projetodesignpatterns.abstractFactory.model.Paredao;
import com.mycompany.projetodesignpatterns.abstractFactory.model.Roda;
import com.mycompany.projetodesignpatterns.abstractFactory.model.RodaLigaLeve;
import com.mycompany.projetodesignpatterns.abstractFactory.model.Som;

public class CarroLuxoFactory extends CarroFactory {

	@Override
	public Roda montarRoda() {
		return new RodaLigaLeve();
	}

	@Override
	public Som montarSom() {
		return new Paredao();
	}
}
