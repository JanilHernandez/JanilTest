/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.

a e i o u
@ # $ % *

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 */
package ejercicio12teorico;

import java.util.Scanner;

public class Ejercicio12teorico {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
        String cadena;
        
        System.out.println("Ingrese una frase terminada en punto");
        cadena = leer.nextLine();   
        
        Codificacion(cadena);
        
    }
    
    public static void Codificacion(String Cadena){
        int i;
        int longitud;
        char letra;
        
        Cadena = Cadena.replace('a', '@');
        System.out.println(Cadena);
        Cadena = Cadena.replace('e', '#');
        System.out.println(Cadena);
        Cadena = Cadena.replace('i', '$');
        System.out.println(Cadena);
        Cadena = Cadena.replace('o', '%');
        System.out.println(Cadena);
        Cadena = Cadena.replace('u', '*');
        System.out.println(Cadena);
        
        
    }
}
