
package Service;

import Entity.Point;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class ServicePoint {
    Scanner read = new Scanner(System.in);
    Point p = new Point();
    //método crearPuntos() que le pide al usuario los dos números y los ingresa en los atributos del objeto.
    public void crearPuntos(){
        
        System.out.println("Insert x1 value");
        p.setX1(read.nextDouble());
        
        System.out.println("Insert y1 value");
        p.setY1(read.nextDouble());
        
        System.out.println("Insert x2 value");
        p.setX2(read.nextDouble());
        
        System.out.println("Insert y2 value");
        p.setY2(read.nextDouble());
    }
    
    //método calcular y devolver la distancia que existe entre los dos puntos que existen en la clase Puntos.
    public double distanceCalc(){
        Double distance;
        
        Double xy2 = Math.pow((p.getX2()-p.getX1()), 2)+Math.pow((p.getY2()-p.getY1()), 2);
                
        distance = sqrt(xy2);
                
        
        return distance;
        
    }
    
    
}
