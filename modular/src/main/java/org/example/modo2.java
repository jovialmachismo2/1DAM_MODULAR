package org.example;

import java.util.Scanner;

    public class modo2 {
        static Scanner teclado;

        public static void main(String[] args) {
            teclado = new java.util.Scanner(System.in);
            while (casoDePrueba()) {
            }
        }

        public static boolean casoDePrueba() {
                int y = teclado.nextInt();
                int x = teclado.nextInt();
                if (x < 0 || y < 0)
                return false;
                else {
                    System.out.println((x+y)*2);
                    return true;
                }
            }
        }
