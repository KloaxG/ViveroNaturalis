package users.tecnician;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import menus.MenuAdministrador;
import models.TecnicoMantenimiento;

public class ModificarTecnico {

    public static ArrayList<TecnicoMantenimiento> tecnicos = new ArrayList<>();

    public static void modificarTecnico() {
        if (tecnicos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay técnicos para modificar.", "Vivero Naturalis ®",
                    JOptionPane.INFORMATION_MESSAGE);
            MenuAdministrador.mostrarMenuAdministrador();
        }
        int cedula = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese la cédula del técnico a modificar: ", "Vivero Naturalis ®",
                        JOptionPane.QUESTION_MESSAGE));
        boolean encontrado = false;
        for (TecnicoMantenimiento tecnico : tecnicos) {
            if (tecnico.getCedula() == cedula) {
                String opcion;
                tecnico.setNombreCompleto(JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre del técnico: ",
                        "Vivero Naturalis ®"));
                tecnico.setEspecializacion(JOptionPane.showInputDialog(null, "Ingrese la nueva especialización del técnico: ",
                        "Vivero Naturalis ®"));
                while (true) {
                    try {
                        tecnico.setTelefono(Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese el nuevo teléfono del técnico: ", "Vivero Naturalis ®")));
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "El teléfono debe ser un número.", "Vivero Naturalis ®",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
                while (true) {
                    String correo = JOptionPane.showInputDialog(null, "Ingrese el nuevo correo del técnico: ", "Vivero Naturalis ®",
                            JOptionPane.QUESTION_MESSAGE);
                    if (correo != null) {
                        String regex = "^[\\w-\\.]+@[\\w-\\.]+\\.(com|cr|gmail|hotmail|yahoo)$";
                        if (correo.matches(regex)) {
                            tecnico.setCorreo(correo);
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Correo inválido, debe incluir un @ y un dominio válido (.com, .cr, etc.).",
                                    "Vivero Naturalis ®", JOptionPane.ERROR_MESSAGE);
                        }
                        for (TecnicoMantenimiento t : tecnicos) {
                            if (t.getCorreo().equals(correo)) {
                                JOptionPane.showMessageDialog(null, "El correo " + correo + " ya fue registrado.");
                                return;
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe ingresar un correo.", "Vivero Naturalis ®",
                                JOptionPane.ERROR_MESSAGE);
                    }

                }
                while (true) {
                    String activo = JOptionPane.showInputDialog(null, "¿El técnico está activo? (Y/N)", "Vivero Naturalis ®",
                            JOptionPane.QUESTION_MESSAGE);
                    switch (activo) {
                        case "Y" ->
                            tecnico.setIsActivo(true);
                        case "N" ->
                            tecnico.setIsActivo(false);
                        default -> {
                            JOptionPane.showMessageDialog(null, "Opción inválida, intente de nuevo.", "Vivero Naturalis ®",
                                    JOptionPane.ERROR_MESSAGE);
                            continue;
                        }
                    }
                    break;
                }
                JOptionPane.showMessageDialog(null, "Técnico modificado exitosamente: \n" + tecnico.toString(),
                        "Vivero Naturalis ®",
                        JOptionPane.INFORMATION_MESSAGE);
                encontrado = true;
                MenuAdministrador.mostrarMenuAdministrador();
            }
        }
    }

}
