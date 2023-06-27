/*
 Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package ejerciciosjava;
import java.util.Scanner;
public class JavaApplication32 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int[] Vector = new int[101];
       
       int numero;
       
       llenarVector(Vector);
       
       System.out.println("Ingrese el numero que desea buscar en el vector");
       numero = leer.nextInt();
       
       BuscarNumero(Vector, numero);
    }
    
    public static void llenarVector(int[] Vector) {
        int llenado, aleatorio;
        
        for (llenado = 0; llenado  < Vector.length; llenado++){
            aleatorio = (int)(Math.random()*10);
            Vector[llenado] = aleatorio;
        }
            System.out.print(llenado);
     }

    public static void BuscarNumero(int[] Vector, int numero) {
        int i;
        
       for (i = 0; i < Vector.length; i++ ){
           if (Vector[i] == numero){
               
               System.out.println("Su numero se encuentra en la posicion " + i);
               
           }
       }
    }
   }

