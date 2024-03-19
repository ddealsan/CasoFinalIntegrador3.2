package gestion;

import java.util.Scanner;

public class InterfazUsuario {
    private Scanner scanner;

    public InterfazUsuario() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("Bienvenido al Simulador de Dinámicas Poblacionales");
        System.out.println("1. observar simulación");
        System.out.println("3. Salir");
        System.out.println("Por favor, seleccione una opción:");
    }

    public int leerOpcion() {
        return scanner.nextInt();
    }

    public void realizarAccion(int opcion) {
        switch (opcion) {
            case 1:
                configurarSimulacion();
                break;
            case 2:
                controlarSimulacion();
                break;
            case 3:
                System.out.println("Saliendo del simulador...");
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
        }
    }

    private void configurarSimulacion() {
        // Aquí iría la lógica para permitir a los usuarios configurar la simulación
        System.out.println("Configurando la simulación...");
    }

    private void controlarSimulacion() {
        // Aquí iría la lógica para permitir a los usuarios controlar la simulación en curso
        System.out.println("Controlando la simulación en curso...");
    }

    public void cerrarScanner() {
        scanner.close();
    }
}