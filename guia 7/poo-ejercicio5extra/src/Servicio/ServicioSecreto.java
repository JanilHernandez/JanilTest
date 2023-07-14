
package Servicio;

import Entidades.Secreto;
import java.util.Scanner;

public class ServicioSecreto {
    
    Secreto s = new Secreto();
    Scanner leer = new Scanner(System.in);
    
    public void crearArreglo(){
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "setiembre", "octubre", "noviembre", "diciembre"};
        
    s.setMes(meses);
    
    s.setMesSecreto(meses[7]);
    }
    
    public void adivinar(){
        
        String respuesta;
                
        do {
            System.out.println("Ingrese el mes secreto");
            respuesta = leer.next();
            
            if (respuesta == null ? s.getMesSecreto() == null : respuesta.equals(s.getMesSecreto())) {
            System.out.println("Adivinaste, el mes secreto es agosto!");
        }else{
            System.out.println("Incorrecto, intentá de nuevo");
        }
            
        } while (!respuesta.equals(s.getMesSecreto()));
        
    }
}
