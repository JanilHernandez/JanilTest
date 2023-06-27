/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
*/


import java.util.Scanner;

public class CIRCUNFERENCIA{
    Scanner leer = new Scanner(System.in);
    private Double radio;

    //constructor vacio
    public CIRCUNFERENCIA() {
    }
//constructor del radio
    public CIRCUNFERENCIA(Double radio) {
        this.radio = radio;
    }
//getter
    public Double getRadio() {
        return radio;
    }
//setter    
    public void setRadio(Double radio) {
        this.radio = radio;
    }
   
    //Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
//objeto.
    public void crearCircunferencia(){
        System.out.println("Ingrese el radio");
        double radioLeido = leer.nextDouble();
        radio = radioLeido;       
    }
    
    //Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).\
    public double area(double radio){
        
        double area;
        
        area = 3.141579 * radio * radio;
        
        return area;   
    }
    
    //Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
    public double perimetro(double radio){
        double perimetro;
        perimetro = 2 * 3.141579 * radio;
        
        return perimetro;
    }
}
