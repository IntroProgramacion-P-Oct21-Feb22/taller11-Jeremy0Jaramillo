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
public class Problema6 {
    public static void main(String[] args) {
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        double media = obtenerMedia(informacion);
        double varianza = obtenerVarianza(informacion, media);
        
        System.out.printf("Media = %.2f \nDesviación estándar = %.2f\n", media, varianza);
        
        
    }
    
    
    
        public static double obtenerMedia(int[] datos) {
        int operacion = 0;
        
            for (int columnas = 0; columnas < datos.length; columnas++) {

                operacion = operacion + datos[columnas];

            }
        operacion = operacion/9;
        return operacion;
        }
        
        public static double obtenerVarianza(int[]datos, double media){
        
           double operacion = Math.pow((datos[0]-media), 2) + Math.pow((datos[1]-media), 2) +
                   Math.pow((datos[2]-media), 2) + Math.pow((datos[3]-media), 2) +
                   Math.pow((datos[4]-media), 2) + Math.pow((datos[5]-media), 2) + Math.pow((datos[6]-media), 2) +
                   Math.pow((datos[7]-media), 2) +Math.pow((datos[8]-media), 2);
        
        operacion = operacion/8;
        operacion = Math.sqrt(operacion);
        
        return operacion;
        }
        
    }

