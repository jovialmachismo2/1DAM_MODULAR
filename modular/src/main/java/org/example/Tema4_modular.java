package org.example;

public class Tema4_modular {
    static void main(String[] args) {
        int num = 10;
        int numero = funcion(num);
        System.out.println(numero);
        procedimiento();
        System.out.println("He vuelto del procedimiento");


    }
    public static int funcion(int numero){
        numero = numero + 20;
        return numero * 10;
    }


    public static void procedimiento(){

        System.out.println("Hola soy el rayo maqueen y soy velozzz");

    }

}
