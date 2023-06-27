/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package ejerciciosjava;

// importar la clase scanner desde java.util
import java.util.Scanner;
/**
 *
 * @author Ryzen 5 3600
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// crear una variable scanner que utiliza para leer datos delusuario
//el nombre de la variable es leer
        Scanner leer = new Scanner(System.in);
        
// se crea una variable cadena -string- que se utiliza para datos de usuario
        String nombre;
        
// muestra el mensaje por pantalla
        System.out.println("Ingresa tu nombre:");
        
// leemos el nombre de la persona en la variable nombre
        nombre = leer.next();

// mostramos por consola un saludo
        System.out.println("Hola mundo soy " + nombre + " y estoy programando en java");
    }
    
}
