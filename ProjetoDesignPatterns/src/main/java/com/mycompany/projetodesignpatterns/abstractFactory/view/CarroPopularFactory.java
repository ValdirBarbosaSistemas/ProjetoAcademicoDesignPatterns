package com.mycompany.projetodesignpatterns.abstractFactory.view;

import com.mycompany.projetodesignpatterns.abstractFactory.model.CdPlayer;
import com.mycompany.projetodesignpatterns.abstractFactory.model.Roda;
import com.mycompany.projetodesignpatterns.abstractFactory.model.RodaSimples;
import com.mycompany.projetodesignpatterns.abstractFactory.model.Som;

public class CarroPopularFactory extends CarroFactory {

	@Override
	public Roda montarRoda() {
		return new RodaSimples();
	}

	@Override
	public Som montarSom() {
		return new CdPlayer();
	}

}
