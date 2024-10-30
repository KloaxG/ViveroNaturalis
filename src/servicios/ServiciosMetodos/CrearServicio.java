package servicios.ServiciosMetodos;

import administrador.InventarioServicios;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import models.Servicio;

public class CrearServicio {

    public static ArrayList<Servicio> servicios = new ArrayList<>();

    public static void crearServicio() {
        boolean disponible;
        String opcion;

        Servicio s = new Servicio();
        String[] opciones = {
            "1. Mantenimiento de Jardines",
            "2. Fumigación",
            "3. Instalación de sistemas de riego automático",
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
            int option = Integer.parseInt(seleccion.split("\\.")[0]);

            switch (option) {
                case 1 ->
                    s.setNombreServicio("Mantenimiento de Jardines");
                case 2 ->
                    s.setNombreServicio("Fumigación");
                case 3 ->
                    s.setNombreServicio("Instalación de sistemas de riego automático");
                case 4 -> {
                    JOptionPane.showMessageDialog(null, "Regresando a 'Inventario Servicios'", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    InventarioServicios.inventarioServicios();
                }
            }
        }
        while (true) {
            try {
                s.setId(Integer.parseInt(
                        JOptionPane.showInputDialog(null, "Ingrese el ID del servicio: ", "Vivero Naturalis ®",
                                JOptionPane.QUESTION_MESSAGE)));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El ID debe ser un número.", "Vivero Naturalis ®",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        while (true) {
            try {
                s.setPrecioBase(Double.parseDouble(
                        JOptionPane.showInputDialog(null, "Ingrese el precio base del servicio: ", "Vivero Naturalis ®",
                                JOptionPane.QUESTION_MESSAGE)));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El precio debe ser un número.", "Vivero Naturalis ®",
                        JOptionPane.ERROR_MESSAGE);
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un precio.", "Vivero Naturalis ®",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        s.setDescripcion(
                JOptionPane.showInputDialog(null, "Ingrese una breve descripción del servicio: ", "Vivero Naturalis ®",
                        JOptionPane.QUESTION_MESSAGE));

        while (true) {
            try {
                String duracionStr = JOptionPane.showInputDialog(null,
                        "Ingrese la duración estimada del servicio (dd/MM/yyyy): ", "Vivero Naturalis ®",
                        JOptionPane.QUESTION_MESSAGE);
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                sdf.setLenient(false);
                Date duracionEstimada = sdf.parse(duracionStr);
                s.setDuracionEstimada(duracionEstimada);
                break;
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Formato de fecha inválido. Por favor use el formato dd/MM/yyyy.",
                        "Vivero Naturalis ®",
                        JOptionPane.ERROR_MESSAGE);
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar una fecha.", "Vivero Naturalis ®",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        while (true) {
            opcion = JOptionPane.showInputDialog(null, "¿El servicio está disponible? (Y/N)", "Vivero Naturalis ®",
                    JOptionPane.QUESTION_MESSAGE);
            switch (opcion.toUpperCase()) {
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
        s.setIsDisponible(disponible);
        servicios.add(s);
        JOptionPane.showMessageDialog(null, "Servicio registrado exitosamente: \n" + s.toString(), "Vivero Naturalis ®",
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Regresando a 'Inventario Servicios'", "Vivero Naturalis ®",
                JOptionPane.INFORMATION_MESSAGE);
        InventarioServicios.inventarioServicios();

    }
}
