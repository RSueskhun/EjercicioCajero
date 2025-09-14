import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Cuenta> cuentas = new ArrayList<>();
        Cuenta cuentaSeleccionada = null;
        int opcion = 0;

        do {

            System.out.println("\n=== MENÚ PRINCIPAL CAJERO ===");
            System.out.println("1. CREAR NUEVA CUENTA");
            System.out.println("2. SELECCIONAR CUENTA EXISTENTE");
            System.out.println("3. OPERACIONES CON CUENTA EXISTENTE");
            System.out.println("0. SALIR");
            System.out.print("SELECCIONES UNA OPCIÓN: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("INGRESE UN NÚMERO DE CUENTA: ");
                    int numCuenta = sc.nextInt();
                    System.out.print("INGRESE EL DNI DEL CLIENTE: ");
                    double dniCliente = sc.nextDouble();
                    System.out.print("INGRESE EL SALDO INICIAL: ");
                    double saldoActual = sc.nextDouble();

                    Cuenta nueva = new Cuenta(numCuenta, dniCliente, saldoActual);
                    cuentas.add(nueva);
                    System.out.println("CUENTA CREADA EXITOSAMENTE");
                    break;

                case 2:
                    if (cuentas.isEmpty()) {
                        System.out.println("NO HAY CUENTAS REGISTRADAS");
                    } else {
                        System.out.println("SELECCIONE UNA CUENTA:");
                        for (int i = 0; i < cuentas.size(); i++) {
                            System.out.println((i + 1) + ". CUENTA N° " + cuentas.get(i).getNumeroCuenta());
                        }
                        int seleccion = sc.nextInt();
                        if (seleccion > 0 && seleccion <= cuentas.size()) {
                            cuentaSeleccionada = cuentas.get(seleccion - 1);
                            System.out.println("CUENTA N° " + cuentaSeleccionada.getNumeroCuenta() + " SELECCIONADA.");
                        } else {
                            System.out.println("SELECCIÓN NO VALIDA O CUENTA INEXISTENTE.");
                        }
                    }
                    break;

                case 3:
                    if (cuentaSeleccionada == null) {
                        System.out.println("PRIMERO SELECCIONE UNA CUENTA PARA INICIAR");
                    } else {
                        int opcionCuenta = 0;
                        do {
                            System.out.println("\n=== OPERACIONES CUENTA SELECCIONADA ===");
                            System.out.println("CUENTA N°: " + cuentaSeleccionada.getNumeroCuenta());
                            System.out.println("------------------------------------");
                            System.out.println("1. INGRESAR DINERO");
                            System.out.println("2. RETIRAR DINERO");
                            System.out.println("3. EXTRACCIÓN RÁPIDA (20% DEL SALDO)");
                            System.out.println("4. CONSULTAR SALDO");
                            System.out.println("5. CONSULTAR DATOS");
                            System.out.println("0. VOLVER AL MENÚ PRINCIPAL");
                            System.out.print("SELECCIONE UNA OPCIÓN: ");
                            opcionCuenta = sc.nextInt();

                            switch (opcionCuenta) {
                                case 1:
                                    System.out.print("DIGITE LA CANTIDAD A INGRESAR: ");
                                    cuentaSeleccionada.ingresar(sc.nextDouble());
                                    break;
                                case 2:
                                    System.out.print("DIGITE LA CANTIDAD A RETIRAR: ");
                                    cuentaSeleccionada.retirar(sc.nextDouble());
                                    break;
                                case 3:
                                    System.out.print("INGRESE LA CANTIDAD A RETIRAR POR EXTRACCIÓN RÁPIDA: ");
                                    cuentaSeleccionada.extraccionRapida(sc.nextDouble());
                                    break;
                                case 4:
                                    cuentaSeleccionada.consultarSaldo();
                                    break;
                                case 5:
                                    cuentaSeleccionada.consultarDatos();
                                    break;
                                case 0:
                                    System.out.println("ESTA VOLVIENDO AL MENÚ PRINCIPAL");
                                    break;
                                default:
                                    System.out.println("SELECCIÓN NO VALIDA");
                            }
                        } while (opcionCuenta != 0);
                    }
                    break;

                case 0:
                    System.out.println("SALIENDO");
                    break;

                default:
                    System.out.println("OPCIÓN NO VALIDA");
            }
        } while (opcion != 0);

    }
}