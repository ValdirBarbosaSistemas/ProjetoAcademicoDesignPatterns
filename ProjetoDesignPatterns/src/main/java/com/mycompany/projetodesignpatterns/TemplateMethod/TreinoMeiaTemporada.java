package com.mycompany.projetodesignpatterns.TemplateMethod;

/**
 *
 * @author valdir-sistemas
 */
public class TreinoMeiaTemporada extends Treino {

    @Override
    void preparoFisico() {
        System.out.println("Preparo Fisico alta intensidade...");
    }

    @Override
    void jogoTreino() {
        System.out.println("Jogo de treino...");
    }

}
