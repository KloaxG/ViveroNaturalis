package servicios.ServiciosMetodos;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import models.Servicio;

public class ServicioNombRango {

    public static ArrayList<Servicio> servicios = new ArrayList<>();

    public static void buscarServicioPorNombre(String nombre) {
        boolean encontrado = false;
        for (Servicio servicio : servicios) {
            if (servicio.getNombreServicio().equalsIgnoreCase(nombre)) {
                JOptionPane.showMessageDialog(null, servicio.toString(), "Vivero Naturalis ®",
                        JOptionPane.INFORMATION_MESSAGE);
                encontrado = true;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Servicio no encontrado, intente de nuevo.", "Vivero Naturalis ®",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void buscarServRango(double min, double max) {
        boolean encontrado = false;
        for (Servicio servicio : servicios) {
            if (servicio.getPrecioBase() >= min && servicio.getPrecioBase() <= max) {
                JOptionPane.showMessageDialog(null, servicio.toString(), "Vivero Naturalis ®",
                        JOptionPane.INFORMATION_MESSAGE);
                encontrado = true;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Servicio no encontrado, intente de nuevo.", "Vivero Naturalis ®",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
