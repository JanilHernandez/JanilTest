/*
Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25.
 */
package ejerciciosjava;

import java.util.Scanner;

public class JavaApplication1 {

  
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         
         int num1;
         int num2;
         
         System.out.println("Ingresa un numero");
         num1 = leer.nextInt();
         
         System.out.println("Ingresa un segundo numero");
         num2 = leer.nextInt();
         
         if (num1 == 25 && num2 == 25) {
            System.out.println("Numero 1 y el 2 son iguales a 25");
         } else if (num1 == 25) {
            System.out.println("Numero 1 es igual a 25");
         } else if (num2 == 25) {
            System.out.println("Numero 2 es igual a 25");
         }     
    }
    
}
