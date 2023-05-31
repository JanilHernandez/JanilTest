/*
 * Define una variable de tipo boolean, double y char. Guarda información en ellas a través del
Scanner.
 */


package ejercicio6teorico;

import java.util.Scanner;

/**
 *
 * @author Ryzen 5 3600
 */
public class Ejercicio6teorico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       boolean bandera;
       
       double decimal;
       
       char letra;
       
       System.out.println("ingresa un decimal");
       decimal = leer.nextDouble();
       
        System.out.println("ingresa true or false");
       bandera = leer.nextBoolean();
       
       System.out.println("ingresa una letra");
       letra = leer.next().charAt(0);
       
       System.out.println(bandera + " " + decimal + " " + letra );
    }
    
}
