
package Entidades;

import java.util.Date;

public class Vendedor {
    
    //lo primero que vamos a hacer es definir los atributos que caracterizan al objeto
    
    private String nombre;
    
    private Integer cedula;
    
    private Double sueldoBasico;
    
    private Double comisiones;
    
    private Double sueldoMensual;
            
    private Date fechaInicio;
    
  // constructor vacio
    public Vendedor() {
    }
     //constructor por parametros
    public Vendedor(String nombre, Integer cedula, Double comisiones, Double sueldoMensual, Date fechaInicio) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.comisiones = comisiones;
        this.sueldoMensual = sueldoMensual;
        this.fechaInicio = fechaInicio;
    }
// getter - no necesita de un parametro para funcionar y lo que retorna es el atributo incluido en el getter
    
    public String getNombre() {
        return nombre;
    }

    public Integer getCedula() {
        return cedula;
    }

    public Double getSueldoBasico() {
        return sueldoBasico;
    }

    public Double getComisiones() {
        return comisiones;
    }

    public Double getSueldoMensual() {
        return sueldoMensual;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

//setter - no retorna nada, por eso es void, hay que pasarle un parametro y lo aloja en el atributo que sea 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public void setSueldoBasico(Double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public void setComisiones(Double comisiones) {
        this.comisiones = comisiones;
    }

    public void setSueldoMensual(Double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
    
}
