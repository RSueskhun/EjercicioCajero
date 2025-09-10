import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // SOLICITUD DE DATOS AL USUARIO
        System.out.print("INGRESE SU NUMERO DE CUENTA: ");
        int numeroCuenta = sc.nextInt();

        System.out.print("INGRESE EL DNI DEL CLIENTE: ");
        double dniCliente = sc.nextDouble();

        System.out.print("INGRESE EL SALDO INICIAL: ");
        double saldoActual = sc.nextDouble();

        // CREAR EL OBJETO CUENTA
        Cuenta cta1 = new Cuenta(numeroCuenta, dniCliente, saldoActual);
        Cuenta cta2 = new Cuenta(numeroCuenta, dniCliente, saldoActual);
        Cuenta cta3 = new Cuenta(numeroCuenta, dniCliente, saldoActual);

        // INDICAR OPERACIONES
        int opcion = 0;

        do {

            System.out.println("\n=== MENÚ CAJERO ===");
            System.out.println("1. SELECCIONAR CUENTA");
            System.out.println("1. INGRESAR DINERO");
            System.out.println("2. RETIRAR DINERO");
            System.out.println("3. EXTRACCION RAPIDA (20%)");
            System.out.println("4. CUNSULTAR SALDO");
            System.out.println("5. CONSULTAR DATOS");CLEAR
            System.out.println("0. SALIR");
            System.out.print("SELECCIONES UNA OPCION: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("INDIQUE LA CANTIDAD A INGRESAR: ");
                    cuenta.ingresar(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("INDIQUE LA CANTIDAD A RETIRAR: ");
                    cuenta.retirar(sc.nextDouble());
                    break;
                case 3:
                    System.out.print("INDIQUE LA CANTIDAD PARA EXTRACCION RAPIDA (máx 20%): ");
                    cuenta.extraccionRapida(sc.nextDouble());
                    break;
                case 4:
                    cuenta.consultarSaldo();
                    break;
                case 5:
                    cuenta.consultarDatos();
                    break;
                case 0:
                    System.out.println("SALIENDO");
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
            }
        } while (opcion != 0);
    }
}