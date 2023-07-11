
package Entidades;

import java.util.Date;

public class Persona {
    private String name;
    private Date birth;
    private int año;

    public Persona() {
    }

    public Persona(String name, Date birth, int año) {
        this.name = name;
        this.birth = birth;
        this.año = año;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", birth=" + birth + ", a\u00f1o=" + año + '}';
    }
   
}
