package servicios.plant;

import administrador.InventarioPlantas;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import models.Planta;

public class EliminarPlanta {

    public static ArrayList<Planta> plantas = new ArrayList<>();

    public static void eliminarPlanta() {
        if (plantas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay plantas para eliminar.", "Vivero Naturalis ®",
                    JOptionPane.INFORMATION_MESSAGE);
            InventarioPlantas.inventarioPlantas();
        }
        int id = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese el ID de la planta a eliminar: ", "Vivero Naturalis ®",
                        JOptionPane.QUESTION_MESSAGE));

        boolean encontrado = false;
        for (Planta planta : plantas) {
            if (planta.getId() == id) {
                plantas.remove(planta);
                JOptionPane.showMessageDialog(null, "Planta eliminada exitosamente.", "Vivero Naturalis ®",
                        JOptionPane.INFORMATION_MESSAGE);
                encontrado = true;
                InventarioPlantas.inventarioPlantas();
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Planta no encontrada, intente de nuevo.", "Vivero Naturalis ®",
                    JOptionPane.ERROR_MESSAGE);
            eliminarPlanta();
        }
    }
}
