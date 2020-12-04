package com.mycompany.projetodesignpatterns.observer;

/**
 *
 * @author valdir-sistemas
 */
public class Namorada implements ChegadaAniversarianteObserver {

    @Override
    public void chegou(ChegadaAniversarianteEvent event) {
        System.out.println("Apagar as luzes...");
        System.out.println("Fazer silencio...");
        System.out.println("SURPRESAAAAA!!!!");
    }

}
