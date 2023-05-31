/*
 Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar
el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
 */
package ejercicio10teorico;

import java.util.Scanner;
 
public class Ejercicio10teorico {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int numero, contador, suma;
        contador = 0;
        suma = 0;        
                
        do {
            
        System.out.println("Ingrese un numero");
        numero = leer.nextInt();
        
        contador = contador + 1;
        
        if (numero == 0 ){
            break; 
        } else if (numero > 0 ){
            suma = suma + numero;   
        }
            
        }while (contador < 20);    
        
         System.out.println("La suma de los numeros es " + suma);
    }
    
}
