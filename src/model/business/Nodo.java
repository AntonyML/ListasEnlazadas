/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.business;

/**
 *
 * @author Tony ML
 */
public class Nodo {

    private Estudiante e;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo() {
    }

    public Nodo(Estudiante e) {
        this.e = e;
        this.siguiente = null; // al crear un nodo el siguiente apunte a nulo
        this.anterior = null; // al crear un nodo el anterior apunte a nulo
    }


    public Nodo(Estudiante e, Nodo siguiente) {
        this.e = e;
        this.siguiente = siguiente;
    }
      public Nodo(Estudiante e, Nodo siguiente, Nodo anterior) {
        this.e = e;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public Estudiante getE() {
        return e;
    }

    public void setE(Estudiante e) {
        this.e = e;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

 

}
