package org.example;

import java.util.Scanner;

public class Ejercicio3_metodos {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribir texto en minuscula");
        String palabra = teclado.nextLine();

        palabra = imprimir(palabra);

        System.out.println(imprimir(palabra));;

        System.out.println(vocales(palabra));
    }
    public static String imprimir(String x){

        return x.toUpperCase();

    }
    public static int vocales(String palabra) {
        int num_vocales = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'A' ||palabra.charAt(i) == 'E' ||palabra.charAt(i) == 'I' ||palabra.charAt(i) == 'O' ||palabra.charAt(i) == 'U'){
                num_vocales++;
            }
        }
        return num_vocales;
    }
}