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
public class Logic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    //estudiantes Ramdon
    public ListaSimple addRamdonStudentLSimple(ListaSimple l, int tamano) {

        for (int i = 1; i <= tamano; i++) {
            int id = i;
            String name = "Estudiante" + i;
            boolean state = Math.random() < 0.5;
            String carrera = "Carrera" + (int) (Math.random() * 10 + 1);
            int edad = (int) (Math.random() * 10 + 18);
            Estudiante e = new Estudiante(id, name, state, carrera, edad);
            l.agregarAlFinal(e);
        }

        // l.printList();
        return l;
    }
        //estudiantes Ramdon
    public Cola addRamdonStudentCola(Cola l, int tamano) {

        for (int i = 1; i <= tamano; i++) {
            int id = i;
            String name = "Estudiante" + i;
            boolean state = Math.random() < 0.5;
            String carrera = "Carrera" + (int) (Math.random() * 10 + 1);
            int edad = (int) (Math.random() * 10 + 18);
            Estudiante e = new Estudiante(id, name, state, carrera, edad);
            l.enqueue(e);
        }

        // l.printList();
        return l;
    }
      //estudiantes Ramdon
    public Pila addRamdonStudentPila(Pila p, int tamano) {

        for (int i = 1; i <= tamano; i++) {
            int id = i;
            String name = "Estudiante" + i;
            boolean state = Math.random() < 0.5;
            String carrera = "Carrera" + (int) (Math.random() * 10 + 1);
            int edad = (int) (Math.random() * 10 + 18);
            Estudiante e = new Estudiante(id, name, state, carrera, edad);
            p.push(e);
        }

        // l.printList();
        return p;
    }
    //estudiantes Ramdon
    public ListaCircular addRamdonStudentLCircular(ListaCircular l, int tamano) {

        for (int i = 1; i <= tamano; i++) {
            int id = i;
            String name = "Estudiante" + i;
            boolean state = Math.random() < 0.5;
            String carrera = "Carrera" + (int) (Math.random() * 10 + 1);
            int edad = (int) (Math.random() * 10 + 18);
            Estudiante e = new Estudiante(id, name, state, carrera, edad);
            l.add(e);
        }

        // l.printList();
        return l;
    }
    //estudiantes Ramdon
    public ListaDoble addRamdonStudentLDouble(ListaDoble l, int tamano) {

        for (int i = 1; i <= tamano; i++) {
            int id = i;
            String name = "Estudiante" + i;
            boolean state = Math.random() < 0.5;
            String carrera = "Carrera" + (int) (Math.random() * 10 + 1);
            int edad = (int) (Math.random() * 10 + 18);
            Estudiante e = new Estudiante(id, name, state, carrera, edad);
            l.add(e);
        }

        // l.printList();
        return l;
    }
//agregar la información de cada estudiante en una matriz de objetos

    public Object[][] convertirMatrizMostrarAllDataListaSimple(ListaSimple lista) {
        int size = lista.getTamano();
        Object[][] matriz = new Object[size][5]; // La matriz tendrá 5 columnas para los datos de cada estudiante

        Nodo actual = lista.getInicio();
        int i = 0;
        while (actual != null) {
            Estudiante estudiante = actual.getE();

            matriz[i][0] = estudiante.getId();
            matriz[i][1] = estudiante.getName();
            matriz[i][2] = estudiante.isState();
            matriz[i][3] = estudiante.getCarrera();
            matriz[i][4] = estudiante.getEdad();

            actual = actual.getSiguiente();
            i++;
        }

        return matriz;
    }
    //agregar la información de cada estudiante en una matriz de objetos

    public Object[][] convertirMatrizMostrarAllDataCola(Cola lista) {
        int size = lista.getTamano();
        Object[][] matriz = new Object[size][5]; // La matriz tendrá 5 columnas para los datos de cada estudiante

        Nodo actual = lista.getInicio();
        int i = 0;
        while (actual != null) {
            Estudiante estudiante = actual.getE();

            matriz[i][0] = estudiante.getId();
            matriz[i][1] = estudiante.getName();
            matriz[i][2] = estudiante.isState();
            matriz[i][3] = estudiante.getCarrera();
            matriz[i][4] = estudiante.getEdad();

            actual = actual.getSiguiente();
            i++;
        }

        return matriz;
    }
public Object[][] convertirMatrizMostrarAllDataPila(Pila p) {
        int size = p.getTamano();
        Object[][] matriz = new Object[size][5]; // La matriz tendrá 5 columnas para los datos de cada estudiante

        Nodo actual = p.top();
        int i = 0;
        while (actual != null) {
            Estudiante estudiante = actual.getE();

            matriz[i][0] = estudiante.getId();
            matriz[i][1] = estudiante.getName();
            matriz[i][2] = estudiante.isState();
            matriz[i][3] = estudiante.getCarrera();
            matriz[i][4] = estudiante.getEdad();

            actual = actual.getSiguiente();
            i++;
        }

        return matriz;
    }
    public Object[][] convertirMatrizMostrarAllDataLDoble(ListaDoble lista) {
        int size = lista.getTamano();
        Object[][] matriz = new Object[size][5]; // La matriz tendrá 5 columnas para los datos de cada estudiante

        Nodo actual = lista.getInicio();
        int i = 0;
        while (actual != null) {
            Estudiante estudiante = actual.getE();

            matriz[i][0] = estudiante.getId();
            matriz[i][1] = estudiante.getName();
            matriz[i][2] = estudiante.isState();
            matriz[i][3] = estudiante.getCarrera();
            matriz[i][4] = estudiante.getEdad();

            actual = actual.getSiguiente();
            i++;
        }

        return matriz;
    }

    public Object[][] convertirMatrizMostrarAllDataLCircular(ListaCircular lista) {

        int size = lista.getTamano();
        Object[][] matriz = new Object[size][5]; // La matriz tendrá 5 columnas para los datos de cada estudiante

        Nodo actual = lista.getInicio();
        int i = 0;

        while (actual != null &&actual.getSiguiente() != lista.getInicio()) {

            Estudiante estudiante = actual.getE();

            matriz[i][0] = estudiante.getId();
            matriz[i][1] = estudiante.getName();
            matriz[i][2] = estudiante.isState();
            matriz[i][3] = estudiante.getCarrera();
            matriz[i][4] = estudiante.getEdad();

            actual = actual.getSiguiente();
            i++;
        }
        if (actual != null) {
            Estudiante estudiante = actual.getE();

            matriz[i][0] = estudiante.getId();
            matriz[i][1] = estudiante.getName();
            matriz[i][2] = estudiante.isState();
            matriz[i][3] = estudiante.getCarrera();
            matriz[i][4] = estudiante.getEdad();

        }

        return matriz;
    }

    public Object[][] buscarporID_LSimple(ListaSimple lista, int id) {
        int size = lista.getTamano();
        Object[][] matriz = new Object[size][5]; // La matriz tendrá 5 columnas para los datos de cada estudiante
        boolean encontrado = true; // condicion para parar de buscar
        Nodo actual = lista.getInicio();
        int i = 0;
        while (actual != null && encontrado) {

            if (actual.getE().getId() == id && encontrado) {
                Estudiante estudiante = actual.getE();
                matriz[i][0] = estudiante.getId();
                matriz[i][1] = estudiante.getName();
                matriz[i][2] = estudiante.isState();
                matriz[i][3] = estudiante.getCarrera();
                matriz[i][4] = estudiante.getEdad();
                encontrado = false;
            }
            actual = actual.getSiguiente();

        }

        return matriz;
    }
    
    public Object[][] buscarporID_Pila(Pila lista, int id) {
        int size = lista.getTamano();
        Object[][] matriz = new Object[size][5]; // La matriz tendrá 5 columnas para los datos de cada estudiante
        boolean encontrado = true; // condicion para parar de buscar
        Nodo actual = lista.getTop();
        int i = 0;
        while (actual != null && encontrado) {

            if (actual.getE().getId() == id && encontrado) {
                Estudiante estudiante = actual.getE();
                matriz[i][0] = estudiante.getId();
                matriz[i][1] = estudiante.getName();
                matriz[i][2] = estudiante.isState();
                matriz[i][3] = estudiante.getCarrera();
                matriz[i][4] = estudiante.getEdad();
                encontrado = false;
            }
            actual = actual.getSiguiente();

        }

        return matriz;
    }
public Object[][] buscarporID_Cola(Cola lista, int id) {
        int size = lista.getTamano();
        Object[][] matriz = new Object[size][5]; // La matriz tendrá 5 columnas para los datos de cada estudiante
        boolean encontrado = true; // condicion para parar de buscar
        Nodo actual = lista.getInicio();
        int i = 0;
        while (actual != null && encontrado) {

            if (actual.getE().getId() == id && encontrado) {
                Estudiante estudiante = actual.getE();
                matriz[i][0] = estudiante.getId();
                matriz[i][1] = estudiante.getName();
                matriz[i][2] = estudiante.isState();
                matriz[i][3] = estudiante.getCarrera();
                matriz[i][4] = estudiante.getEdad();
                encontrado = false;
            }
            actual = actual.getSiguiente();

        }

        return matriz;
    }
    public Object[][] buscarporID_LCircular(ListaCircular lista, int id) {
        int size = lista.getTamano();
        Object[][] matriz = new Object[size][5]; // La matriz tendrá 5 columnas para los datos de cada estudiante
        boolean encontrado = true; // condicion para parar de buscar
        Nodo actual = lista.getInicio();
        int i = 0;
        while (actual != null && encontrado) {

            if (actual.getE().getId() == id && encontrado) {
                Estudiante estudiante = actual.getE();
                matriz[i][0] = estudiante.getId();
                matriz[i][1] = estudiante.getName();
                matriz[i][2] = estudiante.isState();
                matriz[i][3] = estudiante.getCarrera();
                matriz[i][4] = estudiante.getEdad();
                encontrado = false;
            }
            actual = actual.getSiguiente();

        }

        return matriz;
    }

    public Object[][] buscarporID_LDouble(ListaDoble lista, int id) {
        int size = lista.getTamano();
        Object[][] matriz = new Object[size][5]; // La matriz tendrá 5 columnas para los datos de cada estudiante
        boolean encontrado = true; // condicion para parar de buscar
        Nodo actual = lista.getInicio();
        int i = 0;
        while (actual != null && encontrado) {

            if (actual.getE().getId() == id && encontrado) {
                Estudiante estudiante = actual.getE();
                matriz[i][0] = estudiante.getId();
                matriz[i][1] = estudiante.getName();
                matriz[i][2] = estudiante.isState();
                matriz[i][3] = estudiante.getCarrera();
                matriz[i][4] = estudiante.getEdad();
                encontrado = false;
            }
            actual = actual.getSiguiente();

        }

        return matriz;
    }

    public Object[][] buscarporPosicionLSimple(ListaSimple lista, int posicion) {
        int size = lista.getTamano();
        Object[][] matriz = new Object[size][5]; // La matriz tendrá 5 columnas para los datos de cada estudiante
        boolean encontrado = true; // condicion para parar de buscar
        Nodo actual = lista.getInicio();
        int i = 0;
        while (actual != null && encontrado) {

            if (i == posicion && encontrado) {
                Estudiante estudiante = actual.getE();
                matriz[0][0] = estudiante.getId();
                matriz[0][1] = estudiante.getName();
                matriz[0][2] = estudiante.isState();
                matriz[0][3] = estudiante.getCarrera();
                matriz[0][4] = estudiante.getEdad();
                encontrado = false;
            }
            actual = actual.getSiguiente();
            i++;
        }

        return matriz;
    }
    public Object[][] buscarporPosicionPila(Pila lista, int posicion) {
        int size = lista.getTamano();
        Object[][] matriz = new Object[size][5]; // La matriz tendrá 5 columnas para los datos de cada estudiante
        boolean encontrado = true; // condicion para parar de buscar
        Nodo actual = lista.getTop();
        int i = 0;
        while (actual != null && encontrado) {

            if (i == posicion && encontrado) {
                Estudiante estudiante = actual.getE();
                matriz[0][0] = estudiante.getId();
                matriz[0][1] = estudiante.getName();
                matriz[0][2] = estudiante.isState();
                matriz[0][3] = estudiante.getCarrera();
                matriz[0][4] = estudiante.getEdad();
                encontrado = false;
            }
            actual = actual.getSiguiente();
            i++;
        }

        return matriz;
    }
    public Object[][] buscarporPosicionCola(Cola lista, int posicion) {
        int size = lista.getTamano();
        Object[][] matriz = new Object[size][5]; // La matriz tendrá 5 columnas para los datos de cada estudiante
        boolean encontrado = true; // condicion para parar de buscar
        Nodo actual = lista.getInicio();
        int i = 0;
        while (actual != null && encontrado) {

            if (i == posicion && encontrado) {
                Estudiante estudiante = actual.getE();
                matriz[0][0] = estudiante.getId();
                matriz[0][1] = estudiante.getName();
                matriz[0][2] = estudiante.isState();
                matriz[0][3] = estudiante.getCarrera();
                matriz[0][4] = estudiante.getEdad();
                encontrado = false;
            }
            actual = actual.getSiguiente();
            i++;
        }

        return matriz;
    }

    public Object[][] buscarporPosicionLCircular(ListaCircular lista, int posicion) {
        int size = lista.getTamano();
        Object[][] matriz = new Object[size][5]; // La matriz tendrá 5 columnas para los datos de cada estudiante
        boolean encontrado = true; // condicion para parar de buscar
        Nodo actual = lista.getInicio();
        int i = 0;
        while (actual != null && encontrado) {

            if (i == posicion && encontrado) {
                Estudiante estudiante = actual.getE();
                matriz[0][0] = estudiante.getId();
                matriz[0][1] = estudiante.getName();
                matriz[0][2] = estudiante.isState();
                matriz[0][3] = estudiante.getCarrera();
                matriz[0][4] = estudiante.getEdad();
                encontrado = false;
            }
            actual = actual.getSiguiente();
            i++;
        }

        return matriz;
    }

    public Object[][] buscarporPosicionLDouble(ListaDoble lista, int posicion) {
        int size = lista.getTamano();
        Object[][] matriz = new Object[size][5]; // La matriz tendrá 5 columnas para los datos de cada estudiante
        boolean encontrado = true; // condicion para parar de buscar
        Nodo actual = lista.getInicio();
        int i = 0;
        while (actual != null && encontrado) {

            if (i == posicion && encontrado) {
                Estudiante estudiante = actual.getE();
                matriz[0][0] = estudiante.getId();
                matriz[0][1] = estudiante.getName();
                matriz[0][2] = estudiante.isState();
                matriz[0][3] = estudiante.getCarrera();
                matriz[0][4] = estudiante.getEdad();
                encontrado = false;
            }
            actual = actual.getSiguiente();
            i++;
        }

        return matriz;
    }

    public Object[][] buscarPorNombreLSimple(ListaSimple lista, String nombre) {
        int size = lista.getTamano();
        Object[][] matriz = new Object[size][5]; // La matriz tendrá 5 columnas para los datos de cada estudiante
        boolean encontrado = true; // condicion para parar de buscar
        Nodo actual = lista.getInicio();
        int i = 0;
        while (actual != null && encontrado) {

            if (actual.getE().getName().equals(nombre) && encontrado) {
                Estudiante estudiante = actual.getE();
                matriz[i][0] = estudiante.getId();
                matriz[i][1] = estudiante.getName();
                matriz[i][2] = estudiante.isState();
                matriz[i][3] = estudiante.getCarrera();
                matriz[i][4] = estudiante.getEdad();
                encontrado = false;
            }
            actual = actual.getSiguiente();

        }

        return matriz;
    }
    
    public Object[][] buscarPorNombrePila(Pila lista, String nombre) {
        int size = lista.getTamano();
        Object[][] matriz = new Object[size][5]; // La matriz tendrá 5 columnas para los datos de cada estudiante
        boolean encontrado = true; // condicion para parar de buscar
        Nodo actual = lista.getTop();
        int i = 0;
        while (actual != null && encontrado) {

            if (actual.getE().getName().equals(nombre) && encontrado) {
                Estudiante estudiante = actual.getE();
                matriz[i][0] = estudiante.getId();
                matriz[i][1] = estudiante.getName();
                matriz[i][2] = estudiante.isState();
                matriz[i][3] = estudiante.getCarrera();
                matriz[i][4] = estudiante.getEdad();
                encontrado = false;
            }
            actual = actual.getSiguiente();

        }

        return matriz;
    }
 public Object[][] buscarPorNombreCola(Cola lista, String nombre) {
        int size = lista.getTamano();
        Object[][] matriz = new Object[size][5]; // La matriz tendrá 5 columnas para los datos de cada estudiante
        boolean encontrado = true; // condicion para parar de buscar
        Nodo actual = lista.getInicio();
        int i = 0;
        while (actual != null && encontrado) {

            if (actual.getE().getName().equals(nombre) && encontrado) {
                Estudiante estudiante = actual.getE();
                matriz[i][0] = estudiante.getId();
                matriz[i][1] = estudiante.getName();
                matriz[i][2] = estudiante.isState();
                matriz[i][3] = estudiante.getCarrera();
                matriz[i][4] = estudiante.getEdad();
                encontrado = false;
            }
            actual = actual.getSiguiente();

        }

        return matriz;
    }
    public Object[][] buscarPorNombreLCircular(ListaCircular lista, String nombre) {
        int size = lista.getTamano();
        Object[][] matriz = new Object[size][5]; // La matriz tendrá 5 columnas para los datos de cada estudiante
        boolean encontrado = true; // condicion para parar de buscar
        Nodo actual = lista.getInicio();
        int i = 0;
        while (actual != null && encontrado) {

            if (actual.getE().getName().equals(nombre) && encontrado) {
                Estudiante estudiante = actual.getE();
                matriz[i][0] = estudiante.getId();
                matriz[i][1] = estudiante.getName();
                matriz[i][2] = estudiante.isState();
                matriz[i][3] = estudiante.getCarrera();
                matriz[i][4] = estudiante.getEdad();
                encontrado = false;
            }
            actual = actual.getSiguiente();

        }

        return matriz;
    }

    public Object[][] buscarPorNombreLDouble(ListaDoble lista, String nombre) {
        int size = lista.getTamano();
        Object[][] matriz = new Object[size][5]; // La matriz tendrá 5 columnas para los datos de cada estudiante
        boolean encontrado = true; // condicion para parar de buscar
        Nodo actual = lista.getInicio();
        int i = 0;
        while (actual != null && encontrado) {

            if (actual.getE().getName().equals(nombre) && encontrado) {
                Estudiante estudiante = actual.getE();
                matriz[i][0] = estudiante.getId();
                matriz[i][1] = estudiante.getName();
                matriz[i][2] = estudiante.isState();
                matriz[i][3] = estudiante.getCarrera();
                matriz[i][4] = estudiante.getEdad();
                encontrado = false;
            }
            actual = actual.getSiguiente();

        }

        return matriz;
    }

    public Object[][] modificarPorIdLSimple(ListaSimple lista, int id, Estudiante e) {
        int size = lista.getTamano();
        Object[][] matriz = new Object[size][5]; // La matriz tendrá 5 columnas para los datos de cada estudiante
        boolean encontrado = true; // condicion para parar de buscar
        Nodo actual = lista.getInicio();
        int i = 0;
        while (actual != null && encontrado) {

            if (actual.getE().getId() == id && encontrado) {
                //modificamos el nodo y le seteamos la informacion nueva
                actual.setE(e);
                Estudiante estudiante = actual.getE();
                matriz[i][0] = estudiante.getId();
                matriz[i][1] = estudiante.getName();
                matriz[i][2] = estudiante.isState();
                matriz[i][3] = estudiante.getCarrera();
                matriz[i][4] = estudiante.getEdad();
                encontrado = false;
            } else {
                Estudiante estudiante = actual.getE();
                matriz[i][0] = estudiante.getId();
                matriz[i][1] = estudiante.getName();
                matriz[i][2] = estudiante.isState();
                matriz[i][3] = estudiante.getCarrera();
                matriz[i][4] = estudiante.getEdad();
            }
            actual = actual.getSiguiente();
            i++;
        }

        return matriz;
    }
     public Object[][] modificarPorIdPila(Pila lista, int id, Estudiante e) {
        int size = lista.getTamano();
        Object[][] matriz = new Object[size][5]; // La matriz tendrá 5 columnas para los datos de cada estudiante
        boolean encontrado = true; // condicion para parar de buscar
        Nodo actual = lista.getTop();
        int i = 0;
        while (actual != null && encontrado) {

            if (actual.getE().getId() == id && encontrado) {
                //modificamos el nodo y le seteamos la informacion nueva
                actual.setE(e);
                Estudiante estudiante = actual.getE();
                matriz[i][0] = estudiante.getId();
                matriz[i][1] = estudiante.getName();
                matriz[i][2] = estudiante.isState();
                matriz[i][3] = estudiante.getCarrera();
                matriz[i][4] = estudiante.getEdad();
                encontrado = false;
            } else {
                Estudiante estudiante = actual.getE();
                matriz[i][0] = estudiante.getId();
                matriz[i][1] = estudiante.getName();
                matriz[i][2] = estudiante.isState();
                matriz[i][3] = estudiante.getCarrera();
                matriz[i][4] = estudiante.getEdad();
            }
            actual = actual.getSiguiente();
            i++;
        }

        return matriz;
    }
    public Object[][] modificarPorIdCola(Cola lista, int id, Estudiante e) {
        int size = lista.getTamano();
        Object[][] matriz = new Object[size][5]; // La matriz tendrá 5 columnas para los datos de cada estudiante
        boolean encontrado = true; // condicion para parar de buscar
        Nodo actual = lista.getInicio();
        int i = 0;
        while (actual != null && encontrado) {

            if (actual.getE().getId() == id && encontrado) {
                //modificamos el nodo y le seteamos la informacion nueva
                actual.setE(e);
                Estudiante estudiante = actual.getE();
                matriz[i][0] = estudiante.getId();
                matriz[i][1] = estudiante.getName();
                matriz[i][2] = estudiante.isState();
                matriz[i][3] = estudiante.getCarrera();
                matriz[i][4] = estudiante.getEdad();
                encontrado = false;
            } else {
                Estudiante estudiante = actual.getE();
                matriz[i][0] = estudiante.getId();
                matriz[i][1] = estudiante.getName();
                matriz[i][2] = estudiante.isState();
                matriz[i][3] = estudiante.getCarrera();
                matriz[i][4] = estudiante.getEdad();
            }
            actual = actual.getSiguiente();
            i++;
        }

        return matriz;
    }

    public Object[][] modificarPorIdLCircular(ListaCircular lista, int id, Estudiante e) {
        int size = lista.getTamano();
        Object[][] matriz = new Object[size][5]; // La matriz tendrá 5 columnas para los datos de cada estudiante
        boolean encontrado = true; // condicion para parar de buscar
        Nodo actual = lista.getInicio();
        int i = 0;
        while (actual != null && encontrado) {

            if (actual.getE().getId() == id && encontrado) {
                //modificamos el nodo y le seteamos la informacion nueva
                actual.setE(e);
                Estudiante estudiante = actual.getE();
                matriz[i][0] = estudiante.getId();
                matriz[i][1] = estudiante.getName();
                matriz[i][2] = estudiante.isState();
                matriz[i][3] = estudiante.getCarrera();
                matriz[i][4] = estudiante.getEdad();
                encontrado = false;
            } else {
                Estudiante estudiante = actual.getE();
                matriz[i][0] = estudiante.getId();
                matriz[i][1] = estudiante.getName();
                matriz[i][2] = estudiante.isState();
                matriz[i][3] = estudiante.getCarrera();
                matriz[i][4] = estudiante.getEdad();
            }
            actual = actual.getSiguiente();
            i++;
        }

        return matriz;
    }

    public Object[][] modificarPorIdLDouble(ListaDoble lista, int id, Estudiante e) {
        int size = lista.getTamano();
        Object[][] matriz = new Object[size][5]; // La matriz tendrá 5 columnas para los datos de cada estudiante
        boolean encontrado = true; // condicion para parar de buscar
        Nodo actual = lista.getInicio();
        int i = 0;
        while (actual != null && encontrado) {

            if (actual.getE().getId() == id && encontrado) {
                //modificamos el nodo y le seteamos la informacion nueva
                actual.setE(e);
                Estudiante estudiante = actual.getE();
                matriz[i][0] = estudiante.getId();
                matriz[i][1] = estudiante.getName();
                matriz[i][2] = estudiante.isState();
                matriz[i][3] = estudiante.getCarrera();
                matriz[i][4] = estudiante.getEdad();
                encontrado = false;
            } else {
                Estudiante estudiante = actual.getE();
                matriz[i][0] = estudiante.getId();
                matriz[i][1] = estudiante.getName();
                matriz[i][2] = estudiante.isState();
                matriz[i][3] = estudiante.getCarrera();
                matriz[i][4] = estudiante.getEdad();
            }
            actual = actual.getSiguiente();
            i++;
        }

        return matriz;
    }
//Método auxiliar para imprimir la lista de nodos enlazados. Recibe un número entero para indicar cuales datos
    //tiene que imprimir (2 solo nombres, 3 solo ids, 4 todos los datos)

    public Object[][] MostrarIdAndNameLSimple(ListaSimple lista, int tipo) {
        String list = "";
        int size = lista.getTamano();
        Object[][] matriz = new Object[size][5]; // La matriz tendrá 5 columnas para los datos de cada estudiante

        Nodo ptr = lista.getInicio();
        int i = 0;
        switch (tipo) {
            case 2:
                i = 0;
                while (ptr != null) {
                    list += (ptr.getE().getId() + " -> "); //Imprimir solo las ids de los estudiantes
                    Estudiante estudiante = ptr.getE();
                    matriz[i][0] = estudiante.getId();
                    matriz[i][1] = null;
                    matriz[i][2] = null;
                    matriz[i][3] = null;
                    matriz[i][4] = null;
                    ptr = ptr.getSiguiente();
                    i++;
                }
                break;
            case 3:
                i = 0;
                while (ptr != null) {
                    list += (ptr.getE().getName() + " -> "); //Imprimir solo los nombre de los estudiantes
                    Estudiante estudiante = ptr.getE();
                    matriz[i][0] = null;
                    matriz[i][1] = estudiante.getName();
                    matriz[i][2] = null;
                    matriz[i][3] = null;
                    matriz[i][4] = null;
                    ptr = ptr.getSiguiente();
                    i++;
                }
                break;
            case 4:

                break;
        }
        list += "NULL";
        System.out.println(list);
        return matriz;
    }
    
       public Object[][] MostrarIdAndNamePila(Pila lista, int tipo) {
        String list = "";
        int size = lista.getTamano();
        Object[][] matriz = new Object[size][5]; // La matriz tendrá 5 columnas para los datos de cada estudiante

        Nodo ptr = lista.getTop();
        int i = 0;
        switch (tipo) {
            case 2:
                i = 0;
                while (ptr != null) {
                    list += (ptr.getE().getId() + " -> "); //Imprimir solo las ids de los estudiantes
                    Estudiante estudiante = ptr.getE();
                    matriz[i][0] = estudiante.getId();
                    matriz[i][1] = null;
                    matriz[i][2] = null;
                    matriz[i][3] = null;
                    matriz[i][4] = null;
                    ptr = ptr.getSiguiente();
                    i++;
                }
                break;
            case 3:
                i = 0;
                while (ptr != null) {
                    list += (ptr.getE().getName() + " -> "); //Imprimir solo los nombre de los estudiantes
                    Estudiante estudiante = ptr.getE();
                    matriz[i][0] = null;
                    matriz[i][1] = estudiante.getName();
                    matriz[i][2] = null;
                    matriz[i][3] = null;
                    matriz[i][4] = null;
                    ptr = ptr.getSiguiente();
                    i++;
                }
                break;
            case 4:

                break;
        }
        list += "NULL";
        System.out.println(list);
        return matriz;
    }
 public Object[][] MostrarIdAndNameCola(Cola lista, int tipo) {
        String list = "";
        System.err.println("id");
        int size = lista.getTamano();
        Object[][] matriz = new Object[size][5]; // La matriz tendrá 5 columnas para los datos de cada estudiante

        Nodo ptr = lista.getInicio();
        int i = 0;
        switch (tipo) {
            case 2:
                i = 0;
                while (ptr != null) {
                    list += (ptr.getE().getId() + " -> "); //Imprimir solo las ids de los estudiantes
                    Estudiante estudiante = ptr.getE();
                    matriz[i][0] = estudiante.getId();
                    matriz[i][1] = null;
                    matriz[i][2] = null;
                    matriz[i][3] = null;
                    matriz[i][4] = null;
                    ptr = ptr.getSiguiente();
                    i++;
                }
                break;
            case 3:
                i = 0;
                while (ptr != null) {
                    list += (ptr.getE().getName() + " -> "); //Imprimir solo los nombre de los estudiantes
                    Estudiante estudiante = ptr.getE();
                    matriz[i][0] = null;
                    matriz[i][1] = estudiante.getName();
                    matriz[i][2] = null;
                    matriz[i][3] = null;
                    matriz[i][4] = null;
                    ptr = ptr.getSiguiente();
                    i++;
                }
                break;
            case 4:

                break;
        }
        list += "NULL";
        System.out.println(list);
        return matriz;
    }
    public Object[][] MostrarIdAndNameLCircular(ListaCircular lista, int tipo) {
        if (lista==null) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
        String list = "";
        int size = lista.getTamano();
        Object[][] matriz = new Object[size][5]; // La matriz tendrá 5 columnas para los datos de cada estudiante

        Nodo ptr = lista.getInicio();
        int i = 0;
        switch (tipo) {
            case 2:
                i = 0;
                while (lista != null &&ptr.getSiguiente() != lista.getInicio()) {
                    list += (ptr.getE().getId() + " -> "); //Imprimir solo las ids de los estudiantes
                    Estudiante estudiante = ptr.getE();
                    matriz[i][0] = estudiante.getId();
                    matriz[i][1] = null;
                    matriz[i][2] = null;
                    matriz[i][3] = null;
                    matriz[i][4] = null;
                    ptr = ptr.getSiguiente();
                    i++;
                }
                if (ptr != null) {
                    list += (ptr.getE().getId() + " -> "); //Imprimir solo las ids de los estudiantes
                    Estudiante estudiante = ptr.getE();
                    matriz[i][0] = estudiante.getId();
                    matriz[i][1] = null;
                    matriz[i][2] = null;
                    matriz[i][3] = null;
                    matriz[i][4] = null;
                }
                break;
            case 3:
                i = 0;
                while (ptr.getSiguiente() != lista.inicio) {
                    list += (ptr.getE().getName() + " -> "); //Imprimir solo los nombre de los estudiantes
                    Estudiante estudiante = ptr.getE();
                    matriz[i][0] = null;
                    matriz[i][1] = estudiante.getName();
                    matriz[i][2] = null;
                    matriz[i][3] = null;
                    matriz[i][4] = null;
                    ptr = ptr.getSiguiente();
                    i++;
                }
                if (ptr != null) {
                    list += (ptr.getE().getName() + " -> "); //Imprimir solo los nombre de los estudiantes
                    Estudiante estudiante = ptr.getE();
                    matriz[i][0] = null;
                    matriz[i][1] = estudiante.getName();
                    matriz[i][2] = null;
                    matriz[i][3] = null;
                    matriz[i][4] = null;
                }
                break;
            case 4:

                break;
        }
        list += "NULL";
        System.out.println(list);
        return matriz;
    }

    public Object[][] MostrarIdAndNameLDouble(ListaDoble lista, int tipo) {
        String list = "";
        int size = lista.getTamano();
        Object[][] matriz = new Object[size][5]; // La matriz tendrá 5 columnas para los datos de cada estudiante

        Nodo ptr = lista.getInicio();
        int i = 0;
        switch (tipo) {
            case 2:
                i = 0;
                while (ptr != null) {
                    list += (ptr.getE().getId() + " -> "); //Imprimir solo las ids de los estudiantes
                    Estudiante estudiante = ptr.getE();
                    matriz[i][0] = estudiante.getId();
                    matriz[i][1] = null;
                    matriz[i][2] = null;
                    matriz[i][3] = null;
                    matriz[i][4] = null;
                    ptr = ptr.getSiguiente();
                    i++;
                }
                break;
            case 3:
                i = 0;
                while (ptr != null) {
                    list += (ptr.getE().getName() + " -> "); //Imprimir solo los nombre de los estudiantes
                    Estudiante estudiante = ptr.getE();
                    matriz[i][0] = null;
                    matriz[i][1] = estudiante.getName();
                    matriz[i][2] = null;
                    matriz[i][3] = null;
                    matriz[i][4] = null;
                    ptr = ptr.getSiguiente();
                    i++;
                }
                break;
            case 4:

                break;
        }
        list += "NULL";
        System.out.println(list);
        return matriz;
    }
}
