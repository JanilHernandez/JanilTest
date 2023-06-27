
package mascotapp.entidades;

public class Mascota {

   public String nombre;
   public String apodo;
   //el tipo de mascota es por ejemplo, perro, gato, conejo...
   public String tipo;
   public String color;
   public int edad;
   public boolean cola;
   public String raza;
   private int energia;
   
   
   //constructor
   public Mascota(){   
       energia = 1000;
   }

   //no se pueden repetir los constructores, entonces en este le agrego argumentos
   public Mascota (String nombre, String apodo, String tipo){
       //la palabra this hace referencia al atributo
       this.nombre = nombre;
       this.apodo = apodo;
       energia = 1000;
       
       if (tipo.equals("Perro")|| tipo.equals("Gato")|| tipo.equals("Conejo")){
           this.tipo = tipo;
       }
   }

    public Mascota(String nombre, String apodo, int edad, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.edad = edad;
        this.raza = raza;
        energia = 1000;
    }
   
    //setter - nos permite cambiar un atributo
   public void setNombre(String nombre){
       
       if (nombre.length()> 0){
           this.nombre = nombre;
       }
   }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
   
   
   //getter - nos permite traer otro objeto

    public String getNombre() {
        return this.nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public String getRaza() {
        return raza;
    }
    
    /**
     * Funcion destinada a pasear
     * 
     * @param energiaRestar
     * @return energia 
     */
    public int pasear(int energiaRestar){
      //  energia = energia - energiaRestar;
      energia -= energiaRestar;
      
        return energia;   
    }
    
    /**
     * Funcion para pasear por vueltas
     * @param energiaRestar
     * @param vueltas
     * @return energia
     */
    public int pasear (int energiaRestar, int vueltas){
        for (int i = 0; i < vueltas; i++){
            energia -= energiaRestar;
        }   
        return energia;
    }
    

    // funcion que devuelve un mesaje para cada mascota
    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + '}';
    }
   
    
}
