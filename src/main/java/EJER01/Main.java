/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJER01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Sergio GB
 */
public class Main {
    public static void main(String[] args) {
        boolean repetir=true;
        byte opcion;
        while (repetir) {
        opcion=menu();
        switch (opcion) {
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
            default:
                System.out.println("Se ha introducido una opción errónea");
                break;
        }
        }
    }
    
    public static HashSet<String> metodoA() {
        HashSet <String> nombres = new HashSet<String>();
        Scanner teclado = new Scanner(System.in);
        String nombreIntroducir;
        boolean repetir = true;
        while (repetir) {
            System.out.println("Introduzca un nombre, escriba fin para salir:");
            nombreIntroducir=teclado.next();
            if (nombreIntroducir.toUpperCase().equals("FIN")) {
                repetir=false;
            }
            else {
                nombres.add(nombreIntroducir);
            }
        }
        System.out.println("El HashSet contiene los siguientes nombres: " + nombres);
        return nombres;
    }
    
    public static void metodoB() {
        System.out.println("Introduzca los datos para el primer HashSet:");
        System.out.println("");
        HashSet <String> nombres1 = metodoA();
        System.out.println("");
        System.out.println("Introduzca los datos para el segundo HashSet:");
        HashSet <String> nombres2 = metodoA();
        System.out.println("");
        System.out.println("A continuación se mostrarán los nombres que coinciden:");
        for (String nombreComparar1 : nombres1) {
            if (nombres2.contains(nombreComparar1)) {
                System.out.println(nombreComparar1);
            }
        }
    }
    
    public static void metodoC() {
        System.out.println("Introduzca los datos para el primer HashSet:");
        System.out.println("");
        HashSet <String> nombres1 = metodoA();
        System.out.println("");
        System.out.println("Introduzca los datos para el segundo HashSet:");
        HashSet <String> nombres2 = metodoA();
        System.out.println("");
        System.out.println("A continuación se mostrarán los nombres que no coinciden:");
        for (String nombreComparar1 : nombres1) {
            if (!nombres2.contains(nombreComparar1)) {
                System.out.println(nombreComparar1);
            }
        }
    }
    
    public static void metodoD() {
        
    }
    
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
            opcionElegida=teclado.nextByte();
        } catch(Exception E) {
            teclado.nextLine(); // Con nextLine se evita el bucle infinito en caso de introducir una letra
            opcionElegida=7; // Se da un valor fuera de los aceptados
        }
        return opcionElegida;
    }
    
}
