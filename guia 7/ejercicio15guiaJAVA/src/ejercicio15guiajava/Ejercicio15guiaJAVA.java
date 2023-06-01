/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package ejercicio15guiajava;
import java.util.Scanner;
public class Ejercicio15guiaJAVA {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] Vector = new int[101];
        
        llenarVector(Vector);
    }
     public static void llenarVector(int[] Vector) {
        int llenado;
        
        for (llenado = 0; llenado <= 100; llenado--){
            Vector[llenado] = llenado;
        }
            System.out.print(llenado);
     }
}