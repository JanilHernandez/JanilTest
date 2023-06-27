/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
investigar la función Substring y equals() de Java.
 */
package ejerciciosjava;
import java.util.Scanner;
public class Ejercici9guiaJAVA {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);  
        
        String frase;
        char letra;
        
         System.out.println("Ingrese una frase");
         frase = leer.nextLine();
         letra = frase.charAt(0);
         
          if (letra == 'a'){
              System.out.println("CORRECTO");
         } else {
              System.out.println("INCORRECTO");
         }
    }
    
}
    
