/*
 Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package ejercicio13giajava;
import java.util.Scanner;
public class Ejercicio13giaJAVA {

    public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);
            int arista, i, j;
            char asterisco;
            System.out.println("Ingrese la arista del cuadrado");
            arista = leer.nextInt();
           
                    // declaro y creo la matiz en una unica linea
            char [][]Matriz = new char [arista][arista];
            
            
            for (i=0; i<arista;i++){
                for(j=0; j<arista; j++){
                    if (i==0 || i == arista-1){
                         Matriz[i][j]= '*'; 
                    } else if (j==0 || j == arista-1){
                        Matriz[i][j]= '*';  
                    } else {
                        Matriz[i][j]= ' ';
                    }
                }
            }
            for (i=0; i<arista;i++){
                for(j=0; j<arista; j++){
                    System.out.print(Matriz[i][j]);
                }
                System.out.println();
            }
            }
 
}      
      
