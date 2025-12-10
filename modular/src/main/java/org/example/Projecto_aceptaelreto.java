package org.example;

import java.util.Scanner;

public class Projecto_aceptaelreto {
    static Scanner teclado ;

    static void main(String[] args) {
        teclado = new Scanner(System.in);
    int corteza = 1;


        while (corteza != 0){

            corteza = teclado.nextInt();
            String trozitos = teclado.nextLine();
            String bocadillo[] = trozitos.split(" ");
            if (bocadillo.length != corteza){
                return;
            }

        }
    }
}
