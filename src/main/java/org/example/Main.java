package org.example;

import gestion.Autenticacion;
import gestion.InterfazUsuario;
import gestion.RegistroActividades;
import analisis_avanzado.ResolucionProblemas;
import analisis_avanzado.VisualizacionDatos;
import analisis_avanzado.IntegracionNuevasFunciones;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Autenticacion autenticacion = new Autenticacion();
        InterfazUsuario interfazUsuario = new InterfazUsuario();
        RegistroActividades registroActividades = new RegistroActividades();
        ResolucionProblemas resolucionProblemas = new ResolucionProblemas();
        VisualizacionDatos visualizacionDatos = new VisualizacionDatos();
        IntegracionNuevasFunciones integracionNuevasFunciones = new IntegracionNuevasFunciones();

        System.out.println("¡Bienvenido al Simulador de Ecosistema Inteligente!");

        // Iniciar sesión
        System.out.print("Ingrese su nombre de usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();

        if (!autenticacion.autenticar(usuario, contrasena)) {
            System.out.println("Credenciales incorrectas. Saliendo del programa.");
            return;
        }
        System.out.println("Inicio de sesión exitoso.");

        // Mostrar menú de opciones
        int opcion;
        do {
            interfazUsuario.mostrarMenu();
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    // Lógica para configurar la simulación
                    break;
                case 2:
                    // Lógica para controlar la simulación
                    break;
                case 3:
                    registroActividades.registrarSimulacion("Configuración", "Resultados");
                    registroActividades.obtenerSimulacionesAnteriores();
                    registroActividades.limpiarRegistro();
                    break;
                case 4:
                    resolucionProblemas.buscarEquilibriosEcologicos();
                    resolucionProblemas.evaluarEstrategiasConservacion();
                    break;
                case 5:
                    visualizacionDatos.visualizarDatosSimulacion(new double[]{1.2, 3.4, 5.6});
                    break;
                case 6:
                    integracionNuevasFunciones.integrarNuevosModelos();
                    break;
                case 7:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        } while (opcion != 7);

        scanner.close();
    }
}