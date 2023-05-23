package model.business;

public class ListaDoble {

    protected Nodo inicio;
    protected Nodo fin;

    public ListaDoble() {
        this.inicio = this.fin = null;
    }

    public boolean isVacia() {
        return inicio == null;
    }

    public void add(Estudiante elemento) {
        Nodo nuevoNodo = new Nodo(elemento);

        if (isVacia()) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(inicio);
            inicio.setAnterior(nuevoNodo);
            inicio = nuevoNodo;
        }
    }

    public void addEnd(Estudiante elemento) {
        Nodo nuevoNodo = new Nodo(elemento);

        if (isVacia()) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(null);
            nuevoNodo.setAnterior(fin);
            fin.setSiguiente(nuevoNodo);
            fin = nuevoNodo;
        }
    }

    public void printList() {
        Nodo ptr = inicio;
        while (ptr != null) {
            System.out.println(ptr.getE().toString() + " -> ");
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

    public void eliminarIdEst(int id) {
        boolean borrado = false;
        Nodo ptr = inicio;
        Nodo anterior = null;
        while (ptr != null) {
            if (ptr.getE().getId() == id) {
                System.out.println("Encontrado");
                System.out.println("\n" + ptr.toString());
                if (anterior != null) {
                    anterior.setSiguiente(ptr.getSiguiente());
                    if (ptr.getSiguiente() != null) {
                        ptr.getSiguiente().setAnterior(anterior);
                    } else {
                        fin = anterior;
                    }
                } else {
                    inicio = ptr.getSiguiente();
                    if (inicio != null) {
                        inicio.setAnterior(null);
                    } else {
                        fin = null;
                    }
                }
                borrado = true;
                break;
            } else {
                anterior = ptr;
            }
            ptr = ptr.getSiguiente();
        }
        if (borrado) {
            System.out.println("El estudiante ha sido eliminado");
        } else {
            System.out.println("El estudiante no existe");
        }
    }

    public void eliminarNameEst(String nombre) {
        boolean borrado = false;
        Nodo ptr = inicio;
        Nodo anterior = null;
        while (ptr != null) {
            if (ptr.getE().getName().equalsIgnoreCase(nombre)) {
                System.out.println("Encontrado");
                System.out.println("\n" + ptr.toString());
                if (anterior != null) {
                    anterior.setSiguiente(ptr.getSiguiente());
                    if (ptr.getSiguiente() != null) {
                        ptr.getSiguiente().setAnterior(anterior);
                    } else {
                        fin = anterior;
                    }
                } else {
                    inicio = ptr.getSiguiente();
                    if (inicio != null) {
                        inicio.setAnterior(null);
                    } else {
                        fin = null;
                    }
                }
                borrado = true;
                break;
            } else {
                anterior = ptr;
            }
            ptr = ptr.getSiguiente();
        }
        if (borrado) {
            System.out.println("El estudiante ha sido eliminado");
        } else {
            System.out.println("El estudiante no existe");
        }
    }
/////////////////Ordenamiento

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
