package org.example;

import java.util.Scanner;

    public class modo1 {

        static Scanner teclado;

        public static void main(String[] args) {

            teclado = new Scanner(System.in);

            int numCasos = teclado.nextInt();
            teclado.nextLine();
            for (int i = 0; i < numCasos; i++) {
                casoprueba();
            }
        }
        public static void casoprueba() {
            String nombre[] = teclado.nextLine().split(" ");
            System.out.println("Hola, " + nombre[1]+".");
        }

    }
