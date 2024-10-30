package menus;

import javax.swing.JOptionPane;

public class MenuCliente {

    public static void menuCliente() {
        String[] opciones = {
            "1. Citas de Mantenimiento",
            "2. Facturas",
            "3. Cerrar Sesión"
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
                    JOptionPane.showMessageDialog(null, "Verificar Facturas", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Cerrando Sesión", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    MenuInicial.mostrarMenu();
                    break;

            }

        }

    }
}
