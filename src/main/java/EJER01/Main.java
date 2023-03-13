/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJER01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Este programa consta de diversas operaciones para realizar con colecciones
 * set, divididas en 4 métodos, entre los que se encuentran la creación,
 * comparación y ordenación de los valores
 *
 * @author Sergio Guerrero Borrero
 */
public class Main {

    public static void main(String[] args) {
        boolean repetir = true;
        byte opcion;
        while (repetir) {
            opcion = menu(); // Se llama al método menú, que devolverá un tipo byte con la opción elegida por el usuario
            switch (opcion) { // Según la opción recibida, mediante el condicional Switch se determinará el método a usar o si salir del programa
                case 1:
                    metodoA();
                    break;
                case 2:
                    metodoB();
                    break;
                case 3:
                    metodoC();
                    break;
                case 4:
                    metodoD();
                    break;
                case 0:
                    repetir = false; // Se pasa a false para salir del bucle y del programa
                    break;
                default:
                    System.out.println("Se ha introducido una opción errónea");
                    break;
            }
        }
        System.out.println("¡Gracias por usar el programa!");
    }

    /**
     * El <strong>Método A</strong> consiste en pedir al usuario nombres para
     * rellenar un HashSet tipo String hasta que se escriba la palabra fin por
     * pantalla
     *
     * @return HashSet creado con los nombres
     */
    public static HashSet<String> metodoA() {
        HashSet<String> nombres = new HashSet<String>();
        Scanner teclado = new Scanner(System.in);
        String nombreIntroducir;
        boolean repetir = true;
        while (repetir) {
            System.out.println("Introduzca un nombre, escriba fin para salir:");
            nombreIntroducir = teclado.next();
            if (nombres.contains(nombreIntroducir)) { // Si el nombre ya se ha introducido se notifica y no se añade de nuevo
                System.out.println("Nombre ya introducido...");
            } else if (nombreIntroducir.toUpperCase().equals("FIN")) { // Si se escribe fin, repetir pasa a false para salir del bucle
                repetir = false;
            } else { // En el caso de introducir un nombre nuevo que no sea fin, se añade al HashSet
                nombres.add(nombreIntroducir);
            }
            System.out.println("");
        }
        limpiarPantalla(); // Se llama al método limpiarPantalla como indica el enunciado
        System.out.println("El HashSet contiene los siguientes nombres: " + nombres); // Se muestran los nombres al finalizar el método
        return nombres;
    }

    /**
     * El <strong>Método B</strong> ejecuta dos veces Método A, y tras esto
     * muestra los nombres que coinciden de ambos HashSet
     */
    public static void metodoB() {
        System.out.println("Introduzca los datos para el primer HashSet:");
        System.out.println("");
        HashSet<String> nombres1 = metodoA();
        System.out.println("");
        System.out.println("Introduzca los datos para el segundo HashSet:");
        HashSet<String> nombres2 = metodoA();
        System.out.println("");
        System.out.println("A continuación se mostrarán los nombres que coinciden:");
        for (String nombreComparar1 : nombres1) { // for..in por cada elemento del HashSet nombres1
            if (nombres2.contains(nombreComparar1)) { // Si el segundo HashSet también contiene ese elemento se muestra
                System.out.println(nombreComparar1);
            }
        }
    }

    /**
     * El <strong>Método C</strong> ejecuta dos veces Método A, y tras esto
     * muestra los nombres que no coinciden en ambos HashSet
     */
    public static void metodoC() {
        System.out.println("Introduzca los datos para el primer HashSet:");
        System.out.println("");
        HashSet<String> nombres1 = metodoA();
        System.out.println("");
        System.out.println("Introduzca los datos para el segundo HashSet:");
        HashSet<String> nombres2 = metodoA();
        System.out.println("");
        System.out.println("A continuación se mostrarán los nombres que no coinciden:");
        for (String nombreComparar1 : nombres1) { // for..in por cada elemento del HashSet nombres1
            if (!nombres2.contains(nombreComparar1)) { // Si el segundo HashSet no contiene ese elemento se muestra
                System.out.println(nombreComparar1);
            }
        }
    }

    /**
     * El <strong>Método D</strong> ejecuta dos veces Método A, y tras esto
     * muestra todos los nombres ordenados por orden alfabético
     */
    public static void metodoD() {
        System.out.println("Introduzca los datos para el primer HashSet:");
        System.out.println("");
        HashSet<String> nombres1 = metodoA();
        System.out.println("");
        System.out.println("Introduzca los datos para el segundo HashSet:");
        HashSet<String> nombres2 = metodoA();
        System.out.println("");
        for (String nombreComparar1 : nombres1) { // for..in por cada elemento del HashSet nombres1
            if (!nombres2.contains(nombreComparar1)) { // Si el segundo HashSet no contiene ese elemento, se le añade
                nombres2.add(nombreComparar1);
            }
        }
        // Creamos un TreeSet a raiz de nombres2, que ahora contiene todos los nombres sin repetirse, y se ordena automáticamente
        TreeSet<String> nombresOrdenados = new TreeSet(nombres2);
        System.out.println("La lista de nombres de ambos HashSet ordenados por orden alfabético es la siguiente:");
        System.out.println(nombresOrdenados); // Para finalizar se muestran por pantalla el HashSet ordenado
    }

    /**
     * El método menú muestra las opciones disponibles y pide al usuario que
     * introduzca una de ellas, se capturan las posibles excepciones
     *
     * @return opcion indicada por el usuario
     */
    public static byte menu() {
        Scanner teclado = new Scanner(System.in);
        byte opcionElegida;
        System.out.println("******MENÚ******");
        System.out.println("1. Método A...");
        System.out.println("2. Método B...");
        System.out.println("3. Método C...");
        System.out.println("4. Método D...");
        System.out.println("0. Salir");
        System.out.println("****************");
        try {
            opcionElegida = teclado.nextByte();
        } catch (Exception E) {
            teclado.nextLine(); // Con nextLine se evita el bucle infinito en caso de introducir una letra para int
            opcionElegida = 7; // Se da un valor fuera de los aceptados
        }
        return opcionElegida;
    }

    /**
     * Método usado para limpiar la pantalla con saltos de línea
     */
    public static void limpiarPantalla() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

}
