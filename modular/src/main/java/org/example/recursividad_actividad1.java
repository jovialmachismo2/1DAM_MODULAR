package org.example;

import java.util.Scanner;

public class recursividad_actividad1 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        menu();
        System.out.print("----> ");
        int opcion = teclado.nextInt();
        opcion_menu(opcion);




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
    public static void opcion_menu(int opcion){
        Scanner teclado = new Scanner(System.in);
        switch (opcion){
            case 1:
                System.out.println(dividido(34535345));
                break;
            case 2:
                System.out.println(potencia(2,4));
                break;
            case 3:
                invertido(363742);
                String frase = "Hola mundo soy una frase al reves";
                char[] frase_char = frase.toCharArray();
                invertido_char(frase_char.length-1,frase_char);
                invertido_char_sin_vector(frase.length()-1,frase);
                break;
            case 4:
                String numero = teclado.next();
                System.out.println(binario(numero.length()-1,numero));
                break;

            case 5:
                int numero_pasar = teclado.nextInt();
                System.out.println(pasar_binario(numero_pasar));
                break;
            case 6:
                break;
            case 7:
                break;
            default:

        }
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
    public static void invertido(int numero){
        if (numero < 10){
            System.out.print(numero);
        }else {
            System.out.print(numero%10);
            invertido(numero/10);
        }
    }
    public static void invertido_char(int posicion, char[] frase){
        if (posicion>=0){
            System.out.print(frase[posicion]);
            invertido_char(posicion-1,frase);
        }
    }
    public static void invertido_char_sin_vector(int posicion, String frase){
        if (posicion>=0){
            System.out.print(frase.charAt(posicion));
            invertido_char_sin_vector(posicion-1,frase);
        }
    }
    public static boolean binario(int posicion, String numero){
        if (posicion>=0){
            if (numero.charAt(posicion) == '0' || numero.charAt(posicion) == '1'){
                return binario(posicion-1,numero);
            }else {
                return false;
            }
        }
        return true;
    }
    public static String pasar_binario(int numero){

        if (numero<=1){

            return Integer.toString(numero);
        }else {
            return pasar_binario(numero / 2)+numero%2;
        }
    }
}
