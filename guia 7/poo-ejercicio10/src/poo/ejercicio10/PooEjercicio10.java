/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package poo.ejercicio10;

import java.util.Arrays;

public class PooEjercicio10 {

    public static void main(String[] args) {
       
       double[] ArryA = new double[50];
       
        for (int i = 0; i < ArryA.length; i++) {
            double random = (int) (Math.random()*10);
            ArryA[i] = random;
            
        System.out.print("[" + ArryA[i] + "]" );
        }
        Arrays.sort(ArryA);
        System.out.println("");
        System.out.println("----------");
        System.out.println("Arreglo ordenado de mayor a menor");
        System.out.println("----------");
        
        for (int i = 0; i < ArryA.length; i++) {
            System.out.print("[" + ArryA[i] + "]");
        }
        
       double[] ArryB = new double[20];
       
              for (int i = 0; i < 20; i++) {
                  if (i <=10) {
                      ArryB[i] = ArryA[i];
                  }else{
                      ArryB[i] = 0.5;
                  }
            System.out.println("[" + ArryB[i] + "]");
        }
        
    }
    
}
