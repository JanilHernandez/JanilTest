/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Movil;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MovilService {
    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public Movil crearMovil(){
        Movil m = new Movil();
        System.out.print("Ingrese la marca del móvil: ");
        m.setMarca(read.next());
        System.out.print("Ingrese el precio del móvil: ");
        m.setPrecio(read.nextDouble());
        System.out.print("Ingrese el modelo del móvil: ");
        m.setModel(read.next());
        System.out.print("Ingrese la memoria RAM del móvil: ");
        m.setRam(read.nextInt());
        System.out.print("Ingrese el almacenamiento del móvil: ");
        m.setAlmacenamiento(read.nextInt());
        cargarCode(m);
        return m;
    }
    
    public void cargarCode(Movil m){
        System.out.print("Ingrese el código del móvil: ");
        int c = read.nextInt();
        int[] ca = new int[m.getN()];
        for (int i = m.getN()-1; i >=0 ; i--) {
            if(c>0){
                ca[i] = c%10;
                c = c/10;
            }else{
                ca[i] = 0;
            }
        }
        m.setCode(ca);
    }
    
    public void mostrarMovil(Movil m){
        System.out.println("La marca del móvil es: " + m.getMarca());
        System.out.println("El precio del móvil es: USD" + m.getPrecio());
        System.out.println("El modelo del móvil es: " + m.getModel());
        System.out.println("La cantidad de memoria RAM del móvil es: " + m.getRam() + "GB");
        System.out.println("El espacio de almacenamiento del móvil es: " + m.getAlmacenamiento() + "GB");
        
        System.out.println("El código del móvil es: "+ Arrays.toString(m.getCode()).replaceAll(", ", ""));
    }
    
    public void mostrarCode(Movil m){
        for (int i = 0; i < 7; i++) {
            
        }
    }
}
