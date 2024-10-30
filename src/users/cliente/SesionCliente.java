package users.cliente;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import menus.MenuCliente;
import menus.MenuInicial;
import models.Cliente;

public class SesionCliente {

    public static ArrayList<Cliente> clientes = new ArrayList<>();

    public static void iniciarSesionCliente() {
        if (clientes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay clientes registrados.", "Vivero Naturalis ®",
                    JOptionPane.INFORMATION_MESSAGE);
            MenuInicial.mostrarMenuInicioSesion();
            return;
        }
        String correo = JOptionPane.showInputDialog(null, "Ingrese su correo: ", "Vivero Naturalis ®",
                JOptionPane.QUESTION_MESSAGE);
        String contrasena = JOptionPane.showInputDialog(null, "Ingrese su contraseña: ", "Vivero Naturalis ®",
                JOptionPane.QUESTION_MESSAGE);

        if (correo == null || correo.isEmpty() || contrasena == null || contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese todos los campos.", "Vivero Naturalis ®",
                    JOptionPane.ERROR_MESSAGE);
            MenuInicial.mostrarMenuInicioSesion();
            return;
        }

        boolean encontrado = false;
        for (Cliente cliente : clientes) {
            if (cliente.getCorreo().equals(correo) && cliente.getContrasena().equals(contrasena)) {
                JOptionPane.showMessageDialog(null, "Bienvenido " + cliente.getNombreCompleto(), "Vivero Naturalis ®",
                        JOptionPane.INFORMATION_MESSAGE);
                encontrado = true;
                MenuCliente.menuCliente();
                break;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null,
                    "Usuario no encontrado, verifique sus credenciales e intente de nuevo.", "Vivero Naturalis ®",
                    JOptionPane.ERROR_MESSAGE);
            MenuInicial.mostrarMenuInicioSesion();
        }
    }

}
