
package Servicios;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class ServicioMascota {
    
    private final Scanner leer = new Scanner(System.in);
    
    //metodo especifico para crear mascotas
    public Mascota crearMascota(){
        
        System.out.println("Introducir nombre");
        String nombre  = leer.next();
        
        System.out.println("Introducir apodo");
        String apodo  = leer.next();
        
        System.out.println("Introducir tipo");
        String tipo  = leer.next();
        
        Mascota m;
        m = new Mascota (nombre, apodo, tipo);
        
        return m;
        
    }
}
