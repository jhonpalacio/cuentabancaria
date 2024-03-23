package bancaria;

public class Main {
    public static void main(String[] args) {
        // Crear una nueva instancia de CuentaBancaria
        CuentaBancaria cuenta = new CuentaBancaria("Juan Perez");

        // Depositar dinero en la cuenta
        cuenta.depositar(1000);

        // Retirar dinero de la cuenta
        cuenta.retirar(500);

        // Obtener el saldo actual de la cuenta
        double saldoActual = cuenta.obtenerSaldo();
        System.out.println("El saldo actual de la cuenta es: " + saldoActual);
    }
}
