public class Cuenta {

    private int numeroCuenta;
    private double dniCliente;
    private double saldoActual;

    // CONSTRUCTOR VACIO
    public Cuenta() {

    }

    // CONSTRUCTOR CON PARAMETROS
    public Cuenta(int numeroCuenta, double dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    // GETTERS Y SETTERS
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    // METODO INGRESAR DINERO
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldoActual += cantidad;
            System.out.println("INGRESO EXITOSO -- SU NUEVO SALDO ES: $" + saldoActual);
        } else {
            System.out.println("LA CANTIDAD A INGRESAR DEBE SUMAR AL SALDO");
        }
    }

    // METODO RETIRAR
    public void retirar(double cantidad) {
        if (cantidad > saldoActual) {
            saldoActual = 0;
            System.out.println("SALDO INSUFICIENTE");
        } else {
            saldoActual -= cantidad;
            System.out.println("RETIRO EXITOSO -- SU NUEVO SALDO ES: $" + saldoActual);
        }
    }

    // METODO EXTRACCIÓN RÁPIDA
    public void extraccionRapida(double cantidad) {
        double limite = saldoActual * 0.20;
        if (cantidad <= limite) {
            saldoActual -= cantidad;
            System.out.println("EXTRACCION RAPIDA EXITOSA ");
        } else {
            System.out.println("NO PUEDE RETIRARSE MAS DEL 20% DEL SALDO ACTUAL");
        }
    }

    // METODO CONSULTAR SALDO
    public void consultarSaldo() {
        System.out.println("EL SALDO ACTUAL ES: $" + saldoActual);
    }

    // METODO CONSULTAR DATOS
    public void consultarDatos() {
        System.out.println("\n ---DATOS DE LA CUENTA--- ");
        System.out.println("NÚMERO DE LA CUENTA: " + numeroCuenta);
        System.out.println("DNI DE LA CUENTA: " + dniCliente);
        System.out.println("SALDO DE LA CUENTA: " + saldoActual);
    }
}
