/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú.
 */
package ejerciciosjava;
import java.util.Scanner;
public class Ejercicio11guiaJAVA {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, opcionMenu;
        double sumar, restar, multiplicar, dividir;
        System.out.println("Ingrese el primer numero");
        num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        num2 = leer.nextInt();
        
        System.out.println("MENU");
        System.out.println("1. Sumar"); 
        System.out.println("2. restar"); 
        System.out.println("3. multiplicar"); 
        System.out.println("4. dividir"); 
        System.out.println("5. salir"); 
        
        System.out.println("Ingrese una opcion");
        opcionMenu = leer.nextInt();
        
        switch(opcionMenu){
            case 1:
                sumar = num1 + num2;
                System.out.println("La suma es: " + sumar);
                break;
            case 2:
                restar = num1 - num2;
                System.out.println("La suma es: " + restar);
                break;
            case 3:
                multiplicar = num1 * num2;
                System.out.println("La suma es: " + multiplicar);
                break;
            case 4:
                dividir = num1 / num2;
                System.out.println("La suma es: " + dividir);
                break;
            case 5:
                System.out.println("Salir");
                break;
        }
    }
    
}
