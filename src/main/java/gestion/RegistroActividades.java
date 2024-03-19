package gestion;

import java.util.ArrayList;
import java.util.List;

public class RegistroActividades {
    private List<String> actividadesRegistradas;

    public RegistroActividades() {
        this.actividadesRegistradas = new ArrayList<>();
    }

    public void registrarSimulacion(String configuracion, String resultados) {
        // Aquí iría la lógica para registrar los resultados y configuraciones de las simulaciones
        String actividad = "Simulación registrada - Configuración: " + configuracion + ", Resultados: " + resultados;
        this.actividadesRegistradas.add(actividad);
        System.out.println("Simulación registrada en el registro de actividades.");
    }

    public List<String> obtenerSimulacionesAnteriores() {
        // Aquí iría la lógica para obtener las simulaciones anteriores registradas
        return this.actividadesRegistradas;
    }

    public void limpiarRegistro() {
        // Aquí iría la lógica para limpiar el registro de actividades
        this.actividadesRegistradas.clear();
        System.out.println("Registro de actividades limpiado.");
    }
}