/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJER03;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Programa que crea 20 números hasta 100 de forma aleatorio, los muestra según
 * se han generado, y tras esto los ordena por orden creciente y se vuelve a
 * mostrar
 *
 * @author Sergio Guerrero Borrero
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numerosAleatorios = new ArrayList<Integer>(); // Al ser una colección que puede contener duplicados, se usará un ArrayList
        for (int i = 0; i < 20; i++) numerosAleatorios.add((int) (Math.random() * 100 + 1)); // Establecemos el proceso de añadir los números aleatorios a un bucle de una línea
        System.out.println("Lista de números ordenada según se han generado: " + numerosAleatorios); // Se muestra por pantalla la lista de números según se han generado
        Collections.sort(numerosAleatorios); // Se ordena por orden creciente
        System.out.println("Lista de números ordenada por orden creciente: " + numerosAleatorios); // Se muestra por pantalla la lista de números ordenados de forma creciente
    }

}
