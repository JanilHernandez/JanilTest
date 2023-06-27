
package mascotapp.entidades;

import java.util.Date;

public class Usuario {

    public String nombre;
    public String apellido;
    public int cedula;
    public Date nacimiento;
    public String pais;
    
    
    //constructor
   public Usuario(){ 
   }

    public Usuario(String nombre, String apellido, int cedula, Date nacimiento, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.nacimiento = nacimiento;
        this.pais = pais;
    }
   
   
}
 