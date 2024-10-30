package menus;

import javax.swing.JOptionPane;

public class MenuTecnico {

    public static void menuTecnico() {
        String[] opciones = {
            "1. Ver Citas de Mantenimiento",
            "2. Ver Detalle de Cita",
            "3. Finalizar Cita",
            "4. Cerrar Sesión"
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
                case 1:
                    JOptionPane.showMessageDialog(null, "Verificar Citas de Mantenimiento", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Ver Detalle de Cita", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Finalizar Cita", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Cerrando Sesión", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    MenuInicial.mostrarMenu();
                    break;
            }

        }
    }

}
