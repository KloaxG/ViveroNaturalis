package servicios.plant;

import administrador.InventarioPlantas;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import models.Planta;

public class CrearPlanta {

    public static void crearPlanta(ArrayList<Planta> plantas) {
        String opcion;
        boolean disponible;
        Planta p = new Planta();
        p.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre de la planta: ", "Vivero Naturalis ®",
                JOptionPane.QUESTION_MESSAGE));
        p.setEspecie(JOptionPane.showInputDialog(null, "Ingrese el tipo de la planta: ", "Vivero Naturalis ®",
                JOptionPane.QUESTION_MESSAGE));

        while (true) {
            try {
                p.setId(Integer.parseInt(
                        JOptionPane.showInputDialog(null, "Ingrese el ID de la planta: ", "Vivero Naturalis ®",
                                JOptionPane.QUESTION_MESSAGE)));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El ID debe ser un número.", "Vivero Naturalis ®",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        while (true) {
            try {
                p.setPrecio(Double.parseDouble(
                        JOptionPane.showInputDialog(null, "Ingrese el precio de la planta: ", "Vivero Naturalis ®",
                                JOptionPane.QUESTION_MESSAGE)));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El precio debe ser un número.", "Vivero Naturalis ®",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        while (true) {
            try {
                p.setStock(Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Ingrese la cantidad en stock de la planta: ", "Vivero Naturalis ®",
                        JOptionPane.QUESTION_MESSAGE)));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El stock debe ser un número.", "Vivero Naturalis ®",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        p.setDescripcion(
                JOptionPane.showInputDialog(null, "Ingrese una breve descripción de la planta: ", "Vivero Naturalis ®",
                        JOptionPane.QUESTION_MESSAGE));
        while (true) {
            opcion = JOptionPane.showInputDialog(null, "¿La planta está disponible? (Y/N)", "Vivero Naturalis ®",
                    JOptionPane.QUESTION_MESSAGE);
            switch (opcion) {
                case "Y" ->
                    disponible = true;
                case "N" ->
                    disponible = false;
                default -> {
                    JOptionPane.showMessageDialog(null, "Opción inválida, intente de nuevo.", "Vivero Naturalis ®",
                            JOptionPane.ERROR_MESSAGE);
                    continue;
                }
            }
            break;
        }
        p.setDisponible(disponible);
        plantas.add(p);
        JOptionPane.showMessageDialog(null, "Planta registrada exitosamente: \n" + p.toString(), "Vivero Naturalis ®",
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Regresando a 'Inventario Plantas'", "Vivero Naturalis ®",
                JOptionPane.INFORMATION_MESSAGE);
        InventarioPlantas.inventarioPlantas();
    }

    public static int getIntegerInput(String message) {
        while (true) {
            try {
                return Integer.parseInt(JOptionPane.showInputDialog(null, message, "Vivero Naturalis ®", JOptionPane.QUESTION_MESSAGE));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static double getDoubleInput(String message) {
        while (true) {
            try {
                return Double.parseDouble(JOptionPane.showInputDialog(null, message, "Vivero Naturalis ®", JOptionPane.QUESTION_MESSAGE));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número decimal.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
