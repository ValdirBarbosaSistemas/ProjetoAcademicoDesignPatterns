package com.mycompany.projetodesignpatterns.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author valdir-sistemas
 */
public class Porteiro extends Thread {

    //Criando uma lista de observers
    private List<ChegadaAniversarianteObserver> observers = new ArrayList<ChegadaAniversarianteObserver>();

    //adicionando na lista
    public void addChegadaAniversarianteObserver(ChegadaAniversarianteObserver observer) {
        this.observers.add(observer);
    }

    //É ele que vai detectar o evento e repassar a informação ao interessado
    @Override
    public void run() {
        //Simular os eventos com o teclado
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int valor = scanner.nextInt();

            if (valor == 1) {
                ChegadaAniversarianteEvent event = new ChegadaAniversarianteEvent(new Date());

                //Notificar os observadores que o evento ocorreu
                for (ChegadaAniversarianteObserver observer : this.observers) {
                    observer.chegou(event);
                }
            } else {
                System.out.println("Alarme falso");
            }
        }
    }
}
