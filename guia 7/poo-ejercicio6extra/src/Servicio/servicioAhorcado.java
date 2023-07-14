
package Servicio;

import entidades.ahorcado;
import java.util.Scanner;

public class servicioAhorcado {
    Scanner leer = new Scanner(System.in);
    ahorcado a = new ahorcado();
    
    /*
 *Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
máximas, el valor que ingresó el usuario y encontradas en 0.
 */
    public ahorcado crearJuego(){
        System.out.println("Ingrese una palabra");
        String respuesta = leer.next();
        
        System.out.println("Ingrese la cantidad de intentos");
        a.setCantidadIntentos(leer.nextInt());
        
        char[] aux = new char[respuesta.length()];
        for (int i = 0; i < respuesta.length(); i++) {
            aux[i] = respuesta.charAt(i);
        }
        a.setPalabraABuscar(aux);
        
        a.setCantidadLetrasEncontradas(0);
        
        return null;
    }
    
    /*
 Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
 */
    public void longitud(){
        int largo = a.getPalabraABuscar().length;
        
        System.out.println("La longitud de la palabra es: " + largo);
    }
 
    /*
 Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
 */
    public boolean buscar(char letra){
        
        boolean encontreLetra=false;
        
        System.out.println("Ingrese una letra");
        letra = leer.next().charAt(0);
        char[] aux2 = a.getPalabraABuscar();
        
        for (int i = 0; i < a.getPalabraABuscar().length; i++) {
            
            if (aux2[i] == letra) {
                encontreLetra=true;
                break;
            }
        }
        return encontreLetra;
    }
    /*
Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
 */
    
    public void encontradas(char letra){
        int c=0;
        char[] aux3 = a.getPalabraABuscar();
        if (buscar(letra)) {
            for (int i = 0; i < a.getPalabraABuscar().length; i++) {
                if (aux3[i]==letra) {
                    c+=1;
                    char[] vectorRespuesta;
                    a.setVectorRespuesta(a.getVectorRespuesta());
                
                a.setCantidadLetrasEncontradas(a.getCantidadLetrasEncontradas()+c);
            System.out.println("La letra fue encontrada ");
                for (int j = 0; j < a.getPalabraABuscar().length; j++) {
                    System.out.println("Nuevo vector " + a.getVectorRespuesta());
                } System.out.println(" ");
            }else{
            System.out.println("La letra no se encontró"); 
            }
        }
            System.out.println("Cantidad de letras econtradas "+a.getCantidadLetrasEncontradas());
        System.out.println("Cantidad de letras faltantes "+(a.getPalabraABuscar().length-a.getCantidadLetrasEncontradas()));
        }
    }
    
    //Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
    
     public int intentos(){
       int intentos= a.getCantidadIntentos()-1;
     a.setCantidadIntentos(intentos);
        System.out.println("Cantidad de intentos restantes "+intentos);
     return a.getCantidadIntentos();
    } 
     
     /*
Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
 */
     
     public void juego (){
        int intentos;
        intentos=a.getCantidadIntentos();
        System.out.println("La longitud de la palabra es "+a.getPalabraABuscar().length);
        do{
        System.out.println("Ingrese una letra ");
        char letra = leer.next().charAt(0);
        encontradas(letra);
     if (!(buscar(letra))){
         intentos=intentos();
     }
        } while ((intentos>0) && (a.getCantidadLetrasEncontradas()<a.getPalabraABuscar().length));
            
      if (intentos==0){
          System.out.println("Se quedó sin intentos");
      }
      
    }
}
