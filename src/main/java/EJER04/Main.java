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
            opcion=menu();
            switch (opcion) {
                case 1:
                    idContrasenia.put( pedirID(), pedirContrasenia());
                    break;
                case 2:
                    System.out.println("La lista de pares es:");
                    System.out.println(idContrasenia);
                    break;
                case 0:
                    repetir=false;
                    break;
                default:
                    System.out.println("Opción incorrecta...");
                    break;
            }
        }
        System.out.println("Gracias por usar el programa");
    }
    
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
    
    public static int pedirID(){
        int idDevolver=0;
        boolean repetir =true;
        Scanner teclado = new Scanner(System.in);
        while (repetir) {
            try {
                System.out.println("Introduzca el ID (Identificación numérica):");
                idDevolver=teclado.nextInt();
                repetir=false;
            } catch (Exception E) {
                teclado.nextLine(); // Para capturar texto
                System.out.println("Introduzca un valor válido...");
            }
        }
        return idDevolver;
    }
    
    public static String pedirContrasenia(){
        String contraseniaDevolver="";
        boolean repetir = true;
        Scanner teclado = new Scanner(System.in);
        while (repetir) {
                System.out.println("Introduzca la contraseña, debe ser alfanumérico:");
                contraseniaDevolver=teclado.next();
                if ((contraseniaDevolver.matches("([a-zA-Z]+[0-9]+).*||[0-9]+[a-zA-Z]+.*"))) { // Se comprueba que se escriban al menos un número y una letra
                    repetir=false;
                }
                else {
                    System.out.println("La contraseña no tiene un formato correcto...");
                }
        }
        return contraseniaDevolver;
    }
    
}
