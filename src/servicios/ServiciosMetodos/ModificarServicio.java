package servicios.ServiciosMetodos;

import administrador.InventarioServicios;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import models.Servicio;

public class ModificarServicio {

    public static ArrayList<Servicio> servicios = new ArrayList<>();

    public static void modificarServicio() {
        if (servicios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay servicios para modificar.", "Vivero Naturalis ®",
                    JOptionPane.INFORMATION_MESSAGE);
            InventarioServicios.inventarioServicios();
        }
        int id = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese el ID del servicio a modificar: ", "Vivero Naturalis ®",
                        JOptionPane.QUESTION_MESSAGE));
        boolean encontrado = false;
        for (Servicio servicio : servicios) {
            if (servicio.getId() == id) {
                String opcion;
                boolean disponible;
                while (true) {
                    try {
                        servicio.setPrecioBase(Double.parseDouble(JOptionPane.showInputDialog(null,
                                "Ingrese el nuevo precio base del servicio: ", "Vivero Naturalis ®")));
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "El precio debe ser un número.", "Vivero Naturalis ®",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
                servicio.setDescripcion(JOptionPane.showInputDialog(null,
                        "Ingrese una breve descripción del servicio: ", "Vivero Naturalis ®"));
                while (true) {
                    try {
                        String duracionStr = JOptionPane.showInputDialog(null,
                                "Ingrese la nueva duración estimada del servicio (dd/MM/yyyy): ", "Vivero Naturalis ®");
                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                        sdf.setLenient(false);
                        Date duracionEstimada = sdf.parse(duracionStr);
                        servicio.setDuracionEstimada(duracionEstimada);
                        break;
                    } catch (ParseException e) {
                        JOptionPane.showMessageDialog(null,
                                "Formato de fecha inválido. Por favor use el formato dd/MM/yyyy.", "Vivero Naturalis ®",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
                while (true) {
                    opcion = JOptionPane.showInputDialog(null, "¿El servicio está disponible? (Y/N)",
                            "Vivero Naturalis ®");
                    switch (opcion.toUpperCase()) {
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
            }
        }

    }

}
