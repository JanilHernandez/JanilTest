/*
 Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package ejerciciosjava;

import java.util.Scanner;

public class Ejercico11teorico {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         
         int numero, i, j;
         String asteriscos;
         numero = 0;
         asteriscos = "";
         
        System.out.println("Ingrese un numero entre 0 y 20");
       
        
        for(i = 1; i <= 4; i++) {
            numero = leer.nextInt();
            System.out.print(numero + " ");
           for (j = 1; j <= numero; j++){
                System.out.print("*");
            }
                System.out.println();
        }
        
            
    }
    
}
