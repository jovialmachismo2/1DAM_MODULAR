package org.example;

import java.util.Scanner;

public class f {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        int numCasos = read.nextInt();

        read.nextLine();

        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }

    public static void casoDePrueba() {
        int salario = 1;
        int gastos = 0;
        int vec[] = new int[6];
        for (int i = 0; i < vec.length; i++) {
            vec[i] = read.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            salario *=vec[i];
        }
        gastos = (vec[3] * (vec[1]*2)) + (vec[4]+vec[5]);

        System.out.println((salario - gastos ));
    }
}
