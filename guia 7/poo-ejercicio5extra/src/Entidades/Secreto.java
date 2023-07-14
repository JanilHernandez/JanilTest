
package Entidades;

public class Secreto {
 
    private String[] mes;
    private String mesSecreto;

    public Secreto() {
    }

    public Secreto(String[] mes, String mesSecreto) {
        this.mes = mes;
        this.mesSecreto = mesSecreto;
    }

    public String[] getMes() {
        return mes;
    }

    public void setMes(String[] mes) {
        this.mes = mes;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    @Override
    public String toString() {
        return "Secreto{" + "mes=" + mes + ", mesSecreto=" + mesSecreto + '}';
    }
    
    
}
