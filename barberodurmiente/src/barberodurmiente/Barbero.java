/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberodurmiente;

import java.lang.Thread;
import java.lang.InterruptedException;
/**
 *
 * @author Mauricio
 */
public class Barbero extends Thread {

    Barberia barberia;

    public Barbero(Barberia barberia) {
        this.barberia = barberia;
    }

    public void run() {
        while (true) { 
            barberia.atenderCliente();
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Atendio a un cliente");
        }
    }
}
