package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4_metodos {
    static void main(String[] args) {

        double datos[] = new double[6];

        System.out.println(Arrays.toString(matriz(datos)));

        System.out.println(diamaximo(datos));

        double media = media(datos);
        System.out.println(media(datos));

        double domingo = domingo(datos);
        System.out.println(domingo(datos));

        if (domingo > media){
            System.out.println("SI");
        }else {
            System.out.println("NO");
        }

    }

    public static double[] matriz(double[] datos){
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < datos.length; i++) {
            System.out.println("Introduce recaudacion del dia");
            double ganancias = teclado.nextDouble();
            datos[i] = ganancias;
        }
        return datos;
    }
    public static String diamaximo(double[] datos) {
        double mayor_venta = datos[0];
        int pos_mayor = 0;

        for (int i = 0; i < datos.length; i++) {

            if (mayor_venta < datos[i]){
              mayor_venta = datos[i];
              pos_mayor = i;
            }
        }
        return dia_semana(pos_mayor);

    }
    public static String dia_semana(int dia_mayor){
        switch (dia_mayor){
            case 0:
                return "MARTES";
            case 1:
                return "MIERCOLES";
            case 2:
                return "JUEVES";
            case 3:
                return "VIERNES";
            case 4:
                return "SABADO";
            case 5:
                return "DOMINGO";
        }
        return "";
    }
    public static double media(double datos[]){
        double acumulado = 0;

        for (int i = 0; i < datos.length; i++) {
            acumulado+=datos[i];
        }
        return (acumulado/datos.length);
    }
    public static double domingo(double datos[]){
        return datos[datos.length-1];
    }

}
