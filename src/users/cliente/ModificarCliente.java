package users.cliente;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import menus.MenuAdministrador;
import models.Cliente;

public class ModificarCliente {

    public static ArrayList<Cliente> clientes = new ArrayList<>();

    static void modificarCliente() {
        if (clientes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay clientes para modificar.", "Vivero Naturalis ®",
                    JOptionPane.INFORMATION_MESSAGE);
            MenuAdministrador.mostrarMenuAdministrador();
        }
        int cedula = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese la cédula del cliente a modificar: ", "Vivero Naturalis ®",
                        JOptionPane.QUESTION_MESSAGE));
        boolean encontrado = false;
        for (Cliente cliente : clientes) {
            if (cliente.getCedula() == cedula) {
                String opcion;
                cliente.setNombreCompleto(JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre del cliente: ",
                        "Vivero Naturalis ®"));
                while (true) {
                    try {
                        cliente.setCedula(Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese la nueva cédula del cliente: ", "Vivero Naturalis ®")));
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "La cédula debe ser un número.", "Vivero Naturalis ®",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
                while (true) {
                    try {
                        cliente.setTelefono(Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese el nuevo teléfono del cliente: ", "Vivero Naturalis ®")));
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "El teléfono debe ser un número.", "Vivero Naturalis ®",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
                cliente.setDireccion(JOptionPane.showInputDialog(null, "Ingrese la nueva dirección del cliente: ",
                        "Vivero Naturalis ®"));
                while (true) {
                    try {
                        cliente.setTamanoJardin(Double.parseDouble(JOptionPane.showInputDialog(null,
                                "Ingrese el nuevo tamaño del jardín del cliente: ", "Vivero Naturalis ®")));
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "El tamaño del jardín debe ser un número.",
                                "Vivero Naturalis ®",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
                JOptionPane.showMessageDialog(null, "Cliente modificado exitosamente: \n" + cliente.toString(),
                        "Vivero Naturalis ®",
                        JOptionPane.INFORMATION_MESSAGE);
                encontrado = true;
                MenuAdministrador.mostrarMenuAdministrador();
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado, intente de nuevo.", "Vivero Naturalis ®",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
