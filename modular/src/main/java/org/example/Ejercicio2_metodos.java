package org.example;

import java.util.Scanner;

public class Ejercicio2_metodos {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        imprimirmenu();

        System.out.println("Teclea tu opcion: ");
        char ocpion = teclado.next().charAt(0);

        if (validar_opcion(ocpion)){
            System.out.println("Valido");
        }else {
            System.out.println("no es Valida");
        }
    }
    public static void imprimirmenu(){

        System.out.println("Bienvenido");
        System.out.println("1, Cantar");
        System.out.println("2. Bailar");
        System.out.println("3. Hacer backflip");
        System.out.println("X. Salir");

    }
    public static boolean validar_opcion(char opcion){

        switch (opcion){
            case '1':
            case '2':
            case '3':
            case 'X':
                return true;
            default:
                return false;
        }
    }
}
