/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package ejercicio15guia7;
import java.util.Scanner;


public class Ejercicio15guiaJAVA {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] Vector = new int[101];
        
        int i;
        llenarVector(Vector);
    
        for (i = 0; i < Vector.length; i++){
            System.out.println(i + " " +Vector[i]);
        }
            
    }
     public static void llenarVector(int[] Vector) {
        int llenado, limite;
        limite = 100;
        
        for (llenado = 0; llenado  < Vector.length; llenado++){
            Vector[llenado] = limite;
            limite--;
        }
            System.out.print(llenado);
     }
}