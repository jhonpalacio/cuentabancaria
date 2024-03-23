package bancaria;


public class CuentaBancaria {
    private double saldo;
    private String nombreCliente;

    public CuentaBancaria(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente. No se puede realizar el retiro.");
        }
    }

    public double obtenerSaldo() {
        return saldo;
    }
}