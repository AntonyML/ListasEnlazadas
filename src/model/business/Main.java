/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.business;

import model.gui_menu.Menu;

/**
 *
 * @author Tony ML
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaSimple l = new ListaSimple();
        ListaDoble ld = new ListaDoble();
        ListaCircular lC = new ListaCircular();
        
        Pila p = new Pila();
        Cola c = new Cola();

        Estudiante e = new Estudiante(0, "tony", true, "info", 0);
        Estudiante e1 = new Estudiante(1, "marta", true, "info", 0);
        Estudiante e2 = new Estudiante(2, "julio", true, "info", 0);

        c.enqueue(e);
        c.enqueue(e1);
        c.enqueue(e2);

        c.printList();
 
        
        Menu menu = new Menu(l, ld, lC, p, c);

    }

}
