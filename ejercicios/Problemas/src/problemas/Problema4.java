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
public class Problema4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String confirmar;

        System.out.println("Escriba (1) si desea calcular el Valor de luz, de lo contrario"
                + " puede ingresar (2) para calcular el Valor del predio");
        confirmar = entrada.nextLine();

        if (confirmar.equals("1")) {
            obtenerCalcularValorLuz();

        } else {
            if (confirmar.equals("2")) {
                obtenerCalcularPredio();

            }
        }

    }

    public static void obtenerCalcularValorLuz() {
        Scanner entrada = new Scanner(System.in);
        String nombre_cliente;
        int cedula;
        double valor_kilovatios;
        int numero_kilovatios;
        double operacion;
        
        System.out.println("Ingrese su nombre");
        nombre_cliente = entrada.nextLine();
        
        System.out.println("Ingrese su número de cédula");
        cedula = entrada.nextInt();

        System.out.println("Ingrese el valor del kilovatio");
        valor_kilovatios = entrada.nextDouble();

        System.out.println("Ingrese el número de kilovatios consumidos en el mes");
        numero_kilovatios = entrada.nextInt();

        operacion = valor_kilovatios * numero_kilovatios;

        System.out.printf("Cliente %s con cedula %d debe cancelar el valor de $%.2f\n",
                nombre_cliente, cedula, operacion);

    }
    
    public static void obtenerCalcularPredio(){
        Scanner entrada = new Scanner(System.in);
        String nombre_cliente;
        int cedula;
        double valor_inmueble;
        double operacion;
        
        System.out.println("Ingrese su nombre");
        nombre_cliente = entrada.nextLine();
        
        System.out.println("Ingrese su número de cédula");
        cedula = entrada.nextInt();
        
        System.out.println("Ingrese el valor del Inmueble");
        valor_inmueble = entrada.nextInt();
        
        operacion = (valor_inmueble * 2)/100;
        System.out.printf("Cliente %s con cédula %d tiene un inmueble valorado en $%.2f y"
                + " tiene que pagar de predio $%.2f\n", nombre_cliente, cedula, valor_inmueble, operacion);
      
    }
    
    

}
