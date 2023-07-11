package Servicio;

import Entidades.persona;
import java.util.Scanner;

public class ServicioPersona {
   /*Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje*/
   Scanner leer = new Scanner(System.in);
   persona p = new persona();
   
    
    public persona crearPersona(){
        System.out.println("Ingrese su nombre:");
        p.setNombre(leer.next());
        
        System.out.println("Ingrese su edad:");
        p.setEdad(leer.nextInt());
        
        System.out.println("Indique su sexo (H para hombre,M para mujer,O para otro");
        String sexo = leer.next();
        p.setSexo(sexo);        
       switch (sexo) {
           case "H":
               System.out.println("Usted indico -hombre-");
               break;
           case "M":
               System.out.println("Usted indico -mujer-");
               break;
           case "O":
               System.out.println("Usted indico -otro-");
               break;
           default:
               System.out.println("Ingrese una opcion valida.");
               break;
       }
        System.out.println("Ingrese su peso");
        p.setPeso(leer.nextInt());
        
        System.out.println("Ingrese su altura en centímetros");
        p.setAltura(leer.nextInt());
        
        return null;
    }
       
    /* Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.*/
    
    public void calcularIMC(){
        int kg = p.getPeso();
        int m2 = p.getAltura()/100;
        
        int IMC = kg / m2;
        
        if (IMC < 20) {
            System.out.println("Debajo del peso ideal -1");
        }else if (IMC == 20 || IMC <= 25 ) {
            System.out.println("Peso ideal 0");
        }else{
            System.out.println("Encima del peso ideal 1");
        }
    }
    //Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
//devuelve un booleano.
    
    public void esMayorDeEdad(){
        boolean edad = true;
        
        if (p.getEdad() >= 18) {
            edad = true;
            System.out.println("Es mayor de edad");
        }
    }
}
