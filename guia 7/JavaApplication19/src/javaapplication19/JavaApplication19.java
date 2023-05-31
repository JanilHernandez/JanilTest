/*
 * Dada una cantidad de grados Celsius se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package javaapplication19;

import java.util.Scanner;

public class JavaApplication19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int temperatura;
        
        System.out.println("Ingrese una temperatura en la escala Celsius");
        temperatura = leer.nextInt();
        
        System.out.println(equivalencia(temperatura));
        
    }
    public static int equivalencia(int temperatura){
         int  fahrenheit;
        
        fahrenheit = 32 + (9*temperatura/5);
         return fahrenheit;
    }
}
