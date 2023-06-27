
package mascotapp;

import Servicios.ServicioMascota;
import java.util.Scanner;
import mascotapp.entidades.Mascota;



public class Mascotapp {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Asignacion y creacion del primer objeto
        Mascota m1 = new Mascota();
        
        m1.apodo = "Chiquito";
        m1.nombre = "Fernando Chiquito";
        m1.tipo = "Perro";
        m1.edad = 14;
        m1.raza = "Beagle";
        m1.cola = true;
        m1.color = "Tricolor";
        
        System.out.println(m1.apodo + " " + m1.edad + " " + m1.tipo);
                
        System.out.println(m1);
        
        m1.pasear(100);
        
        ServicioMascota sm = new ServicioMascota();
        
        Mascota m2 = sm.crearMascota();
        
        System.out.println(m1.toString());
        
    }
    
}
