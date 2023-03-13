/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJER02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Este programa consiste en la creación de un <strong>ArrayList</strong> que
 * ordene 10 números enteros introducidos por teclado
 *
 * @author Sergio Guerrero Borrero
 */
public class Main {

    public static void main(String[] args) {
        int contador = 1;
        Scanner teclado = new Scanner(System.in);
        int numeroIntroducir;
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>(); // Se establece el ArrayList
        System.out.println("Introduzca 10 números:");
        while (contador <= 10) { // Establecemos un bucle con el contador hasta introducir 10 números
            try {
                numeroIntroducir = teclado.nextInt();
                listaNumeros.add(numeroIntroducir); // Se introduce al ArrayList el numero introducido
                contador++; // Se aumenta el contador si no se lanza excepción
            } catch (Exception E) {
                teclado.nextLine(); // Para capturar la letra introducida en caso de excepción
                System.out.println("Introduzca un número entero...");
            }
        }
        System.out.println("");
        Collections.sort(listaNumeros); // Se usa el método sort de la clase Collections para ordenar el ArrayListt
        System.out.println("La lista de números ordenada es: " + listaNumeros); // Para finalizar se muestra la lista de números
    }
}
