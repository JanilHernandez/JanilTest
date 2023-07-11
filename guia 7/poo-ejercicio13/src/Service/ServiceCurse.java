/*
 
 */
package Service;
import Entity.Curse;
import java.util.Scanner;
public class ServiceCurse {
    
    /*
 método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
 */
     Curse c = new Curse();
     Scanner read = new Scanner(System.in);
    
    public void cargarAlumnos(){
         String[] aux = new String[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del estudiante");
            aux[i] = read.next();  
        }
        c.setAlumnos(aux);
    }
    
    /*Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos*/
    
    public void crearCurso(){
        String nombreCurs, turn;
        int cantidadHora, cantidadDiasPorSeman, precioPorHor;
        String[] alumno;
        
        System.out.println("Ingrese el nombre del curso");
        nombreCurs = read.next();
        c.setNombreCurso(nombreCurs);
        
        System.out.println("Ingrese la cantidad de horas");
        cantidadHora = read.nextInt();
        c.setCantidadHoras(cantidadHora);
        
        System.out.println("Ingrese la cantidad de dias por semana");
        cantidadDiasPorSeman = read.nextInt();
        c.setCantidadDiasPorSemana(cantidadDiasPorSeman);
        
        System.out.println("Ingrese el turno (mañana o tarde)");
        turn = read.next();
        c.setTurno(turn);
        
        System.out.println("Ingrese el precio por hora");
        precioPorHor = read.nextInt();
        c.setPrecioPorHora(precioPorHor);
        
        cargarAlumnos();
    }
    
    /*Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.*/
    
    
    public int calcularGananciaSemanal(){
        int ganancia;
        ganancia = c.getCantidadDiasPorSemana() * c.getCantidadHoras() * c.getPrecioPorHora() * 5;
        
        return ganancia;
    }
}
