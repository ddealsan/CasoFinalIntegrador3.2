package analisis_avanzado;

public class VisualizacionDatos {
    public void visualizarDatosSimulacion(double[] datos) {
        // Implementación para visualizar los datos de la simulación
        System.out.println("Visualizando datos de la simulación:");

        // Aquí podrías implementar la lógica para generar gráficos, diagramas, o cualquier otra representación visual de los datos
        for (int i = 0; i < datos.length; i++) {
            System.out.println("Dato " + (i + 1) + ": " + datos[i]);
        }
    }


}