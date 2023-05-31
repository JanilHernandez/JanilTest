/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
package ejercicio5guiajava;
import java.util.Scanner;
public class Ejercicio5guiaJAVA {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         
         double num, doble, triple, raiz;
         
         System.out.println("Ingrese un numero");
        num = leer.nextInt();
        
        doble = num*2;
        triple = num*3;
        raiz = Math.sqrt(num);
        
        System.out.println("El doble del numero es " + doble +"El triple del numero es " + triple + "La raiz cuadrada del numero es " + raiz );
    }
    
}
