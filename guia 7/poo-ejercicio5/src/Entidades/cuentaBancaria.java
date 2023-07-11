/*
ue debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
 */
package Entidades;

public class cuentaBancaria {
    private int numeroCuenta;
    private long DNI;
    private int saldoActual;

    public cuentaBancaria() {
    }

    public cuentaBancaria(int numeroCuenta, long DNI) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "cuentaBancaria{" + "numeroCuenta=" + numeroCuenta + ", DNI=" + DNI + ", saldoActual=" + saldoActual + '}';
    }
    
    
}
