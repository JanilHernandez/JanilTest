/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
    Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
    posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
    almacenar cada producto con su información. Crear una entidad Movil con los atributos
    marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
    un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
    correspondiente al código. A continuación, se implementarán los siguientes métodos:
     Un constructor por defecto.
     Un constructor con todos los atributos como parámetro.
     Métodos getters y setters de cada atributo.
     Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
    instanciar un objeto Celular y poder cargarlo en nuestro programa.
     Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
    números de un celular. Para ello, puede utilizarse un bucle repetitivo
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Movil {
    private int n=7;
    private String marca;
    private double precio;
    private String model;
    private int ram;
    private int almacenamiento;
    private int[] code = new int[n];

    public Movil() {
    }

    public Movil(String marca, double precio, String model, int ram, int almacenamiento, int[] code) {
        this.marca = marca;
        this.precio = precio;
        this.model = model;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.code = code;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void setCode(int[] code) {
        this.code = code;
    }

    public int getN() {
        return n;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public int[] getCode() {
        return code;
    }
    
}
