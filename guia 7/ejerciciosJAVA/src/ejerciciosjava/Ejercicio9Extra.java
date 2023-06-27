/*
 Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
este resultado es el residuo, y el número de restas realizadas es el cociente.
 */
package ejerciciosjava;
import java.util.Scanner;
public class Ejercicio9Extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num1, num2, resultado, contador;
        contador = 0;
        
        System.out.println("Ingrese el numero que desea dividir");
        num1 = leer.nextInt();
        
         System.out.println("Ingrese el numero por el cual desea dividir al primer numero");
        num2 = leer.nextInt();
        
        resultado = 0;
         
        do {
            if(contador >= 1){
                resultado = funcion(resultado, num2);
            } else {
                resultado = funcion(num1, num2);
            }
            
            contador ++;
            
        } while (resultado > num2);
        
        System.out.println("Se realizaron " + contador + " restas " + "y el resultado es : " + resultado);
    }
    
    public static int funcion(int num1, int num2) {
        
        int resultado = num1 - num2;
        
        return resultado;
    }
}
