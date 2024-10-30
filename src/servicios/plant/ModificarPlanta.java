package servicios.plant;

import administrador.InventarioPlantas;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import models.Planta;

public class ModificarPlanta {

    public static void modificarPlanta(ArrayList<Planta> plantas) {
        if (plantas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay plantas para modificar.", "Vivero Naturalis ®",
                    JOptionPane.INFORMATION_MESSAGE);
            InventarioPlantas.inventarioPlantas();
        }
        int id = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese el ID de la planta a modificar: ", "Vivero Naturalis ®",
                        JOptionPane.QUESTION_MESSAGE));
        boolean encontrado = false;
        for (Planta planta : plantas) {
            if (planta.getId() == id) {
                String opcion;
                boolean disponible;
                planta.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre de la planta: ",
                        "Vivero Naturalis ®"));
                planta.setEspecie(JOptionPane.showInputDialog(null, "Ingrese la nueva especie de la planta: ",
                        "Vivero Naturalis ®"));
                while (true) {
                    try {
                        planta.setPrecio(Double.parseDouble(JOptionPane.showInputDialog(null,
                                "Ingrese el nuevo precio de la planta: ", "Vivero Naturalis ®")));
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "El precio debe ser un número.", "Vivero Naturalis ®",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
                while (true) {
                    try {
                        planta.setStock(Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese la nueva cantidad en stock de la planta: ", "Vivero Naturalis ®")));
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "El stock debe ser un número.", "Vivero Naturalis ®",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
                planta.setDescripcion(JOptionPane.showInputDialog(null, "Ingrese una breve descripción de la planta: ",
                        "Vivero Naturalis ®"));
                while (true) {
                    opcion = JOptionPane.showInputDialog(null, "¿La planta está disponible? (Y/N)",
                            "Vivero Naturalis ®");
                    switch (opcion) {
                        case "Y" ->
                            disponible = true;
                        case "N" ->
                            disponible = false;
                        default -> {
                            JOptionPane.showMessageDialog(null, "Opción inválida, intente de nuevo.",
                                    "Vivero Naturalis ®",
                                    JOptionPane.ERROR_MESSAGE);
                            continue;
                        }
                    }
                    break;
                }
                planta.setDisponible(disponible);
                JOptionPane.showMessageDialog(null, "Planta modificada exitosamente: \n" + planta.toString(),
                        "Vivero Naturalis ®",
                        JOptionPane.INFORMATION_MESSAGE);
                encontrado = true;
                InventarioPlantas.inventarioPlantas();
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Planta no encontrada, intente de nuevo.", "Vivero Naturalis ®",
                    JOptionPane.ERROR_MESSAGE);
            modificarPlanta(plantas);
        }
    }
}
