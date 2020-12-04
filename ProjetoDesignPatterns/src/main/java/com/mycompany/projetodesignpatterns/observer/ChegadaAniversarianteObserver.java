package com.mycompany.projetodesignpatterns.observer;

/**
 *
 * @author valdir-sistemas
 */
public interface ChegadaAniversarianteObserver {

    //Toda a classe que precisar terá que implementar essa interface
    public void chegou(ChegadaAniversarianteEvent event);
}
