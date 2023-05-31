/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
Java.
 */
package ejercicio3guiajava;
import java.util.Scanner;
public class Ejercicio3guiaJAVA {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
        String frase, mayusculas, minusculas;
        
        System.out.println("Escriba una frase");
        frase = leer.nextLine();
        
        mayusculas = frase.toUpperCase();
        System.out.println(mayusculas);
        
        minusculas = frase.toLowerCase();
        System.out.println(minusculas);
    }
    
}
