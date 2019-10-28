/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberodurmiente;

import java.lang.InterruptedException;

/**
 *
 * @author Mauricio
 */
public class Barberia {

    int contador;

    public Barberia(int contador) {
        this.contador = contador;
    }

    public synchronized void atenderCliente() {
        if (contador == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            contador++;
        } else if (contador > 0) {
            notify();
        }

    }

    public synchronized void llegarCliente() {
        int copia = contador;
        if (contador == copia) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            contador--;
        } else if (contador < copia) {
            notify();
        }
    }

}
