package org.example;

public class recursividad {
    static int limite = 10;
    static void main(String[] args) {
        entero(0);
    }
    public static void imprimir(int inicio){
        if (inicio>limite){
            return;
        }else{
            System.out.println(inicio);
            imprimir(inicio+1);
        }
    }
    public static int entero(int num){
        int suma = 0;
        if (num==0){
            return 0;
        }else{
            return num+entero(num-1);
        }
    }
    public static void imprimir_bucle(){



    }
}
