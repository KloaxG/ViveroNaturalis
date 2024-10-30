package users.tecnician;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import menus.MenuInicial;
import menus.MenuTecnico;
import models.TecnicoMantenimiento;

public class SesionTecnico {

    public static ArrayList<TecnicoMantenimiento> tecnicos = new ArrayList<>();

    public static void iniciarSesionTecnico() {
        if (tecnicos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay técnicos registrados.", "Vivero Naturalis ®",
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
        for (TecnicoMantenimiento tecnico : tecnicos) {
            if (tecnico.getCorreo().equals(correo) && tecnico.getContrasena().equals(contrasena)) {
                JOptionPane.showMessageDialog(null, "Bienvenido " + tecnico.getNombreCompleto(), "Vivero Naturalis ®",
                        JOptionPane.INFORMATION_MESSAGE);
                encontrado = true;
                MenuTecnico.menuTecnico();
                break;
            }
        }
    }
}
