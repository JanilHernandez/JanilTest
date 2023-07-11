/*
Escribir un programa en Java que simule un servicio de alquiler de películas. El programa debe tener una clase Pelicula
que represente los datos de una película, como el título, el género, el año y la duración. El programa también debe tener
una clase Alquiler que represente los datos de un alquiler, como la película alquilada, la fecha de inicio, la fecha de fin y
el precio.
El programa puede usar la clase Date para manejar las fechas, la clase Arrays para almacenar y ordenar las películas y
los alquileres, la clase Math para calcular el precio según la duración y el género de la película, y la clase String para
manipular los textos.
El programa debe permitir al usuario ingresar los datos de las películas disponibles y los datos de los alquileres
realizados, y mostrar por pantalla un menú con las opciones de cargar una pelicula, hacer una lista de todas las peliculas
disponibles, crear un alquiler, realizar una lista de todos los alquileres, buscar peliculas por titulo o por genero y buscar
alquileres por fecha.
Metodos de ambas entidades (realizar los metodos en las clases de
servicio):
Crear Película
Crear Alquiler
Listar todas las películas disponibles
Listar todas los alquileres
Buscar una película por título (Decir si se existe o no)
Buscar una película por género (Decir si se existe o no)
Buscar un alquiler por fecha (Decir si se existe o no, y si existe, mostrar los datos del alquiler)
Calcular el ingreso total del servicio (El alquiler cuesta $10, por 3 días. Por cada día extra, se aumenta un 10% de
interés.)
 */
package main;
import Entity.Film;
import Entity.Rental;
import Service.FilmService;
import Service.RentalService;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FilmService fs1 = new FilmService();
        RentalService sr1 = new RentalService();
        Rental[] r1 = new Rental[1];
        Film[] f1 = new Film[1];
        
        for (int i = 0; i < f1.length; i++) {
            f1[i] = fs1.createFilm();
        }
        for (int i = 0; i < f1.length; i++) {
            fs1.showFilm(f1[i]);
        }
        for (int i = 0; i < f1.length; i++) {
            r1[i] = sr1.createRental(f1[i]);
        }
        for (int i = 0; i < r1.length; i++) {
            sr1.showRental(r1[i]);
        }
        
       Date d = null;
        Scanner read = new Scanner(System.in);
        System.out.println(">>>Enter searching date");
        System.out.println(">>>dd");
        d.setDate(read.nextInt());
        System.out.println(">>>mm");
        d.setMonth(read.nextInt());
        System.out.println(">>>yyyy");
        d.setYear(read.nextInt());
        if (sr1.searchRentalByDate(r1, d)) {
            System.out.println("--->The rental is:");
            sr1.showRental(sr1.showRentalByDate(r1, d));
        }else{
            System.out.println("¡The rental doesn't exist!");
        }
    }   
}

