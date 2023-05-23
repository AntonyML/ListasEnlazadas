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
public class ListaSimple {

    protected Nodo inicio;
    protected Nodo fin;

    public ListaSimple() {
        this.inicio = this.fin = null;
    }

    //metodo para saber si esta vacia
    public boolean isVacia() {
        return inicio == null;
    }

    /**
     *
     * Agrega un elemento ala lista.
     *
     * @param elemento
     */
    public void agregar(Estudiante elemento) {
        // Se crea un nuevo nodo con el elemento a agregar
        Nodo nuevoNodo = new Nodo(elemento);

        // Si la lista está vacía, el nuevo nodo se convierte en el inicio
        if (isVacia()) {
            inicio = nuevoNodo;
            fin = nuevoNodo; // El nuevo nodo se convierte en el nuevo nodo final
        } else {
            nuevoNodo.setSiguiente(inicio);
            inicio = nuevoNodo;
        }

    }

    /**
     *
     * Agrega un elemento al final de la lista.
     *
     * @param elemento
     */
    public void agregarAlFinal(Estudiante elemento) {
        // Se crea un nuevo nodo con el elemento a agregar
        Nodo nuevoNodo = new Nodo(elemento);

        // Si la lista está vacía, el nuevo nodo se convierte en el inicio
        if (isVacia()) {
            inicio = nuevoNodo;
        } // Si la lista no está vacía, el nodo final actual apunta al nuevo nodo y
        //éste se convierte en el nuevo nodo final
        else {
            fin.setSiguiente(nuevoNodo);
        }

        fin = nuevoNodo; // El nuevo nodo se convierte en el nuevo nodo final
    }

    // Función auxiliar para imprimir una lista enlazada
    public void printList() {
        Nodo ptr = inicio;
        while (ptr != null) {
            System.out.print(ptr.getE().toString() + " -> ");
            ptr = ptr.getSiguiente();
        }

        System.out.println("NULL");
    }

    public int getTamano() {
        int tamano = 0;
        Nodo actual = inicio;
        while (actual != null) {
            tamano++;
            actual = actual.getSiguiente();
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
////////////////////////// Ordenamiento

     public void ordenarBurbuja_MayoraMenor() {
        if (isVacia() || inicio.getSiguiente() == null) {
            // La lista está vacía o solo tiene un elemento, no hay nada que ordenar
            return;
        }

        int tamano = getTamano();
        for (int i = 0; i < tamano - 1; i++) {
            Nodo actual = inicio;
            Nodo siguiente = actual.getSiguiente();

            for (int j = 0; j < tamano - i - 1; j++) {
                if (actual.getE().compareTo(siguiente.getE()) < 0) {
                    // Los elementos están en orden incorrecto, se realiza el intercambio
                    Estudiante temp = actual.getE();
                    actual.setE(siguiente.getE());
                    siguiente.setE(temp);
                }

                actual = siguiente;
                siguiente = siguiente.getSiguiente();
            }
        }
    }

    public void ordenarBurbuja_MenoraMayor() {
        if (isVacia() || inicio.getSiguiente() == null) {
            // La lista está vacía o solo tiene un elemento, no hay nada que ordenar
            return;
        }

        int tamano = getTamano();
        for (int i = 0; i < tamano - 1; i++) {
            Nodo actual = inicio;
            Nodo siguiente = actual.getSiguiente();

            for (int j = 0; j < tamano - i - 1; j++) {
                if (actual.getE().compareTo(siguiente.getE()) > 0) {
                    // Los elementos están en orden incorrecto, se realiza el intercambio
                    Estudiante temp = actual.getE();
                    actual.setE(siguiente.getE());
                    siguiente.setE(temp);
                }

                actual = siguiente;
                siguiente = siguiente.getSiguiente();
            }
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
