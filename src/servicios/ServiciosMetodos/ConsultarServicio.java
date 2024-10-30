package servicios.ServiciosMetodos;

import administrador.InventarioServicios;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import models.Servicio;

public class ConsultarServicio {

    public static ArrayList<Servicio> servicios = new ArrayList<>();

    public static void consultarServicio() {

        if (servicios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay servicios para consultar.", "Vivero Naturalis ®",
                    JOptionPane.INFORMATION_MESSAGE);
            InventarioServicios.inventarioServicios();
            return;
        }

        String[] opciones = {
            "1. Nombre del servicio",
            "2. Rango de precio",
            "3. Regresar"
        };

        while (true) {
            String seleccion = (String) JOptionPane.showInputDialog(
                    null,
                    "Seleccione un criterio de búsqueda: ",
                    "Vivero Naturalis ®",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);

            if (seleccion != null) {
                int opcion = Integer.parseInt(seleccion.split("\\.")[0]);

                switch (opcion) {
                    case 1 -> {
                        String[] nombre = {
                            "1. Mantenimiento de Jardines",
                            "2. Fumigación",
                            "3. Instalación de sistemas de riego automático",
                            "4. Regresar"
                        };
                        String nombreSeleccionado = (String) JOptionPane.showInputDialog(
                                null,
                                "Seleccione el nombre del servicio: ",
                                "Vivero Naturalis ®",
                                JOptionPane.QUESTION_MESSAGE,
                                null,
                                nombre,
                                nombre[0]);
                        if (nombreSeleccionado != null) {
                            ServicioNombRango.buscarServicioPorNombre(nombreSeleccionado.split("\\.")[1].trim());
                        }
                    }
                    case 2 -> {
                        try {
                            double precioMin = Double.parseDouble(JOptionPane.showInputDialog(null,
                                    "Ingrese el precio mínimo: ", "Vivero Naturalis ®",
                                    JOptionPane.QUESTION_MESSAGE));
                            double precioMax = Double.parseDouble(JOptionPane.showInputDialog(null,
                                    "Ingrese el precio máximo: ", "Vivero Naturalis ®",
                                    JOptionPane.QUESTION_MESSAGE));
                            ServicioNombRango.buscarServRango(precioMin, precioMax);
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "El precio debe ser un número.", "Vivero Naturalis ®",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    case 3 -> {
                        JOptionPane.showMessageDialog(null, "Regresando al menú anterior.", "Vivero Naturalis ®",
                                JOptionPane.INFORMATION_MESSAGE);
                        InventarioServicios.inventarioServicios();
                    }
                    default -> {
                        JOptionPane.showMessageDialog(null, "Opción inválida, intente de nuevo.", "Vivero Naturalis ®",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Selección cancelada, regresando al menú anterior.",
                        "Vivero Naturalis ®",
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
    }

}
