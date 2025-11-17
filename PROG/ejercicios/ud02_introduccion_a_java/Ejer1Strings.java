package PROG.ejercicios.ud02_introduccion_a_java;

/**
 * Ejercicio 1 - Strings en JAVA
 * 
 * Crea un programa que te pida una palabra y escriba las letras separadas por espacios
 * 
 * Ejemplo para entrada: [Programación]
 * Salida:               [P r o g r a m a c i ó n]
 * 
 */

import java.util.Scanner;

public class Ejer1Strings {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime la palabra mas bonita:");
        String nombre = entrada.nextLine();

        for (int i = 0; i < nombre.length(); i++) {
            System.out.print(nombre.charAt(i) + ", ");
        }
        System.out.println();
        entrada.close();
    }

}