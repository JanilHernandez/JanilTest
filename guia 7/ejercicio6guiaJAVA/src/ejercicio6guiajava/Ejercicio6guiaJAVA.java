/*
 Crear un programa que dado un numero determine si es par o impar.
 */
package ejercicio6guiajava;
import java.util.Scanner;
public class Ejercicio6guiaJAVA {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int numero, modulo;
        
        System.out.println("Escriba un numero");
        numero = leer.nextInt();
        
        modulo = numero % 2;
        if (modulo == 0){
          System.out.println("El numero es par");  
        } else if(modulo != 0){
          System.out.println("El numero es impar");             
        }
    }
}
