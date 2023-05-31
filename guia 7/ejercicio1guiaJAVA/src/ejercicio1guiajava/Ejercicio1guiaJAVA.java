/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package ejercicio1guiajava;

import java.util.Scanner;

public class Ejercicio1guiaJAVA {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num1, num2, suma;
        
        System.out.println("ingrese el primer numero");
        num1 = leer.nextInt();
        
        System.out.println("ingrese el segundo numero");
        num2 = leer.nextInt();
        
        int retorno = sumar(num1, num2);
        
        System.out.println("La suma de los numeros es: " + retorno);
        
    }
    public static int sumar(int num1, int num2){
        int suma;
                suma = num1 + num2;
                return suma;
                
    }
}


