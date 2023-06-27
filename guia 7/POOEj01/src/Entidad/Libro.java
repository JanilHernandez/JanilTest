
package Entidad;

import java.util.Scanner;

public class Libro {
    
    public int isbn;
    public String titulo;
    public String autor;
    public int numeroDePaginas;
    
    public Libro(){
        
    }
    
    public Libro(int isbn, String titulo, String autor, int numeroDePaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }
    
    public void cargarLibro(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese isbn del libro");
        isbn = leer.nextInt();
        
        System.out.println("Ingrese el titulo del libro");
        titulo = leer.next();
        
        System.out.println("Ingrese el autor del libro");
        autor = leer.next();
        
        System.out.println("Ingrese el numero de paginas del libro");
        numeroDePaginas = leer.nextInt();
    }
    
    public void mostrarDatosLibro(){
        
        System.out.println("El isbn del libro es: " + isbn);
        System.out.println("El titulo del libro es: " + titulo);
        System.out.println("El autor del libro es: " + autor);
        System.out.println("El numero de paginas del libro es: " + numeroDePaginas);
    }
}
