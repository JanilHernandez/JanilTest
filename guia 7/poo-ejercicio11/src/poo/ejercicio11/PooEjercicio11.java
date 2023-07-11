/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package poo.ejercicio11;

import Entity.Date;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class PooEjercicio11 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int day, month, year;
        
        System.out.println("Insert day:");
        day = read.nextInt();
        
        System.out.print("Insert month:");
        month = read.nextInt();
        
        System.out.println("Insert year");
        year = read.nextInt();
        
        Date d = new Date(day, month, year);
        System.out.println(d.getDay() + "/" + d.getMonth() + "/" + d.getYear());
        
        LocalDate todaysDate = LocalDate.now();
        System.out.println(todaysDate);
        
        Calendar cal= Calendar.getInstance();
        int years = cal.get(Calendar.YEAR);
        
        System.out.println(years);
        
        int diferenciaAños = Math.abs(d.getYear() - years);
        
        System.out.println("La cantidad de años que hay entre esas fechas es: " + diferenciaAños);

    }
}
    
