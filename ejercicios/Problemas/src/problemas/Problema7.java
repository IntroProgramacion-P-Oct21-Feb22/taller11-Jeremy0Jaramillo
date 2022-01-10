/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int columnas;

        System.out.println("Ingrese el número de elementos para el arreglo");
        columnas = entrada.nextInt();
        String[] nombres_ciudad = new String[columnas];

        nombres_ciudad = obtenerNombresCiudad(columnas, nombres_ciudad);

        System.out.printf("\nDe los nombres ingresados: %s\nÚnicamente: ", Arrays.toString(nombres_ciudad));

        obtenerNombres45(nombres_ciudad);

        System.out.printf("tienen cuatro o cinco caracteres\n");

    }

    public static String[] obtenerNombresCiudad(int columnas, String[] a) {
        Scanner entrada = new Scanner(System.in);

        for (int b = 0; b < columnas; b++) {
            System.out.printf("Ingrese el nombre de la ciudad para la posición (%d) del arreglo.\n", b);
            a[b] = entrada.nextLine();

        }

        return a;
    }

    public static void obtenerNombres45(String[] a) {

        for (int b = 0; b < a.length; b++) {
            String rango = a[b];

            if ((rango.length() == 4) || (rango.length() == 5)) {
                System.out.printf("%s ", a[b]);

            }

        }

    }

}
