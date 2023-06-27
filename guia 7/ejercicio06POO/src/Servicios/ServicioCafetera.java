
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

public class ServicioCafetera {
    Scanner leer = new Scanner(System.in);
    
    public Cafetera llenarCafetera(){
        
        System.out.println("Ingrese la capacidad maxima de la cafetera");
        double cantidadMaxima = leer.nextDouble();
        
       // capacidadActual = cantidadMaxima;
        
        
      //  return new Cafetera(capacidadMaxima, cantidadActual);
    }
    
}
