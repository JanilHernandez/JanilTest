
package Servicio;

import Entidades.cuentaBancaria;
import java.util.Scanner;

public class ServicioCuenta {
    //Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    Scanner leer = new Scanner(System.in);
    cuentaBancaria cb = new cuentaBancaria();
    
    public cuentaBancaria cuenta(){
        
        System.out.println("Ingrese su numero de cuenta");
        cb.setNumeroCuenta(leer.nextInt());
       
        System.out.println("Ingrese su dni");
        cb.setDNI(leer.nextLong());
        
        System.out.println("Ingrese el saldo actual");
        cb.setSaldoActual(leer.nextInt());
        
        return null;
    }
    
    //Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
//la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
//pondrá el saldo actual en 0.
    
    public void retirar(double retiro){
       
        double saldo;
        if (retiro < cb.getSaldoActual()) {
            saldo = cb.getSaldoActual() - retiro;
            cb.setSaldoActual((int) saldo);
            System.out.println("El saldo disponible es $" + cb.getSaldoActual());
        }else if (retiro > cb.getSaldoActual()){
            System.out.println("Debe ingresar un importe menor.");   
        }
    }
    
    //Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
//usuario no saque más del 20%.
    public void extraccionRapida(){
        double extraccion;
        System.out.println("Desea sacar un 20% de su saldo?");
        String respuesta1 = leer.next();
       
        if (respuesta1.equals("si")){
            extraccion = cb.getSaldoActual()*0.20;
            cb.setSaldoActual((int) extraccion);
            System.out.println("Usted retiro $" + extraccion);
        } else if (respuesta1.equals("no")) {
            System.out.println("Su saldo es: $" + cb.getSaldoActual());
        }
    }
    
    //Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    
    public void consultarSaldo(){
        System.out.println("Desea consultar su saldo actual?");
        String respuesta2 = leer.nextLine();
        
        if (respuesta2.equals("si")){
            System.out.println("Su saldo es: $" + cb.getSaldoActual());
        }else{
            System.out.println("oki");
        }  
    }
    
    //Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    public void consultarDatos(){
        System.out.println("Su numero de cuenta es: " + cb.getNumeroCuenta());
        System.out.println("Su dni es: " + cb.getDNI());
        System.out.println("Su saldo actual es: " + cb.getSaldoActual());
    }
}
