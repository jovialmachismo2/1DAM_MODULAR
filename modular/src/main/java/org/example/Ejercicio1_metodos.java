package org.example;

import java.util.Scanner;

public class Ejercicio1_metodos {
    static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce numero");
        int numero = teclado.nextInt();
        int resultado = cubo(numero);
        System.out.println(resultado);

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        pintar_nombre("Patri","Kevin","Jcobo");

    }

    public static int cubo(int numero){
        return numero*numero*numero;
    }

    public static void pintar_nombre (String...nombre){

        for (String nomb:nombre){
            System.out.println(nomb);
        }

    }
}
