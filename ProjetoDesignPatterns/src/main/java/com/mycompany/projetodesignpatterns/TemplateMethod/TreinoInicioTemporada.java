package com.mycompany.projetodesignpatterns.TemplateMethod;

/**
 *
 * @author valdir-sistemas
 */
public class TreinoInicioTemporada extends Treino {

    @Override
    void preparoFisico() {
        System.out.println("Preparo fisico leve...");
    }

    @Override
    void jogoTreino() {
        System.out.println("Jogo treino para inicio de temporada...");
    }

}
