package administrador;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import menus.MenuAdministrador;
import models.TecnicoMantenimiento;

public class RegistroTecnicos {

    public static ArrayList<TecnicoMantenimiento> tecnicos = new ArrayList<>();

    public static void registroTecnico() {

        TecnicoMantenimiento tecnico = new TecnicoMantenimiento();
        while (true) {
            try {
                boolean cedulaRepetida = false;
                int cedula = Integer
                        .parseInt(JOptionPane.showInputDialog(null, "Ingrese la cédula del técnico: ", "Vivero Naturalis ®",
                                JOptionPane.QUESTION_MESSAGE));

                for (TecnicoMantenimiento t : tecnicos) {
                    if (t.getCedula() == cedula) {
                        cedulaRepetida = true;
                        JOptionPane.showMessageDialog(null, "El número de cédula " + cedula + " ya fue registrado.");
                        break;
                    }
                }
                if (cedula == 117520608) {
                    JOptionPane.showMessageDialog(null, "No se puede registrar un administrador como técnico.", "Vivero Naturalis ®",
                            JOptionPane.ERROR_MESSAGE);
                    MenuAdministrador.mostrarMenuAdministrador();
                } else if (!cedulaRepetida) {
                    tecnico.setCedula(cedula);
                    break;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "La cédula debe ser un número.", "Vivero Naturalis ®",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        tecnico.setNombreCompleto(JOptionPane.showInputDialog(null, "Ingrese el nombre del técnico: ", "Vivero Naturalis ®",
                JOptionPane.QUESTION_MESSAGE));
        tecnico.setEspecializacion(JOptionPane.showInputDialog(null, "Ingrese la especialización del técnico: ", "Vivero Naturalis ®",
                JOptionPane.QUESTION_MESSAGE));
        while (true) {
            try {
                tecnico.setTelefono(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el teléfono del técnico: ", "Vivero Naturalis ®",
                        JOptionPane.QUESTION_MESSAGE)));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El teléfono debe ser un número.", "Vivero Naturalis ®",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        while (true) {
            String correo = JOptionPane.showInputDialog(null, "Ingrese el correo del técnico: ", "Vivero Naturalis ®",
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

        tecnicos.add(tecnico);
        JOptionPane.showMessageDialog(null, "Técnico registrado exitosamente: \n" + tecnico.toString(), "Vivero Naturalis ®",
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Redirigiendo a Menú Administrador", "Vivero Naturalis ®",
                JOptionPane.INFORMATION_MESSAGE);
        MenuAdministrador.mostrarMenuAdministrador();

    }

}
