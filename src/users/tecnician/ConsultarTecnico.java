package users.tecnician;

import administrador.InventarioPlantas;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import menus.MenuAdministrador;
import models.TecnicoMantenimiento;

public class ConsultarTecnico {

    public static ArrayList<TecnicoMantenimiento> tecnicos = new ArrayList<>();

    public static void consultarTecnico() {
        if (tecnicos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay técnicos para consultar.", "Vivero Naturalis ®",
                    JOptionPane.INFORMATION_MESSAGE);
            MenuAdministrador.mostrarMenuAdministrador();
        }
        String[] opciones = {
            "1. Buscar por nombre del técnico",
            "2. Buscar por especialización",
            "3. Buscar por cedula",
            "4. Regresar"
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
                    while (true) {
                        try {
                            String nombre = JOptionPane.showInputDialog(null,
                                    "Ingrese el nombre del técnico a consultar: ", "Vivero Naturalis ®",
                                    JOptionPane.QUESTION_MESSAGE);
                            boolean encontrado = false;
                            for (TecnicoMantenimiento tecnicos : tecnicos) {
                                if (tecnicos.getNombreCompleto().equals(nombre)) {
                                    JOptionPane.showMessageDialog(null, tecnicos.toString(), "Vivero Naturalis ®",
                                            JOptionPane.INFORMATION_MESSAGE);
                                    encontrado = true;
                                    consultarTecnico();
                                }
                            }
                            if (!encontrado) {
                                JOptionPane.showMessageDialog(null, "Técnico no encontrado, intente de nuevo.",
                                        "Vivero Naturalis ®",
                                        JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "El nombre debe ser un texto.", "Vivero Naturalis ®",
                                    JOptionPane.ERROR_MESSAGE);
                        } catch (NullPointerException e) {
                            JOptionPane.showMessageDialog(null, "Debe ingresar un valor.", "Vivero Naturalis ®",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
                case 2 -> {
                    while (true) {
                        try {
                            String especializacion = JOptionPane.showInputDialog(null,
                                    "Ingrese la especializacion del técnico a consultar: ", "Vivero Naturalis ®",
                                    JOptionPane.QUESTION_MESSAGE);
                            boolean encontrado = false;
                            for (TecnicoMantenimiento tecnicos : tecnicos) {
                                if (tecnicos.getEspecializacion().equals(especializacion)) {
                                    JOptionPane.showMessageDialog(null, tecnicos.toString());
                                    encontrado = true;
                                    consultarTecnico();
                                }
                            }
                            if (!encontrado) {
                                JOptionPane.showMessageDialog(null, "Planta no encontrada, intente de nuevo.",
                                        "Vivero Naturalis ®",
                                        JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "La especie debe ser un texto.", "Vivero Naturalis ®",
                                    JOptionPane.ERROR_MESSAGE);
                        } catch (NullPointerException e) {
                            JOptionPane.showMessageDialog(null, "Debe ingresar un valor.", "Vivero Naturalis ®",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
                case 3 -> {
                    while (true) {
                        try {
                            int cedula = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingrese la cédula del técnico a consultar: ", "Vivero Naturalis ®",
                                    JOptionPane.QUESTION_MESSAGE));
                            boolean encontrado = false;
                            for (TecnicoMantenimiento tecnicos : tecnicos) {
                                if (tecnicos.getCedula() == cedula) {
                                    JOptionPane.showMessageDialog(null, tecnicos.toString(), "Vivero Naturalis ®",
                                            JOptionPane.INFORMATION_MESSAGE);
                                    encontrado = true;
                                    consultarTecnico();
                                }
                            }
                            if (!encontrado) {
                                JOptionPane.showMessageDialog(null, "Técnico no encontrado, intente de nuevo.",
                                        "Vivero Naturalis ®",
                                        JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "La cédula debe ser un número.", "Vivero Naturalis ®",
                                    JOptionPane.ERROR_MESSAGE);
                        } catch (NullPointerException e) {
                            JOptionPane.showMessageDialog(null, "Debe ingresar un valor.", "Vivero Naturalis ®",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
                case 4 -> {
                    JOptionPane.showMessageDialog(null, "Regresando a 'Inventario Plantas'", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    InventarioPlantas.inventarioPlantas();
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Opción inválida, intente de nuevo.", "Vivero Naturalis ®",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        }

    }

}
