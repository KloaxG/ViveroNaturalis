package users.cliente;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import menus.MenuAdministrador;
import models.Cliente;

public class EliminarCliente {

    public static ArrayList<Cliente> clientes = new ArrayList<>();

    public static void eliminarCliente() {
        if (clientes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay clientes para eliminar.", "Vivero Naturalis ®",
                    JOptionPane.INFORMATION_MESSAGE);
            MenuAdministrador.mostrarMenuAdministrador();
        }
        int cedula = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese la cédula del cliente a eliminar: ", "Vivero Naturalis ®",
                        JOptionPane.QUESTION_MESSAGE));

        boolean encontrado = false;
        for (Cliente cliente : clientes) {
            if (cliente.getCedula() == cedula) {
                clientes.remove(cliente);
                JOptionPane.showMessageDialog(null, "Cliente eliminado exitosamente.", "Vivero Naturalis ®",
                        JOptionPane.INFORMATION_MESSAGE);
                encontrado = true;
                MenuAdministrador.mostrarMenuAdministrador();
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado, intente de nuevo.", "Vivero Naturalis ®",
                    JOptionPane.ERROR_MESSAGE);
            eliminarCliente();
        }
    }
}
