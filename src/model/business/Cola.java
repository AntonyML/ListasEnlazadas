/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.business;

import javax.swing.JOptionPane;

/**
 *
 * @author Tony ML
 */
public class Cola {

    protected Nodo front; //frente
    protected Nodo rear; //trasero
    protected Nodo aux;

    public Cola() {
        this.front = this.rear = null;
    }

    //metodo para saber si esta vacia
    public boolean isEmpty() {
        return front == null;
    }

    /**
     * Agrega un elemento a la cola.
     *
     * @param elemento El elemento a agregar.
     */
    public void enqueue(Estudiante elemento) {
        // Se crea un nuevo nodo con el elemento a agregar
        Nodo nuevoNodo = new Nodo(elemento);

        // Si la cola está vacía, el nuevo nodo se convierte en el frente y el trasero
        if (isEmpty()) {
            front = nuevoNodo;
            rear = nuevoNodo;
        } else {
            rear.setSiguiente(nuevoNodo);
            rear = nuevoNodo;
        }
    }

    /**
     * Elimina un elemento de la cola.
     *
     * @return El nodo eliminado.
     */
    public Nodo dequeue() {
        // Si la cola está vacía, muestra un mensaje y retorna null
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "NO HAY DATOS QUE BORRAR");
            return null;
        } else {
            aux = front;
            front = front.getSiguiente();
            // Si después de eliminar el nodo, la cola queda vacía, también actualizamos el puntero rear
            if (front == null) {
                rear = null;
            }
            return aux;
        }
    }

    // Función auxiliar para imprimir una lista enlazada
    public void printList() {
        Nodo ptr = front;
        while (ptr != null) {
            System.out.print(ptr.getE().toString() + " -> ");
            ptr = ptr.getSiguiente();
        }

        System.out.println("NULL");
    }

    public int getTamano() {
        int tamano = 0;
        Nodo actual = front;
        while (actual != null) {
            tamano++;
            actual = actual.getSiguiente();
        }
        return tamano;
    }

    public Nodo getInicio() {
        return front;
    }

    public void setInicio(Nodo inicio) {
        this.front = inicio;
    }

    public Nodo getFin() {
        return rear;
    }

    public void setFin(Nodo fin) {
        this.rear = fin;
    }

    public Nodo getFront() {
        return front;
    }

    public void setFront(Nodo front) {
        this.front = front;
    }

    public Nodo getRear() {
        return rear;
    }

    public void setRear(Nodo rear) {
        this.rear = rear;
    }

    public Nodo getAux() {
        return aux;
    }

    public void setAux(Nodo aux) {
        this.aux = aux;
    }

}
