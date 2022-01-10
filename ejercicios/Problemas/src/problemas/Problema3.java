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
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String promedio;
        double[] notas= {0,0,0,0};
        for(int filas = 0; filas < 4; filas++){
        System.out.printf("Ingrese un valor para la posicion (%d) del arreglo\n", filas);
        notas[filas] = entrada.nextDouble();
        }
        promedio = obtenerPromedioCualitativo(notas);
        System.out.printf("El promedio de las notas  %.1f  %.1f  %.1f  %.1f  es %s\n", notas[0], notas[1],
                notas[2], notas[3], promedio);
    }
    
    public static String obtenerPromedioCualitativo(double notas[]){
    double v1 = 0;
    String cualidad = "";
    
    for(int filas = 0; filas < 4; filas++){
    v1 = v1 + notas[filas];
    }
    v1 = v1/4;
    
    if ((v1 >= 0) && (v1<=5)){
    cualidad = "Regular";
    }else{
    if ((v1 >= 5.1) && (v1<=8)){
    cualidad = "Bueno";
    }else{
    if ((v1 >= 8.1) && (v1<=9)){
    cualidad = "Muy Bueno";
    }else{
    if ((v1 >= 9.1) && (v1<=10)){
    cualidad = "Sobresaliente";
    }
    }
    }
    }
    return cualidad;
    }
    
    
    
    
    
    
}
