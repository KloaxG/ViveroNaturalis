package servicios.plant;

import administrador.InventarioPlantas;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import models.Planta;

public class ConsultarPlanta {

    public static void consultarPlanta(ArrayList<Planta> plantas) {
        if (plantas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay plantas para consultar.", "Vivero Naturalis ®",
                    JOptionPane.INFORMATION_MESSAGE);
            InventarioPlantas.inventarioPlantas();
        }
        String[] opciones = {
            "1. Nombre de la planta",
            "2. Especie de la planta",
            "3. Rango de precio",
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
                case 1 ->
                    consultarPorNombre(plantas);
                case 2 ->
                    consultarPorEspecie(plantas);
                case 3 ->
                    consultarPorRangoPrecio(plantas);
                case 4 -> {
                    JOptionPane.showMessageDialog(null, "Regresando al inventario", "Vivero Naturalis ®", JOptionPane.INFORMATION_MESSAGE);
                    InventarioPlantas.inventarioPlantas();
                }
            }
        }
    }

    private static void consultarPorNombre(ArrayList<Planta> plantas) {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de la planta a consultar: ", "Vivero Naturalis ®", JOptionPane.QUESTION_MESSAGE);
        boolean encontrado = false;
        for (Planta planta : plantas) {
            if (planta.getNombre().equalsIgnoreCase(nombre)) {
                JOptionPane.showMessageDialog(null, planta.toString(), "Resultado de Búsqueda", JOptionPane.INFORMATION_MESSAGE);
                encontrado = true;
                consultarPlanta(plantas);
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Planta no encontrada.", "Vivero Naturalis ®", JOptionPane.ERROR_MESSAGE);
            consultarPlanta(plantas);
        }
    }

    private static void consultarPorEspecie(ArrayList<Planta> plantas) {
        String especie = JOptionPane.showInputDialog(null, "Ingrese la especie de la planta a consultar: ", "Vivero Naturalis ®", JOptionPane.QUESTION_MESSAGE);
        boolean encontrado = false;
        for (Planta planta : plantas) {
            if (planta.getEspecie().equalsIgnoreCase(especie)) {
                JOptionPane.showMessageDialog(null, planta.toString(), "Resultado de Búsqueda", JOptionPane.INFORMATION_MESSAGE);
                encontrado = true;
                consultarPlanta(plantas);
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Planta no encontrada.", "Vivero Naturalis ®", JOptionPane.ERROR_MESSAGE);
            consultarPlanta(plantas);
        }
    }

    private static void consultarPorRangoPrecio(ArrayList<Planta> plantas) {
        double min = CrearPlanta.getDoubleInput("Ingrese el precio mínimo: ");
        double max = CrearPlanta.getDoubleInput("Ingrese el precio máximo: ");
        boolean encontrado = false;
        for (Planta planta : plantas) {
            if (planta.getPrecio() >= min && planta.getPrecio() <= max) {
                JOptionPane.showMessageDialog(null, planta.toString(), "Resultado de Búsqueda", JOptionPane.INFORMATION_MESSAGE);
                encontrado = true;
                consultarPlanta(plantas);
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "No se encontraron plantas en el rango especificado.", "Vivero Naturalis ®", JOptionPane.ERROR_MESSAGE);
            consultarPlanta(plantas);
        }
    }
}
