package com.mycompany.projetodesignpatterns.TemplateMethod;

/**
 *
 * @author valdir-sistemas
 */
public abstract class Treino {

    final void treinoDiario() {
        preparoFisico();
        jogoTreino();
        treinoTatico();
    }

    abstract void preparoFisico();

    abstract void jogoTreino();

    final void treinoTatico() {
        System.out.println("Treino tatico!!!");
    }
}
