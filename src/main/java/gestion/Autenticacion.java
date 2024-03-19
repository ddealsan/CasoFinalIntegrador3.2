package gestion;

public class Autenticacion {
    public boolean autenticar(String usuario, String contrasena) {
        // Aquí iría la lógica para autenticar a los usuarios
        // Por ahora, asumiremos que la autenticación siempre es exitosa
        System.out.println("Usuario autenticado exitosamente.");
        return true;
    }

    public void cerrarSesion() {
        // Aquí iría la lógica para cerrar sesión
        System.out.println("Cerrando sesión del usuario...");
    }
}