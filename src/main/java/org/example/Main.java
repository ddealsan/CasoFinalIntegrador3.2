package org.example;

import gestion.Autenticacion;
import gestion.InterfazUsuario;
import gestion.RegistroActividades;
import analisis_avanzado.ResolucionProblemas;
import analisis_avanzado.VisualizacionDatos;
import Entidades.Ambiente;
import Entidades.Animal;
import Entidades.Planta;
import Poblaciones.SimuladorEcosistema;


public class Main {
    public static void main(String[] args) {
        // Crear instancias de Ambiente, Animales, Planta y SimuladorEcosistema
        Ambiente ambiente = new Ambiente("Savannah", "Caluroso", 100);
        Animal leon = new Animal("León", 1, 100, true);
        Animal zebra = new Animal("Zebra", 2, 80, true);
        Planta hierba = new Planta("Hierba", 1, 50, true);
        Planta arbusto = new Planta("Arbusto", 2, 70, true);
        SimuladorEcosistema simulador = new SimuladorEcosistema(leon, zebra, hierba, arbusto, ambiente);

        // Interacción con el usuario
        InterfazUsuario interfazUsuario = new InterfazUsuario();
        interfazUsuario.mostrarMenu();
        int opcion = interfazUsuario.leerOpcion();

        if (opcion == 1) {
            // Mostrar simulación
            System.out.println("Mostrando simulación:");
            System.out.println("Datos del ambiente:");
            System.out.println("Clima: " + ambiente.getClima());
            System.out.println("Terreno: " + ambiente.getTerreno());
            System.out.println("Recursos disponibles: " + ambiente.getRecursosDisponibles());

            System.out.println("\nDatos de los animales:");
            System.out.println("León - Posición: (" + leon.getPosicionX() + ", " + leon.getPosicionY() + "), Salud: " + leon.getSalud() + ", Edad: " + leon.getEdad() + ", Estado reproductivo: " + leon.isEstadoReproductivo());
            System.out.println("Zebra - Posición: (" + zebra.getPosicionX() + ", " + zebra.getPosicionY() + "), Salud: " + zebra.getSalud() + ", Edad: " + zebra.getEdad() + ", Estado reproductivo: " + zebra.isEstadoReproductivo());

            System.out.println("\nDatos de las plantas:");
            System.out.println("Hierba - Posición: (" + hierba.getPosicionX() + ", " + hierba.getPosicionY() + "), Salud: " + hierba.getSalud() + ", Edad: " + hierba.getEdad() + ", Estado reproductivo: " + hierba.isEstadoReproductivo());
            System.out.println("Arbusto - Posición: (" + arbusto.getPosicionX() + ", " + arbusto.getPosicionY() + "), Salud: " + arbusto.getSalud() + ", Edad: " + arbusto.getEdad() + ", Estado reproductivo: " + arbusto.isEstadoReproductivo());

            System.out.println("\nDatos del simulador:");
            // Si hay alguna lógica específica en SimuladorEcosistema para mostrar datos, añádela aquí
        } else if (opcion == 3) {
            System.out.println("Saliendo del simulador...");
        } else {
            System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
        }

        interfazUsuario.cerrarScanner();
    }
}