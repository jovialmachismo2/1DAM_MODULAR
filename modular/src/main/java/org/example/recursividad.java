package org.example;

public class recursividad {
    static int limite = 10;
    static void main(String[] args) {
        imprimir(1);
    }
    public static void imprimir(int inicio){
        if (inicio>limite){
            return;
        }else{
            System.out.println(inicio);
            imprimir(inicio+1);
        }
    }
}
