package com.mycompany.projetodesignpatterns.observer;

/**
 *
 * @author valdir-sistemas
 */
public class AniversarioSurpresa {

    public static void main(String[] args) {
        Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();

        porteiro.addChegadaAniversarianteObserver(namorada); //Aqui estamos colocando a namorada para ser avisada sobre o evento

        porteiro.start(); //Aqui o porteira ta de "vigia" para ver se o rapaz vai chegar e avisar a namorada

    }
}
