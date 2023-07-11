package Servicios;
import java.util.Scanner;
import Entidades.Operacion;

public class OperacionServicio {
    Scanner leer = new Scanner(System.in);
    Operacion o1 = new Operacion();
    
    //Método para crearOperacion(): que le pide al usuario los dos números y los guarda
//en los atributos del objeto.
    public Operacion crearOPeracion(){
        System.out.println("Ingrese el numero 1");
        o1.setNumero1(leer.nextInt());
        
        System.out.println("Ingrese el numero 2");
        o1.setNumero2(leer.nextInt());
        
        return null;
    }
    
      //Método sumar(): calcular la suma de los números y devolver el resultado al main.
    public int sumar(){
        
        int resultado = o1.getNumero1() + o1.getNumero2();
                
        return resultado;
    }
    
    /*Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
*/
    public double multiplicar(){
        double multiplicacion = 0;
        
        if (o1.getNumero1() == 0 || o1.getNumero2() == 0 ) {
            System.out.println("El resultado es CERO, debe ingresar dos numeros distintos de 0");
        }else{
            multiplicacion = o1.getNumero1() * o1.getNumero2();
        }
        
        return multiplicacion;
    }
    
    /*Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
*/
    public double dividir(){
        double division = 0;
        if (o1.getNumero1() == 0 || o1.getNumero2() == 0 ) {
            System.out.println("El resultado es CERO, debe ingresar dos numeros distintos de 0");
        }else{
            division = o1.getNumero1() / o1.getNumero2();
        }    
            return division;
            
        }
    }

