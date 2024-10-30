package users.tecnician;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import menus.MenuAdministrador;
import models.TecnicoMantenimiento;

public class EliminarTecnico {

    public static ArrayList<TecnicoMantenimiento> tecnicos = new ArrayList<>();

    static void eliminarTecnico() {
        if (tecnicos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay técnicos para eliminar.", "Vivero Naturalis ®",
                    JOptionPane.INFORMATION_MESSAGE);
            MenuAdministrador.mostrarMenuAdministrador();
        }

        int cedula = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese la cédula del técnico a eliminar: ", "Vivero Naturalis ®",
                        JOptionPane.QUESTION_MESSAGE));
        boolean citaAsignada = false;

    }

}
