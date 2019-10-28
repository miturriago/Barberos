/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberodurmiente;

/**
 *
 * @author Mauricio
 */
import java.lang.Thread;
import java.lang.InterruptedException;

public class Cliente extends Thread {

    Barberia barberia;

    public Cliente(Barberia barberia) {
        this.barberia = barberia;
    }

    public void run() {
        while (true) {
            barberia.llegarCliente();
            System.out.println("llego un cliente");
        }
    }
}
