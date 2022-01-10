/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema5 {

    public static void main(String[] args) {
        int suma;
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        suma = imprimirDatos(informacion);
        System.out.println(suma);
    }

    public static int imprimirDatos(int[][] datos) {
        int operacion = 0;
        for (int filas = 0; filas < 3; filas++) {
            for (int columnas = 0; columnas < 3; columnas++) {

                operacion = operacion + datos[filas][columnas];

            }

        }
        return operacion;
    }
}
