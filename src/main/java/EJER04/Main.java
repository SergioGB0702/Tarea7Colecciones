/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJER04;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Sergio Guerrero Borrero
 */
public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> idContrasenia = new HashMap<Integer, String>(); // Debe ser una colección map y el orden no es importante, así que se usará HashMap
        boolean repetir = true;
        byte opcion;
        while (repetir) {
            opcion = menu(); // Por cada repetición se muestra el menú y se devuelve el byte de la opción
            switch (opcion) {
                case 1:
                    idContrasenia.put(pedirID(), pedirContrasenia()); // Se añade un nuevo par al HashMap, llamando a los métodos que comprueban la validez de cada elemento
                    break;
                case 2:
                    System.out.println("La lista de pares es:");
                    System.out.println(idContrasenia); // Se muestran los pares, si no hay se muestra vacío
                    break;
                case 0:
                    repetir = false; // Repetir pasa a false para salir del bucle y del programa
                    break;
                default:
                    System.out.println("Opción incorrecta...");
                    break;
            }
        }
        System.out.println("Gracias por usar el programa");
    }

    /**
     * Método que muestra el <strong>menú</strong> y que le pide al usuario una
     * opción que devolverá mediante el correspondiente return, se capturan
     * posibles excepciones
     *
     * @return opcion elegida por el usuario
     */
    public static byte menu() {
        Scanner teclado = new Scanner(System.in);
        byte opcionElegida;
        System.out.println("******MENÚ******");
        System.out.println("1. Generar par ID-Contraseña");
        System.out.println("2. Mostrar pares");
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
     * Método <strong>pedirID</strong>, que solicita al usuario un ID y revisa
     * que sea numérico, para después retornarlo comprobando excepciones
     *
     * @return ID válido
     */
    public static int pedirID() {
        int idDevolver = 0;
        boolean repetir = true;
        Scanner teclado = new Scanner(System.in);
        while (repetir) {
            try {
                System.out.println("Introduzca el ID (Identificación numérica):");
                idDevolver = teclado.nextInt();
                repetir = false; // Se pasa a false si no se lanza excepción
            } catch (Exception E) {
                teclado.nextLine(); // Para capturar texto de posible excepción
                System.out.println("Introduzca un valor válido...");
            }
        }
        return idDevolver; // Se devuelve el id revisado
    }

    /**
     * Método <strong>pedirContrasenia</strong> que pide al usuario una
     * contraseña por pantalla y comprueba que sea alfanumérica, tras esto la
     * devuelve
     *
     * @return contraseña validada
     */
    public static String pedirContrasenia() {
        String contraseniaDevolver = "";
        boolean repetir = true;
        Scanner teclado = new Scanner(System.in);
        while (repetir) {
            System.out.println("Introduzca la contraseña, debe ser alfanumérico:");
            contraseniaDevolver = teclado.next();
            if ((contraseniaDevolver.matches("([a-zA-Z]+[0-9]+).*||[0-9]+[a-zA-Z]+.*"))) { // Se comprueba que se escriban al menos un número y una letra
                repetir = false;
            } else { // En caso de no tener un formato correcto se muestra un mensaje notificándolo
                System.out.println("La contraseña no tiene un formato correcto...");
            }
        }
        return contraseniaDevolver; // Se devuelve la contraseña validada
    }

}
