
package Servicio;

import Entidades.Rectangulo;
import java.util.Scanner;


public class RectanguloServicio {
    //La clase incluirá un método para crear el rectángulo
//con los datos del Rectángulo dados por el usuario.
    
    Rectangulo r1 = new Rectangulo();
    Scanner leer = new Scanner(System.in);
    
    public Rectangulo crearRectangulo(){
        System.out.println("Ingrese la base del rectángulo");
        r1.setBase(leer.nextInt());
        
        System.out.println("Ingrese la altura del rectángulo");
        r1.setAltura(leer.nextInt());
        
        return null;
    }
    
    //También incluirá un método para
//calcular la superficie del rectángulo y un método para calcular el perímetro del
//rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
//asteriscos usando la base y la altura. Superficie = base * altura / Perímetro = (base + altura) * 2.
    
    public int perimetroRectangulo(){
        int p = r1.getAltura() + r1.getBase();
        int perimetro = p*2;
        
        return perimetro;
    }
    
    public int areaRectangulo(){
        int area = r1.getAltura()*r1.getBase();
        return area;
    }
}
