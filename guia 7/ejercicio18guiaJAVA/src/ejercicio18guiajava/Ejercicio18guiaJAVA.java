/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
obtiene cambiando sus filas por columnas (o viceversa).
 */
package ejercicio18guiajava;
import java.util.Scanner;
public class Ejercicio18guiaJAVA {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int [][] Matriz = new int [4][4];
        
        int [][] matrizT = new int [4][4];
   
        llenarMatriz(Matriz);
        System.out.println("**********************");
        trasponerMatriz(Matriz, matrizT);
    }
    
    public static void llenarMatriz(int[][] Matriz) {
        int aleatorio;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                aleatorio = (int) (Math.random() * 10);
             
                Matriz[i][j] = aleatorio;               
            }  
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + Matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
    public static void trasponerMatriz(int[][] Matriz, int[][] MatrizT) {
         
        for (int x=0; x < 4; x++) {
            for (int y=0; y < 4; y++){
                MatrizT[x][y] = Matriz[y][x];
            }
        }
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                System.out.print("[" + MatrizT[x][y] + "]");
            }
            System.out.println("");
        }
        
    }
}
