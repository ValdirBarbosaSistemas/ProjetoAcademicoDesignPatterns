package com.mycompany.projetodesignpatterns.observer;

import java.util.Date;

/**
 *
 * @author valdir-sistemas
 */
public class ChegadaAniversarianteEvent {

    //Essa classe ela devine os dados do evento
    private final Date horaDaChegada;

    public ChegadaAniversarianteEvent(Date horaDaChegada) {
        this.horaDaChegada = horaDaChegada;
    }

    public Date getHoraDaChegada() {
        return horaDaChegada;
    }
}
