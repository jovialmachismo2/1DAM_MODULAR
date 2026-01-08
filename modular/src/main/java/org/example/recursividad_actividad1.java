package org.example;

import java.util.Scanner;

public class recursividad_actividad1 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        menu();
        System.out.print("----> ");
        int opcion = teclado.nextInt();
        System.out.println(dividido(34535345));
        System.out.println(potencia(2,4));
    }
    public static void menu(){

        System.out.println("*** Bateria de ejercicios sobre recursividad ***");
        System.out.println("Selecciona a continuacion el modo que quieras ejecutar...");
        System.out.println("1 - Digitos");
        System.out.println("2 - Potencias");
        System.out.println("3 - Del Reves");
        System.out.println("4 - Binario");
        System.out.println("5 - A Binario");
        System.out.println("6 - Orden alfabetico");
        System.out.println("7 - Mostrar suma");

    }
    public static int dividido(int numero){

        if (numero < 10){
            return 1;
        }else {
            return 1+dividido(numero/10);
        }
    }
    public static int potencia(int num, int exponente){
        if (exponente == 1){
            return num;
        }else {
            return num*potencia(num,exponente-1);
        }
    }
}
