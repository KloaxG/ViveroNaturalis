package administrador;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import menus.MenuAdministrador;
import menus.MenuInicial;
import models.Administrador;

public class SesionAdministrador {

    public static ArrayList<Administrador> administradores = new ArrayList<>();

    public static void iniciarSesionAdministrador() {

        administradores.add(new Administrador("Gerardo Gómez Calderón", "agomezc@ucenfotec.ac.cr", "1234",
                "Administrador", 117520608));

        String correo = JOptionPane.showInputDialog(null, "Ingrese su correo: ", "Vivero Naturalis ®",
                JOptionPane.QUESTION_MESSAGE);
        String contrasena = JOptionPane.showInputDialog(null, "Ingrese su contraseña: ", "Vivero Naturalis ®",
                JOptionPane.QUESTION_MESSAGE);

        if (correo == null || correo.isEmpty() || contrasena == null || contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese todos los campos.", "Vivero Naturalis ®",
                    JOptionPane.ERROR_MESSAGE);
            iniciarSesionAdministrador();
            return;
        }

        boolean encontrado = false;
        for (Administrador administrador : administradores) {
            if (administrador.getCorreo().equals(correo) && administrador.getContrasena().equals(contrasena)) {
                JOptionPane.showMessageDialog(null, "Bienvenido " + administrador.getNombreCompleto(),
                        "Vivero Naturalis ®",
                        JOptionPane.INFORMATION_MESSAGE);
                MenuAdministrador.mostrarMenuAdministrador();
                encontrado = true;
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
