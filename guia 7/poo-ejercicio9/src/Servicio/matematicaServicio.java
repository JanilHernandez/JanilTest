package Servicio;

import Entidades.Matematica;
import java.util.Scanner;

public class matematicaServicio {
    
        Matematica m = new Matematica();
        Scanner leer = new Scanner(System.in);
        
    public Matematica setearNumeros(){
        int random;
        random = (int) (Math.random()*10);
        m.setNumero1(random);
        System.out.println("El numero 1 es " + m.getNumero1());
        random = (int) (Math.random()*10);
        m.setNumero2(random);
        System.out.println("El numero 2 es " + m.getNumero2());
        
        return null;
    }
    
    //Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    
    public int devolverMayor(){
        return Math.max(m.getNumero1(), m.getNumero2());
    }
    
    public int devolverMenor(){
        return Math.min(m.getNumero1(), m.getNumero2());
    }
    //Método calcularPotencia() para calcular la potencia del mayor valor de la clase
//elevado al menor número. Previamente se deben redondear ambos valores.
    
    public int calcularPotencia(){
        int potencia = (int) Math.pow(devolverMayor(), devolverMenor());
        return potencia;
    }
    
    //Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

public double calculaRaiz(){
    double raiz = Math.sqrt(devolverMenor());
    return raiz;
}

}
