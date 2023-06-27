
package desafioconjunto;

import Entidades.Vehiculo;
import Servicio.VeiculoServicio;

public class DesafioConjunto {

    public static void main(String[] args) {
        VeiculoServicio vs = new VeiculoServicio();
        
        Vehiculo auto = new Vehiculo("fiat", "128", "automovil", 1976);
        Vehiculo moto = new Vehiculo("honda", "tornado", "motocicleta", 2020);
        Vehiculo bici = new Vehiculo("STL", "450", "bicicleta", 2023);
        
        
        int metrosAuto = vs.moverse(5, auto);
        int metrosMoto = vs.moverse(5, moto);
        int metrosBici = vs.moverse(5, bici);
        
      //int metrosAuto = vehiculo.moverse(5, auto);
	//	int metrosMoto = vehiculo.moverse(5, moto);
	//	int metrosBici = vehiculo.moverse(5, bici);
        
        System.out.println("la distancia recorrida por el auto es: " + metrosAuto);
        System.out.println("la distancia recorrida por la moto es: " + metrosMoto);
        System.out.println("la distancia recorrida por la bici es: " + metrosBici);
        
    }
    
}
