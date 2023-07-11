package servicio;

import entidades.NIF;
import java.util.Scanner;

public class ServicioNIF {
    
    //Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
//corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
//resultado del calculo.
    //Para calcular la letra se toma el resto de dividir el
//número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
//buscar en un array (vector) de caracteres la posición que corresponda al resto de la
//división para obtener la letra correspondiente.
    
    NIF n = new NIF();
    Scanner read = new Scanner(System.in);
    
    
    public void crearNif(){
        
        System.out.println("Ingrese su documento de identidad");
        n.setDNI(read.nextLong());
        
        int calculoLetra = (int) n.getDNI()%23;
        
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
            'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
        System.out.println("La letra correspondiente es: ");
        
        switch (calculoLetra) {
            case 0:
                n.setLetra(letras[0]);
                System.out.println(letras[0]);
                break;
            case 1:
                n.setLetra(letras[1]);
                System.out.println(letras[1]);
                break;
            case 2:
                n.setLetra(letras[2]);
                System.out.println(letras[2]);
                break;
            case 3:
                n.setLetra(letras[3]);
                System.out.println(letras[3]);
                break;
            case 4:
                n.setLetra(letras[4]);
                System.out.println(letras[4]);
                break;
            case 5:
                n.setLetra(letras[5]);
                System.out.println(letras[5]);
                break;
            case 6:
                n.setLetra(letras[6]);
                System.out.println(letras[6]);
                break;
            case 7:
                n.setLetra(letras[7]);
                System.out.println(letras[7]);
                break;
            case 8:
                n.setLetra(letras[8]);
                System.out.println(letras[8]);
                break;  
            case 9:
                n.setLetra(letras[9]);
                System.out.println(letras[9]);
                break;
            case 10:
                n.setLetra(letras[10]);
                System.out.println(letras[10]);
                break;
            case 11:
                n.setLetra(letras[11]);
                System.out.println(letras[11]);
                break;    
            case 12:
                n.setLetra(letras[12]);
                System.out.println(letras[12]);
                break;
            case 13:
                n.setLetra(letras[13]);
                System.out.println(letras[13]);
                break;  
            case 14:
                n.setLetra(letras[14]);
                System.out.println(letras[14]);
                break;   
            case 15:
                n.setLetra(letras[15]);
                System.out.println(letras[15]);
                break;  
            case 16:
                n.setLetra(letras[16]);
                System.out.println(letras[16]);
                break;   
            case 17:
                n.setLetra(letras[17]);
                System.out.println(letras[17]);
                break;  
            case 18:
                n.setLetra(letras[18]);
                System.out.println(letras[18]);
                break;    
            case 19:
                n.setLetra(letras[19]);
                System.out.println(letras[19]);
                break;    
            case 20:
                n.setLetra(letras[20]);
                System.out.println(letras[20]);
                break;    
            case 21:
                n.setLetra(letras[21]);
                System.out.println(letras[21]);
                break;    
            case 22:
                n.setLetra(letras[22]);
                System.out.println(letras[22]);
                break;    
            case 23:
                n.setLetra(letras[23]);
                System.out.println(letras[23]);
                break;    
            default:
                System.out.println("DNI incorrecto");
                break;
        }
    }
    
    // Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
//en mayúscula; por ejemplo: 00395469-F).
    
    public void mostrar(){
        System.out.println("su DNI con NIF es: " + n.getDNI() + "-" + n.getLetra());
    }
}
