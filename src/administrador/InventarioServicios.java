package administrador;

import javax.swing.JOptionPane;
import menus.MenuAdministrador;
import servicios.ServiciosMetodos.*;

public class InventarioServicios {

    public static void inventarioServicios() {
        String[] opciones = {
            "1. Registrar Servicios",
            "2. Eliminar Servicios",
            "3. Consultar Servicios",
            "4. Modificar Servicios",
            "5. Regresar"
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
                    JOptionPane.showMessageDialog(null, "Redirigiendo a 'Registro de Servicios'", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    CrearServicio.crearServicio();
                }
                case 2 -> {
                    JOptionPane.showMessageDialog(null, "Redirigiendo a 'Eliminar Servicios'", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    EliminarServicio.eliminarServicio();
                }
                case 3 -> {
                    JOptionPane.showMessageDialog(null, "Redirigiendo a 'Consultar Servicios'", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    ConsultarServicio.consultarServicio();
                }
                case 4 -> {
                    JOptionPane.showMessageDialog(null, "Redirigiendo a 'Modificar Servicios'", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    ModificarServicio.modificarServicio();
                }
                case 5 -> {
                    JOptionPane.showMessageDialog(null, "Regresando a Menú Administrador", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    MenuAdministrador.mostrarMenuAdministrador();
                }

            }

        }
    }
}
