package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la cadena: ");
        String cadena = teclado.nextLine();
        System.out.println(cadena.toUpperCase());
        System.out.println("_____");
        System.out.println("|" + cadena.toUpperCase().charAt(0) + cadena.toUpperCase().charAt(1) + cadena.toUpperCase().charAt(2) + "|");
        System.out.println("|" + cadena.toUpperCase().charAt(3) + cadena.toUpperCase().charAt(4) + cadena.toUpperCase().charAt(5) + "|" );
        System.out.println("|" + cadena.toUpperCase().charAt(6) + cadena.toUpperCase().charAt(7) + cadena.toUpperCase().charAt(8) + "|");
        System.out.println("_____");
    }

}