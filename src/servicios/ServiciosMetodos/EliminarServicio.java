package servicios.ServiciosMetodos;

import administrador.InventarioServicios;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import models.Servicio;

public class EliminarServicio {

    public static ArrayList<Servicio> servicios = new ArrayList<>();

    public static void eliminarServicio() {
        if (servicios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay servicios para eliminar.", "Vivero Naturalis ®",
                    JOptionPane.INFORMATION_MESSAGE);
            InventarioServicios.inventarioServicios();
        }
        int id = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese el ID del servicio a eliminar: ", "Vivero Naturalis ®",
                        JOptionPane.QUESTION_MESSAGE));

        boolean encontrado = false;
        for (Servicio servicio : servicios) {
            if (servicio.getId() == id) {
                servicios.remove(servicio);
                JOptionPane.showMessageDialog(null, "Servicio eliminado exitosamente.", "Vivero Naturalis ®",
                        JOptionPane.INFORMATION_MESSAGE);
                encontrado = true;
                InventarioServicios.inventarioServicios();
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Servicio no encontrado, intente de nuevo.", "Vivero Naturalis ®",
                    JOptionPane.ERROR_MESSAGE);
            eliminarServicio();
        }
    }
}
