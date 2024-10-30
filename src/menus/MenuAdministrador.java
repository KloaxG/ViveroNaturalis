package menus;

import administrador.InventarioPlantas;
import administrador.InventarioServicios;
import administrador.RegistroClientes;
import administrador.RegistroTecnicos;
import javax.swing.JOptionPane;

public class MenuAdministrador {

    public static void mostrarMenuAdministrador() {
        String[] opciones = {
            "1. Gestionar Plantas",
            "2. Programar Citas de Mantenimiento",
            "3. Registrar Clientes",
            "4. Registrar Técnicos de Mantenimiento",
            "5. Gestionar Servicios",
            "6. Cerrar Sesión"
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
                    JOptionPane.showMessageDialog(null, "Redirigiendo a 'Inventario de Plantas'", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    InventarioPlantas.inventarioPlantas();
                }

                case 2 -> {
                    JOptionPane.showMessageDialog(null, "Redirigiendo a 'Citas de Mantenimiento'", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);

                }

                case 3 -> {
                    JOptionPane.showMessageDialog(null, "Redirigiendo a 'Registro de Clientes'", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    RegistroClientes.registroCliente();
                }

                case 4 -> {
                    JOptionPane.showMessageDialog(null, "Redirigiendo a 'Registro de Tecnicos'", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    RegistroTecnicos.registroTecnico();
                }
                case 5 -> {
                    JOptionPane.showMessageDialog(null, "'Redirigiendo a 'Gestión de Servicios'", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    InventarioServicios.inventarioServicios();
                }

                case 6 -> {
                    JOptionPane.showMessageDialog(null, "Cerrando sesión, hasta la próxima.", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    MenuInicial.mostrarMenu();
                }
            }

        }
    }
}
