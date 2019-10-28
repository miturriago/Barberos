/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberodurmiente;

import java.io.IOException;

/**
 *
 * @author Mauricio
 */
public class Barberodurmiente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Barberia barberia;
        Barbero barbero;
        Cliente cliente;
        barberia = new Barberia(3);
        cliente = new Cliente(barberia);
        cliente.start();
        barbero = new Barbero(barberia);
        barbero.start();

    }

}
