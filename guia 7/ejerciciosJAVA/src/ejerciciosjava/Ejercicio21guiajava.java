/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
columna de la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package ejerciciosjava;
import java.util.Scanner;
public class Ejercicio21guiajava {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matrizMSize, matrizPSize;
        matrizMSize = 10;
        matrizPSize = 3;
        int [][] MatrizM = new int [matrizMSize][matrizMSize];
        int [][] MatrizP = new int [matrizPSize][matrizPSize];
        
        llenarMatriz(MatrizM);
        llenarMatriz(MatrizP);
        
        buscarMatriz(MatrizM, MatrizP);
        
    }
    public static void llenarMatriz(int[][] Matriz) {
        int aleatorio;
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz.length; j++) {
                
                aleatorio = (int) (Math.random() * 10);
             
                Matriz[i][j] = aleatorio;               
            }  
        }
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz.length; j++) {
                System.out.print("[" + Matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
    public static void buscarMatriz(int[][] MatrizM, int[][] MatrizP){
        boolean coincide;
        coincide = false;
        
        int [][] matrizAux = new int [3][3];
        
        for (int i = 0; i < (MatrizM.length - MatrizP.length); i++) {
            for (int j = 0; j < (MatrizM.length - MatrizP.length); j++) {
               
                if (MatrizM[i][j] == MatrizP[0][0]){
                    matrizAux = crearSubMatriz(MatrizM, i, j);
                    
                    for (int k = 0; k < matrizAux.length; k++) {
                        for (int l = 0; l < matrizAux.length; l++) {
                            
                            if(matrizAux[k][l] == MatrizP[k][l]){
                                coincide = true;
                            } else {
                                coincide = false;
                                break;
                            }
                        }
                    }
                    
                    if(coincide){
                        System.out.println("Se encontro la matrizP a partir de las coordenadas: " + i + " " + j);
                    } else {
                        System.out.println("No coinciden las matrices.");
                    }
                        
                }
            }
        }
    }
    
    public static int[][] crearSubMatriz (int[][] MatrizM, int filaInicial, int columnaInicial){
        int[][] subMatriz = new int[3][3];
            for (int i = 0; i < 3; i++) {
                 for (int j = 0; j < 3; j++) {
                     subMatriz[i][j] = MatrizM[filaInicial + i][columnaInicial + j];     
                }
            }
        return subMatriz;
    }
}
