/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejerciciosjava;
import java.util.Scanner;
public class JavaApplication33 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int longitud, i, Contador1Digito, Contador2Digito, Contador3Digito, Contador4Digito, Contador5Digito ;
        
        Contador1Digito = 0;
        Contador2Digito = 0;
        Contador3Digito = 0;
        Contador4Digito = 0;
        Contador5Digito = 0;
        
        System.out.println("Ingrese la longitud del vector ");
       longitud = leer.nextInt();
       
       int[] Vector = new int[longitud];
       
       llenarVector(Vector);
       
       contarCositas (Vector, Contador1Digito, Contador2Digito, Contador3Digito, 
            Contador4Digito, Contador5Digito);
       
      System.out.println("La cantidad de numeros con 1 digito es: " + Contador1Digito);
      System.out.println("La cantidad de numeros con 2 digitos es: " + Contador2Digito);
      System.out.println("La cantidad de numeros con 3 digitos es: " + Contador3Digito);
      System.out.println("La cantidad de numeros con 4 digitos es: " + Contador4Digito);
      System.out.println("La cantidad de numeros con 5 digitos es: " + Contador5Digito);
    }
    
    public static void llenarVector(int[] Vector) {
        int llenado, aleatorio;
        
        for (llenado = 0; llenado  < Vector.length; llenado++){
            aleatorio = (int)(Math.random()*10 *(Math.random()*10)*(Math.random()*10)*(Math.random()*10)*(Math.random()*10));
            Vector[llenado] = aleatorio;
        }
    }
    
    public static int CuentaCifras(int num){
        int contador = 0;
        
        if (num == 0){
            contador = 1;
        }else {
            for(int i = Math.abs(num); i > 0; i /= 10){
                contador++;
            }
        }
        return contador;
    }
    
    public static void contarCositas (int[] Vector, int Contador1Digito, int Contador2Digito, int Contador3Digito, 
            int Contador4Digito, int Contador5Digito) {
        int i;
        for (i = 0; i < Vector.length; i++){
            System.out.println("cifra " + Vector[i]);
            
            System.out.println("Cantidadcifra " + CuentaCifras(Vector[i]));
            
            switch (CuentaCifras(Vector[i])) {
                case 1:
                    Contador1Digito = Contador1Digito + 1;
                    System.out.println("La cantidad de numeros con 1 digito es: " + Contador1Digito);
                    break;
                case 2:
                    Contador2Digito = Contador2Digito + 1;
                    System.out.println("La cantidad de numeros con 2 digito es: " + Contador2Digito);
                    break;
                case 3:
                    Contador3Digito = Contador3Digito + 1;
                    System.out.println("La cantidad de numeros con 3 digito es: " + Contador3Digito);
                    break;
                case 4:
                    Contador4Digito = Contador4Digito + 1;
                    System.out.println("La cantidad de numeros con 4 digito es: " + Contador4Digito);     
                    break;
                case 5:
                    Contador5Digito = Contador5Digito + 1;
                    System.out.println("La cantidad de numeros con 5 digito es: " + Contador5Digito);
                    break;
                default:
                    break;
            }
        }
    }
}
