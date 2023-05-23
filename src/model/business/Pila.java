/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.business;

import javax.swing.JOptionPane;

/**
 * Clase Pila para almacenar y manipular elementos en una estructura de pila.
 * Implementa operaciones como push (agregar elemento), pop (eliminar elemento) y otras funciones auxiliares.
 *
 * @author Tony ML
 */
public class Pila {

    protected Nodo top; // Nodo superior de la pila
    protected Nodo base; // Nodo base de la pila
    protected Nodo aux; // Nodo auxiliar para operaciones

    /**
     * Constructor de la clase Pila.
     * Inicializa la pila con los nodos top y base en null.
     */
    public Pila() {
        this.top = this.base = null;
    }

    /**
     * Verifica si la pila está vacía.
     *
     * @return true si la pila está vacía, false en caso contrario.
     */
    public boolean isEmpty() {
        return base == null;
    }

    /**
     * Agrega un elemento a la pila.
     *
     * @param elemento El elemento a agregar.
     */
    public void push(Estudiante elemento) {
        // Se crea un nuevo nodo con el elemento a agregar
        Nodo nuevoNodo = new Nodo(elemento);

        // Si la pila está vacía, el nuevo nodo se convierte en el top y la base de la pila
        if (isEmpty()) {
            top = nuevoNodo;
            base = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(top);
            top = nuevoNodo;
        }
    }

    /**
     * Obtiene el nodo superior (top) de la pila.
     *
     * @return El nodo superior de la pila.
     */
    public Nodo top() {
        if (top != null) {
            return top;
        } else {
            JOptionPane.showMessageDialog(null, "No hay tope");
            return null;
        }
    }

    /**
     * Elimina un elemento de la pila.
     *
     * @return El nodo eliminado de la pila.
     */
    public Nodo pop() {
        // Si la pila está vacía, muestra un mensaje y retorna null
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "NO HAY DATOS QUE BORRAR");
            return null;
        } else {
            aux = top;
            top = top.getSiguiente();
            return aux;
        }
    }

    /**
     * Imprime los elementos de la pila.
     */
    public void printList() {
        Nodo ptr = top;
        while (ptr != null) {
            System.out.print(ptr.getE().toString() + " -> ");
            ptr = ptr.getSiguiente();
        }
        System.out.println("NULL");
    }

    /**
     * Obtiene el tamaño de la pila.
     *
     * @return El tamaño de la pila.
     */
    public int getTamano() {
        int tamano = 0;
        Nodo actual = top;
        while (actual != null) {
            tamano++;
            actual = actual.getSiguiente();
        }
        return tamano;
    }

    /**
     * Obtiene el nodo superior (top) de la pila.
     *
     * @return El nodo superior de la pila.
     */
    public Nodo getTop() {
        return top;
    }

    /**
     * Establece el nodo superior (top) de la pila.
     *
     * @param top El nodo a establecer como top de la pila.
     */
    public void setTop(Nodo top) {
        this.top = top;
    }

    /**
     * Obtiene el nodo base de la pila.
     *
     * @return El nodo base de la pila.
     */
    public Nodo getBase() {
        return base;
    }

    /**
     * Establece el nodo base de la pila.
     *
     * @param base El nodo a establecer como base de la pila.
     */
    public void setBase(Nodo base) {
        this.base = base;
    }

    /**
     * Obtiene el nodo auxiliar de la pila.
     *
     * @return El nodo auxiliar de la pila.
     */
    public Nodo getAux() {
        return aux;
    }

    /**
     * Establece el nodo auxiliar de la pila.
     *
     * @param aux El nodo a establecer como auxiliar de la pila.
     */
    public void setAux(Nodo aux) {
        this.aux = aux;
    }

}
