/*
 Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
cantidad jugadas máximas que puede realizar el usuario.
 */
package entidades;

/**
 *
 * @author Usuario
 */
public class ahorcado {
    private char[] palabraABuscar;
    private int cantidadLetrasEncontradas;
    private int cantidadIntentos;
    private char[] vectorRespuesta;

    public ahorcado() {
    }

    public ahorcado(char[] palabraABuscar, int cantidadLetrasEncontradas, int cantidadIntentos, char[] vectorRespuesta) {
        this.palabraABuscar = palabraABuscar;
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
        this.cantidadIntentos = cantidadIntentos;
        this.vectorRespuesta = vectorRespuesta;
    }

    public char[] getPalabraABuscar() {
        return palabraABuscar;
    }

    public void setPalabraABuscar(char[] palabraABuscar) {
        this.palabraABuscar = palabraABuscar;
    }

    public int getCantidadLetrasEncontradas() {
        return cantidadLetrasEncontradas;
    }

    public void setCantidadLetrasEncontradas(int cantidadLetrasEncontradas) {
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
    }

    public int getCantidadIntentos() {
        return cantidadIntentos;
    }

    public void setCantidadIntentos(int cantidadIntentos) {
        this.cantidadIntentos = cantidadIntentos;
    }

    public char[] getVectorRespuesta() {
        return vectorRespuesta;
    }

    public void setVectorRespuesta(char[] vectorRespuesta) {
        this.vectorRespuesta = vectorRespuesta;
    }

    @Override
    public String toString() {
        return "ahorcado{" + "palabraABuscar=" + palabraABuscar + ", cantidadLetrasEncontradas=" + cantidadLetrasEncontradas + ", cantidadIntentos=" + cantidadIntentos + ", vectorRespuesta=" + vectorRespuesta + '}';
    }

}