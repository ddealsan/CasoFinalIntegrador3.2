package org.example;

import Entidades.Ambiente;
import Entidades.Animal;
import Entidades.Planta;
import gestion.Autenticacion;
import gestion.InterfazUsuario;
import gestion.RegistroActividades;
import Poblaciones.SimuladorEcosistema;

public class Main {
    public static void main(String[] args) {

        // Crear instancias de animales y plantas
        Animal leon = new Animal("León", 1, 1, true);
        Animal zebra = new Animal("Zebra", 2, 2, true);
        Planta hierba = new Planta("Hierba", 3, 3, true);
        Planta arbusto = new Planta("Arbusto", 4, 4, true);

        // Crear instancia de ambiente
        Ambiente ambiente = new Ambiente("Savannah", "Caluroso", 100);

        // Crear instancia de simulador de ecosistema
        SimuladorEcosistema simulador = new SimuladorEcosistema(leon, zebra, hierba, arbusto, ambiente);

        // Mostrar menú de opciones al usuario
        InterfazUsuario interfazUsuario = new InterfazUsuario();
        interfazUsuario.mostrarMenu();
        int opcion = interfazUsuario.leerOpcion();

        // Realizar acción según la opción seleccionad34
        if (opcion == 1) {
            // Configurar simulación
            Autenticacion autenticacion = new Autenticacion();
            autenticacion.autenticar("usuario", "contraseña");
            autenticacion.cerrarSesion();

            RegistroActividades registroActividades = new RegistroActividades();
            registroActividades.registrarSimulacion("Configuración", "Resultados");
            registroActividades.limpiarRegistro();

            // Visualizar datos de la simulación
            simulador.simularEcosistema();
        } else if (opcion == 3) {
            // Salir del programa
            System.out.println("Saliendo del simulador...");
        } else {
            // Opción no válida
            System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
        }

        // Cerrar scanner
        interfazUsuario.cerrarScanner();
    }
}