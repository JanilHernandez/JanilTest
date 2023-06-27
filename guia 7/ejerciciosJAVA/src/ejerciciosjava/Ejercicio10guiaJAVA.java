/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
 */
package ejerciciosjava;
import java.util.Scanner;
public class Ejercicio10guiaJAVA {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        
        int limite, suma, numero;
        suma = 0;
        System.out.println("Ingrese un valor limite");
        limite = leer.nextInt();
        
        do{
            System.out.println("Ingrese un numero");
        numero = leer.nextInt();
        
            suma = suma + numero;
            
        }while (suma <= limite);
        
        System.out.println("La suma es: " + suma);
    }
    
}
