package gestion;

public class InterfazUsuario {
    public void mostrarMenu() {
        System.out.println("Bienvenido al Simulador de Dinámicas Poblacionales");
        System.out.println("1. Configurar simulación");
        System.out.println("2. Controlar simulación en curso");
        System.out.println("3. Salir");
    }

    public void configurarSimulacion() {
        // Aquí iría la lógica para permitir a los usuarios configurar la simulación
        System.out.println("Configurando la simulación...");
    }

    public void controlarSimulacion() {
        // Aquí iría la lógica para permitir a los usuarios controlar la simulación en curso
        System.out.println("Controlando la simulación en curso...");
    }
}