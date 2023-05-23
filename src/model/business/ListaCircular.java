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
public class ListaCircular {

    protected Nodo inicio;
    protected Nodo fin;

    public ListaCircular() {
        this.inicio = this.fin = null;
    }

    //metodo para saber si esta vacia
    public boolean isVacia() {
        return inicio == null;
    }

    /**
     * Cuando se agrega el primer nodo a una lista vacía, se establecen los
     * enlaces siguiente y anterior del nuevo nodo para que apunten al inicio.
     * Cuando se agrega un nodo adicional a una lista no vacía, se actualizan
     * los enlaces siguiente y anterior del inicio y del fin para hacer que la
     * lista sea circular. El enlace siguiente del fin apunta al inicio, y el
     * enlace anterior del inicio apunta al fin. Agrega un elemento y crear una
     * lista Circular
     *
     * @param elemento
     */
    public void add(Estudiante elemento) {
        // Se crea un nuevo nodo con el elemento a agregar
        Nodo nuevoNodo = new Nodo(elemento);

        // Si la lista está vacía, el nuevo nodo se convierte en el inicio y el fin
        if (isVacia()) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
            nuevoNodo.setSiguiente(inicio); // Hacer que el siguiente del nuevo nodo apunte al inicio
            inicio.setAnterior(nuevoNodo); // Hacer que el anterior del inicio apunte al nuevo nodo
        } else {
            // El siguiente del nuevo nodo es el nodo actual de inicio
            nuevoNodo.setSiguiente(inicio);
            inicio.setAnterior(nuevoNodo);
            // El nuevo nodo se convierte en el nuevo inicio
            inicio = nuevoNodo;
            fin.setSiguiente(inicio); // Hacer que el siguiente del fin apunte al nuevo inicio
            inicio.setAnterior(fin); // Hacer que el anterior del inicio apunte al fin
        }
    }

    /**
     * Agrega un elemento al final y crea una lista doble circular Cuando se
     * agrega el primer nodo a una lista vacía, se establecen los enlaces
     * siguiente y anterior del nuevo nodo como null. Cuando se agrega un nodo
     * adicional al final de la lista, se actualizan los enlaces siguiente y
     * anterior del nuevo nodo, el fin y el inicio para hacer que la lista sea
     * circular. El enlace siguiente del fin apunta al inicio, y el enlace
     * anterior del inicio apunta al fin.
     *
     * @param elemento
     */
    public void addEnd(Estudiante elemento) {
        // Se crea un nuevo nodo con el elemento a agregar
        Nodo nuevoNodo = new Nodo(elemento);

        // Si la lista está vacía, el nuevo nodo se convierte en el inicio y el fin
        if (isVacia()) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
            nuevoNodo.setSiguiente(null); // Hacer que el siguiente del nuevo nodo sea null
            nuevoNodo.setAnterior(null); // Hacer que el anterior del nuevo nodo sea null
        } else {
            // El siguiente del nuevo nodo es null, ya que será el último elemento
            nuevoNodo.setSiguiente(null);
            // El nodo actual del fin apunta al nuevo nodo
            fin.setSiguiente(nuevoNodo);
            // El nuevo nodo apunta al nodo actual del fin como anterior
            nuevoNodo.setAnterior(fin);
            // El nuevo nodo se convierte en el nuevo fin
            fin = nuevoNodo;
            fin.setSiguiente(inicio); // Hacer que el siguiente del fin apunte al inicio
            inicio.setAnterior(fin); // Hacer que el anterior del inicio apunte al fin
        }
    }

    // Función auxiliar para imprimir una lista enlazada
    public void printList() {
        Nodo ptr = inicio;
        while (ptr.getSiguiente() != inicio) {
            System.out.println(ptr.getE().toString() + " -> ");
            ptr = ptr.getSiguiente();
        }
        if (ptr != null) {
            System.out.println(ptr.getE().toString() + " -> ");
        }

        System.out.println("NULL");
    }

    public int getTamano() {
        int tamano = 0;
        Nodo actual = inicio;
        while (actual != null && actual.getSiguiente() != inicio) {

            tamano++;
            actual = actual.getSiguiente();
        }
        if (actual != null) {
            tamano++;
        }
        return tamano;
    }

    public void eliminarIdEst(int id) { //Elimina al estudiante con el nombre que recibe como parametro
        boolean borrado = false;
        Nodo ptr = inicio;
        Nodo anterior = null; //Auxiliar para guardar el nodo anterior al actual.
        while (ptr != null) {
            if (ptr.getE().getId() == id) {
                System.out.println("Encontrado"); //Indica que ha encontrado al nodo e imprime sus datos
                System.out.println("\n" + ptr.toString());
                if (anterior != null) //Verifica que el nodo a eliminar no es la cabeza
                {
                    anterior.setSiguiente(ptr.getSiguiente());
                } //Sino lo es, el anterior nodo apunta al nodo que va despues del nodo a eliminar. A diferencia de C,
                //en Java, la gestión de memoria es automática a través del recolector de basura(garbage collector),
                //por lo que no se necesita una función equivalente a free en Java, en teoría.
                else {
                    inicio = ptr.getSiguiente(); //Sino es el nodo que busca, pasa al siguiente
                }
                borrado = true;

                break;
            } else {
                anterior = ptr;
            }
            ptr = ptr.getSiguiente(); //Pasa al siguiente nodo
        }
        if (borrado) {
            System.out.println("El estudiante ha sido eliminado");
        } else {
            System.out.println("El estudiante no existe");
        }
    }

    public void eliminarNameEst(String nombre) { //Elimina al estudiante con el nombre que recibe como parametro
        boolean borrado = false;
        Nodo ptr = inicio;
        Nodo anterior = null; //Auxiliar para guardar el nodo anterior al actual.
        while (ptr != null) {
            if (ptr.getE().getName().equalsIgnoreCase(nombre)) {
                System.out.println("Encontrado"); //Indica que ha encontrado al nodo e imprime sus datos
                System.out.println("\n" + ptr.toString());
                if (anterior != null) //Verifica que el nodo a eliminar no es la cabeza
                {
                    anterior.setSiguiente(ptr.getSiguiente());
                } //Sino lo es, el anterior nodo apunta al nodo que va despues del nodo a eliminar. A diferencia de C,
                //en Java, la gestión de memoria es automática a través del recolector de basura(garbage collector),
                //por lo que no se necesita una función equivalente a free en Java, en teoría.
                else {
                    inicio = ptr.getSiguiente(); //Sino es el nodo que busca, pasa al siguiente
                }
                borrado = true;

                break;
            } else {
                anterior = ptr;
            }
            ptr = ptr.getSiguiente(); //Pasa al siguiente nodo
        }
        if (borrado) {
            System.out.println("El estudiante ha sido eliminado");
        } else {
            System.out.println("El estudiante no existe");
        }
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }

}
