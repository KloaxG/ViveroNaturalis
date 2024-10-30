package administrador;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import menus.MenuAdministrador;
import models.Planta;
import servicios.plant.ConsultarPlanta;
import servicios.plant.CrearPlanta;
import servicios.plant.EliminarPlanta;
import servicios.plant.ModificarPlanta;

public class InventarioPlantas {

    private static ArrayList<Planta> plantas = new ArrayList<>();

    public static void inventarioPlantas() {
        String[] opciones = {
            "1. Registrar Plantas",
            "2. Eliminar Plantas",
            "3. Consultar Plantas",
            "4. Modificar Plantas",
            "5. Regresar"
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
                    JOptionPane.showMessageDialog(null, "Redirigiendo a 'Registro de Plantas'", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    CrearPlanta.crearPlanta(plantas);
                }
                case 2 -> {
                    JOptionPane.showMessageDialog(null, "Redirigiendo a 'Eliminar Plantas'", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    EliminarPlanta.eliminarPlanta();
                }
                case 3 -> {
                    JOptionPane.showMessageDialog(null, "Redirigiendo a 'Consultar Plantas'", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    ConsultarPlanta.consultarPlanta(plantas);
                }
                case 4 -> {
                    JOptionPane.showMessageDialog(null, "Redirigiendo a 'Modificar Plantas'", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    ModificarPlanta.modificarPlanta(plantas);
                }
                case 5 -> {
                    JOptionPane.showMessageDialog(null, "Regresando a Menú Administrador", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    MenuAdministrador.mostrarMenuAdministrador();
                }

            }

        }

    }

    public static ArrayList<Planta> getPlantas() {
        return plantas;
    }
}
