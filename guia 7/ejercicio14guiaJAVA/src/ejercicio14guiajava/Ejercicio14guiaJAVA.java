/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package ejercicio14guiajava;
import java.util.Scanner;
public class Ejercicio14guiaJAVA {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        double euros, libras, dolares, yenes;
        
        System.out.println("Ingrese el monto en euros que desee convertir");
        euros = leer.nextInt();
            
         equivalencia(euros, "libras");
         equivalencia(euros, "dolares");
         equivalencia(euros, "yenes");
    }
    public static void equivalencia (double euros, String moneda){
            System.out.println(moneda);
        switch(moneda){
            case "libras":
                System.out.println(euros + " Euros equivale a: " + euros*0.86 + " libras");
                break;
            case "dolares":
                System.out.println(euros + " Euros equivale a: " + euros*1.28611 + " dolares");
                break;
            case "yenes":
                System.out.println(euros + " Euros equivale a: " + euros*129.852 + " yenes");   
                break;
        }
        
    }
}
