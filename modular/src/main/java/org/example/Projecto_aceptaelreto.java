package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Projecto_aceptaelreto {
    static Scanner teclado ;

    static void main(String[] args) {
        teclado = new Scanner(System.in);
    int corteza = 1;
    int suma = 0;

        while (corteza != 0){
            corteza = teclado.nextInt();
            teclado.nextLine();
            if (corteza != 0) {
                String bocadillos[] = teclado.nextLine().split(" ");
                int pasar_int_bocadillo[] = new int[bocadillos.length];
                if (bocadillos.length != corteza) {
                    return;
                }else {
                    for (int i = 0; i < bocadillos.length; i++) {
                        pasar_int_bocadillo[i] = Integer.parseInt(bocadillos[i]);
                        suma = pasar_int_bocadillo[i] + suma;
                    }
                }
            }
        }

    }
    static void modo2(int corteza){
        System.out.println(corteza);
    }
}
