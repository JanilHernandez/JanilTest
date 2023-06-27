
package Servicio;

import Entidades.Vehiculo;

public class VeiculoServicio {
  
    public int moverse(int segundos, Vehiculo vehiculo) {
        switch (vehiculo.getTipo()) {
            case "automovil":
                return segundos*3;
            case "motocicleta":
                return segundos*2;
            case "bicicleta":
                return segundos;    
            default:
                System.out.println("No ingresaste un vehiculo valido");
                return 0;
        }

    }
    
    
    public int frenar (int recorrido, Vehiculo vehiculo){
        if (vehiculo.getTipo().equals("bicicleta")) {
            return recorrido;
        }else{
            return recorrido +2;    
        }   
    }
}
