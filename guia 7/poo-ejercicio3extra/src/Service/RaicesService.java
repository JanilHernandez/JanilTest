
package Service;

import Entity.Raices;
import java.util.Scanner;

public class RaicesService {
    Scanner read = new Scanner(System.in);
    Raices r = new Raices();
    
    public void crearVariables(){
        System.out.println("Ingrese el valor de a");
        r.setA(read.nextInt());
        
        System.out.println("Ingrese el valor de b");
        r.setB(read.nextInt());
        
        System.out.println("Ingrese el valor de c");
        r.setC(read.nextInt());        
    }
	
    // Método getDiscriminante(): devuelve el valor del discriminante (double). El
//discriminante tiene la siguiente formula: (b^2)-4*a*c
    
    public Double getDiscriminante(){
        double discriminante;
        discriminante = ((r.getB()^2)-4*r.getA()*r.getC());
        return discriminante;
    }
    
    //método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
//que esto ocurra, el discriminante debe ser mayor o igual que 0.
    
    public boolean tieneRaices(){
        return (getDiscriminante() > 0 );
    }
    
    // Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
//que esto ocurra, el discriminante debe ser igual que 0.
    
    public boolean tieneRaiz(){
		return (getDiscriminante() == 0);
	}
    
    /*Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje. */
    
    public void obtenerRaices() {
		System.out.println("La primera solucion es:");
		System.out.println(-r.getB()+Math.sqrt(getDiscriminante())/(2*r.getA()));
		System.out.println("La segunda solucion es:");
		System.out.println(-r.getB()-Math.sqrt(getDiscriminante())/(2*r.getA()));
	}
    
    public void obtenerRaiz() {
		System.out.println("La solucion es:");
		System.out.println(-r.getB()/(2*r.getA()));
	}
    
    public void calcular() {
		
	if (tieneRaices() ) {
            obtenerRaices();
	}else if (tieneRaiz()) {
            obtenerRaiz();
	}else {
            System.out.println("es un numero imaginario, no tiene raiz positiva.");
	}
	}
}
