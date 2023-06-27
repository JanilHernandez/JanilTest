
package Servicios;

import Entidades.Figura;
import static java.lang.Math.PI;
import java.util.Scanner;

public class FigurasServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Double calcularArea(Figura fig){
        
        switch (fig.getTipo()) {
            case "cuadrado":
                System.out.println("Ingrese el lado del cuadrado");
                
                double lado = leer.nextDouble();
                
                return lado * lado;
             
            case "rectangulo":
                System.out.println("Ingrese la base del rectangulo");
                double base = leer.nextDouble();
                
                System.out.println("Ingrese la altura del rectangulo");
                double altura = leer.nextDouble();
                
                return base * altura;
                
            case "triangulo":
                System.out.println("Ingrese la base del rectangulo");
                double baseTriangulo = leer.nextDouble();
                
                System.out.println("Ingrese la altura del rectangulo");
                double alturaTriangulo = leer.nextDouble();
                
                return (baseTriangulo * alturaTriangulo) / 2;
                
            case "circulo":
                System.out.println("Ingrese el radio del circulo");
                
                double radio = leer.nextDouble();
                
                return PI * radio * radio;    
                
            case "hexagono":
                System.out.println("Ingrese el lado del hexagono");
                
                double ladoHexagono = leer.nextDouble();
                
                System.out.println("Ingrese el apotema del hexagono");
                
                double apotemaHexagono = leer.nextDouble();
                
                return (6*ladoHexagono*apotemaHexagono)/2;    
                
            case "pentagono":
                System.out.println("Ingrese el lado del hexagono");
                
                double ladoPentagono = leer.nextDouble();
                
                System.out.println("Ingrese el apotema del hexagono");
                
                double apotemaPentagono = leer.nextDouble();
                
                return (5*ladoPentagono*apotemaPentagono)/2;   
                
            case "rombo":
                System.out.println("Ingrese la diagonal menor");
                
                double diagonalMenor = leer.nextDouble();
                
                System.out.println("Ingrese la diagonal mayor");
                
                double diagonalMayor = leer.nextDouble();
                
                return (diagonalMenor*diagonalMayor)/2;   
            default:
                System.out.println("Ingrese una figura correcta");
        }
        return null;
        
    }
    
    public Double calcularPerimetro(Figura fig){
        
        switch (fig.getTipo()) {
            case "cuadrado":
                System.out.println("Ingrese el lado del cuadrado");
                
                double lado = leer.nextDouble();
                
                return lado * 4;
             
            case "rectangulo":
                System.out.println("Ingrese la base del rectangulo");
                double base = leer.nextDouble();
                
                System.out.println("Ingrese la altura del rectangulo");
                double altura = leer.nextDouble();
                
                return (base * 2) +  (altura*2) ;
                
            case "triangulo":
                System.out.println("Ingrese el lado del triangulo equilatero");
                double baseTriangulo = leer.nextDouble();
                
                return (baseTriangulo * 3);
                
            case "circulo":
                System.out.println("Ingrese el radio del circulo");
                
                double radio = leer.nextDouble();
                
                return PI * radio * 2;    
                
            case "hexagono":
                System.out.println("Ingrese el lado del hexagono");
                
                double ladoHexagono = leer.nextDouble();
                                
                return 6*ladoHexagono;    
                
            case "pentagono":
                System.out.println("Ingrese el lado del hexagono");
                
                double ladoPentagono = leer.nextDouble();
                
                return 5*ladoPentagono;   
                
            case "rombo":
                System.out.println("Ingrese el lado del rombo");
                
                double diagonalMenor = leer.nextDouble();
                
                return diagonalMenor*4;   
            default:
                System.out.println("Ingrese una figura correcta");
        }
        return null;
        
    }
    
    public void menu(){
        
        System.out.println("Escoja una figura");
        System.out.println("");
        System.out.println("1 - cuadrado");
        System.out.println("2 - rectangulo");
        System.out.println("3 - triangulo");
        System.out.println("4 - circulo");
        System.out.println("5 - hexagono");
        System.out.println("6 - pentagono");
        System.out.println("7 - rombo");
        System.out.println("8 - salir");
        
        int eleccion = leer.nextInt();
        
        
        switch (eleccion) {
            case 1:
		Figura cuadrado = new Figura("cuadrado");
		System.out.println("El area del cuadrado es: " + calcularArea(cuadrado));
		System.out.println("El perimetro del cuadrado es: " + calcularPerimetro(cuadrado));
		break;
                
            case 2:
		Figura rectangulo = new Figura("rectangulo");
		System.out.println("El area del cuadrado es: " + calcularArea(rectangulo));
		System.out.println("El perimetro del cuadrado es: " + calcularPerimetro(rectangulo));
		break;    
                
            case 3:
		Figura triangulo = new Figura("triangulo");
		System.out.println("El area del cuadrado es: " + calcularArea(triangulo));
		System.out.println("El perimetro del cuadrado es: " + calcularPerimetro(triangulo));
		break;   
                
            case 4:
		Figura circulo = new Figura("circulo");
		System.out.println("El area del cuadrado es: " + calcularArea(circulo));
		System.out.println("El perimetro del cuadrado es: " + calcularPerimetro(circulo));
		break;  
                
            case 5:
		Figura hexagono = new Figura("hexagono");
		System.out.println("El area del cuadrado es: " + calcularArea(hexagono));
		System.out.println("El perimetro del cuadrado es: " + calcularPerimetro(hexagono));
		break; 
                
            case 6:
		Figura pentagono = new Figura("pentagono");
		System.out.println("El area del cuadrado es: " + calcularArea(pentagono));
		System.out.println("El perimetro del cuadrado es: " + calcularPerimetro(pentagono));
		break;     
                
            case 7:
		Figura rombo = new Figura("rombo");
		System.out.println("El area del cuadrado es: " + calcularArea(rombo));
		System.out.println("El perimetro del cuadrado es: " + calcularPerimetro(rombo));
		break;  
                
            case 8:    
                System.out.println("Gracias por usar el programa");
            default:
                System.out.println("No ingreso una opcion correcta");
                this.menu();
        }
    }
}
