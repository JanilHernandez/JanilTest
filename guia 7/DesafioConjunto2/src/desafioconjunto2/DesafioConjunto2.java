//Se está realizando una calculadora grafica, y se requiere calcular algunas áreas y perímetros de unas figuras
//geométricas. Las figuras son las siguientes:
/*
Cuadrado
Rectángulo
Triangulo
Circulo
Hexágono
Pentágono
Rombo

El usuario debe elegir la figura geométrica, luego debe ingresar el/los dato/s de la figura geométrica elegida y le debe
mostrar por pantalla el área y el perímetro.
Aclaración: Si el usuario elige una figura, se debe crear un objeto de esa figura seleccionada, y realizar los cálculos
para luego mostrar en pantalla.
*/
package desafioconjunto2;

import Servicios.FigurasServicio;

public class DesafioConjunto2 {

    public static void main(String[] args) {
        
        
        FigurasServicio fs = new FigurasServicio();
        fs.menu();
        
    }
    
}
