/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
*/

package ejercicio2guiajava;
import java.util.Scanner;
public class Ejercicio2guiaJAVA {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        
        String nombre;
        
        System.out.println("Escriba su nombre");
        nombre = leer.nextLine();
        
        System.out.println("Su nombre es: " + nombre);
    }
    
}
