/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double resultado;
        int numero;
        double lado;
        double base;
        double altura;

        System.out.println("Ingrese \"1\" para calcular el área de un cuadrado, \"2\" para calcular el área de un"
                + " triangulo o \"3\" para calcular el área de un rectángulo.");
        numero = entrada.nextInt();

        if (numero == 1) {
            System.out.println("Ingrese la medida de un lado del cuadrado");
            lado = entrada.nextDouble();
            resultado = obtenerAreaCuadrado(lado);
            System.out.printf("El área del cuadrado es %.2f\n",resultado);
        } else {
            if (numero == 2) {
                System.out.println("Ingrese la medida de la base del triángulo");
                base = entrada.nextDouble();
                System.out.println("Ingrese la medida de la altura del triángulo");
                altura = entrada.nextDouble();
                resultado = obtenerAreaTriangulo(base, altura);
                System.out.printf("El área del triángulo es %.2f\n",resultado);
            } else {
                if (numero == 3) {
                    System.out.println("Ingrese la medida de la base del rectángulo");
                    base = entrada.nextDouble();
                    System.out.println("Ingrese la medida de la altura del rectángulo");
                    altura = entrada.nextDouble();
                    resultado = obtenerAreaRectangulo(base, altura);
                    System.out.printf("El área del recángulo es %.2f\n",resultado);
                }

            }
        }
    }

    public static double obtenerAreaCuadrado(double a) {
        double v1;
        v1 = a * a * a * a;
        return v1;
    }

    public static double obtenerAreaTriangulo(double a, double b) {
        double v1;
        v1 = (a * b) / 2;
        return v1;
    }

    public static double obtenerAreaRectangulo(double a, double b) {
        double v1;
        v1 = a * b;
        return v1;
    }

}
