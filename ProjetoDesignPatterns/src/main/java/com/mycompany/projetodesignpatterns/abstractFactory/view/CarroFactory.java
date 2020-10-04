package com.mycompany.projetodesignpatterns.abstractFactory.view;

import com.mycompany.projetodesignpatterns.abstractFactory.model.Roda;
import com.mycompany.projetodesignpatterns.abstractFactory.model.Som;

public abstract class CarroFactory {

	public abstract Roda montarRoda();

	public abstract Som montarSom();
}
