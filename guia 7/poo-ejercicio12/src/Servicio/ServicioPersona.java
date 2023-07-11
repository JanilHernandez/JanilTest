
package Servicio;

import Entidades.Persona;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class ServicioPersona {
    Scanner read = new Scanner(System.in);
    //Agregar un método de creación del objeto que respete la siguiente firma:
//crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
//usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
//fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
    
    public Persona crearPersona(){
        Persona p = new Persona();
        
        System.out.println("Insert your name");
        p.setName(read.next());
        
        int dia, mes, año;
        
        System.out.println("Insert day of your birth");
        dia = read.nextInt();
        
        System.out.println("Insert month of your birth");
        mes = read.nextInt();
        
        System.out.println("Insert year of your birth");
        p.setAño(read.nextInt());
        
        LocalDate date1 = LocalDate.of(p.getAño(), mes, dia);    
        System.out.println(date1);
        
        return null;
    }
    
    //Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
//en cuenta que para conocer la edad de la persona también se debe conocer la fecha
//actual.
    
    public int calcularEdad(){
        LocalDate todaysDate = LocalDate.now();
        System.out.println(todaysDate);
        Calendar cal= Calendar.getInstance();
        int years = cal.get(Calendar.YEAR);
        System.out.println("Insert year again");
        int año = read.nextInt();
        int edad = Math.abs(año - years);
        
        return edad;
    }
    
    //Metodo mostrarPersona(): este método muestra la persona creada en el método
//anterior.
}
