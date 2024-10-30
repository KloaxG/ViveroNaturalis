package menus;

import administrador.SesionAdministrador;
import javax.swing.JOptionPane;
import users.cliente.SesionCliente;
import users.tecnician.SesionTecnico;

public class MenuInicial {

    public static void mostrarMenu() {
        String[] opciones = {
            "1. Iniciar Sesión",
            "2. Salir"
        };
        String seleccion = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione una opción: ",
                "Vivero Naturalis ®",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);
        if (seleccion != null) {
            int opcion = Integer.parseInt(seleccion.split("\\.")[0]);

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Redirigiendo a Iniciar Sesión", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    mostrarMenuInicioSesion();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,
                            "Gracias por utilizar el servicio del Vivero \nNaturalis, ha sido un placer servirle.",
                            "Vivero Naturalis ®", JOptionPane.INFORMATION_MESSAGE);
                    break;

            }

        }
    }

    public static void mostrarMenuInicioSesion() {
        String[] opciones = {
            "1. Iniciar Sesión como Administrador",
            "2. Iniciar Sesión como Cliente",
            "3. Iniciar Sesión como Técnico de Mantenimiento",
            "4. Regresar"
        };
        String seleccion = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione una opción: ",
                "Vivero Naturalis ®",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);
        if (seleccion != null) {
            int opcion = Integer.parseInt(seleccion.split("\\.")[0]);

            switch (opcion) {
                case 1 -> {
                    JOptionPane.showMessageDialog(null, "Redirigiendo a Iniciar Sesion como Administrador",
                            "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    SesionAdministrador.iniciarSesionAdministrador();
                }
                case 2 -> {
                    JOptionPane.showMessageDialog(null, "Redirigiendo a Iniciar Sesion como Cliente",
                            "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    SesionCliente.iniciarSesionCliente();
                }
                case 3 -> {
                    JOptionPane.showMessageDialog(null, "Redirigiendo a Iniciar Sesion como Técnico de Mantenimiento",
                            "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    SesionTecnico.iniciarSesionTecnico();
                }
                case 4 -> {
                    JOptionPane.showMessageDialog(null, "Redirigiendo a Menú Principal", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    mostrarMenu();
                }
            }

        }
    }

}
