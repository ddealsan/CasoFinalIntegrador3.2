package org.example;

import Entidades.Animal;
import Entidades.Planta;
import Entidades.Ambiente;
import Poblaciones.SimuladorEcosistema;
import gestion.InterfazUsuario;
import gestion.Autenticacion;
import gestion.RegistroActividades;
import analisis_avanzado.ResolucionProblemas;
import analisis_avanzado.VisualizacionDatos;
import analisis_avanzado.IntegracionNuevasFunciones;
public class Main {
    public static void main(String[] args) {
        // Crear instancias de plantas y animales
        Animal leon = new Animal("León", 1, 100, true);
        Animal zebra = new Animal("Zebra", 2, 80, true);
        Planta hierba = new Planta("Hierba", 1, 50, true);
        Planta arbusto = new Planta("Arbusto", 2, 70, true);

        Ambiente ambiente = new Ambiente("Savannah", "Caluroso", "Seco");

        // Crear instancia de simulador de ecosistema y realizar simulación
        SimuladorEcosistema simulador = new SimuladorEcosistema();
        simulador.simularCrecimientoYReproduccion();
        simulador.simularEventosAleatorios();
        simulador.calcularEstadisticas();

        // Interacción con la interfaz de usuario
        InterfazUsuario interfazUsuario = new InterfazUsuario();
        interfazUsuario.mostrarMenu();
        interfazUsuario.configurarSimulacion();
        interfazUsuario.controlarSimulacion();

        // Autenticación de usuario
        Autenticacion autenticacion = new Autenticacion();
        autenticacion.autenticar("usuario", "contraseña");
        autenticacion.cerrarSesion();

        // Registro de actividades
        RegistroActividades registroActividades = new RegistroActividades();
        registroActividades.registrarSimulacion("Configuración", "Resultados");
        registroActividades.obtenerSimulacionesAnteriores();
        registroActividades.limpiarRegistro();

        // Análisis avanzado
        ResolucionProblemas resolucionProblemas = new ResolucionProblemas();
        resolucionProblemas.buscarEquilibriosEcologicos();
        resolucionProblemas.evaluarEstrategiasConservacion();

        VisualizacionDatos visualizacionDatos = new VisualizacionDatos();
        visualizacionDatos.visualizarDatosSimulacion(new double[]{1.2, 3.4, 5.6});

        IntegracionNuevasFunciones integracionNuevasFunciones = new IntegracionNuevasFunciones();
        integracionNuevasFunciones.integrarNuevosModelos();
    }
}