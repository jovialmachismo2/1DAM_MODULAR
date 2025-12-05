package org.example;

import java.util.Scanner;

public class modo3 {
    static Scanner teclado;
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

    public static boolean casoDePrueba() {
        if (!teclado.hasNext())
            return false;
        else {
            int toros = teclado.nextInt();
            int velocidad_corredor = 0;
            for (int i = 0; i < toros; i++) {
                int velocidad_toros = teclado.nextInt();
                if (velocidad_toros>velocidad_corredor){
                    velocidad_corredor=velocidad_toros;
                }
            }
            System.out.println(velocidad_corredor);
            teclado.nextLine();
            return true;
        }
    }
}
