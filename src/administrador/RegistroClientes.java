package administrador;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import models.Cliente;

public class RegistroClientes {

    public static ArrayList<Cliente> clientes = new ArrayList<>();

    public static void registroCliente() {
        Cliente c = new Cliente();
        c.setNombreCompleto(JOptionPane.showInputDialog(null, "Ingrese su nombre: ", "Vivero Naturalis ®",
                JOptionPane.QUESTION_MESSAGE));
        while (true) {
            try {
                boolean cedulaRepetida = false;
                int cedula = Integer
                        .parseInt(JOptionPane.showInputDialog(null, "Ingrese su cédula: ", "Vivero Naturalis ®",
                                JOptionPane.QUESTION_MESSAGE));

                for (Cliente cliente : clientes) {
                    if (cliente.getCedula() == cedula) {
                        cedulaRepetida = true;
                        JOptionPane.showMessageDialog(null, "El número de cédula " + cedula + " ya fue registrado.");
                        break;
                    }
                }
                if (cedula == 117520608) {
                    JOptionPane.showMessageDialog(null, "No se puede registrar un administrador como cliente.", "Vivero Naturalis ®",
                            JOptionPane.ERROR_MESSAGE);
                } else if (!cedulaRepetida) {
                    c.setCedula(cedula);
                    break;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "La cédula debe ser un número.", "Vivero Naturalis ®",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        while (true) {
            boolean correoRepetido = false;
            String correo = JOptionPane.showInputDialog(null, "Ingrese su correo: ", "Vivero Naturalis ®",
                    JOptionPane.QUESTION_MESSAGE);
            if (correo != null) {

                String regex = "^[\\w-\\.]+@[\\w-\\.]+\\.(com|cr|gmail|hotmail|yahoo)$";
                if (correo.matches(regex)) {

                    for (Cliente cliente : clientes) {
                        if (cliente.getCorreo().equals(correo)) {
                            correoRepetido = true;
                            JOptionPane.showMessageDialog(null, "El correo " + correo + " ya fue registrado");
                            break;
                        }
                    }

                    if (!correoRepetido) {
                        c.setCorreo(correo);
                        break;
                    }
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Correo inválido, debe incluir un @ y un dominio válido (.com, .cr, etc.).",
                            "Vivero Naturalis ®", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un correo.", "Vivero Naturalis ®",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        while (true) {
            c.setContrasena(JOptionPane.showInputDialog(null, "Ingrese su contraseña: ", "Vivero Naturalis ®",
                    JOptionPane.QUESTION_MESSAGE));
            if (c.getContrasena().length() >= 4) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "La contraseña debe tener al menos 4 caracteres.",
                        "Vivero Naturalis ®",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        c.setRol("Cliente");
        c.setDireccion(JOptionPane.showInputDialog(null, "Ingrese su dirección: ", "Vivero Naturalis ®",
                JOptionPane.QUESTION_MESSAGE));
        while (true) {
            try {
                c.setTelefono(Integer
                        .parseInt(JOptionPane.showInputDialog(null, "Ingrese su teléfono: ", "Vivero Naturalis ®",
                                JOptionPane.QUESTION_MESSAGE)));

                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El teléfono debe ser un número.", "Vivero Naturalis ®",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        while (true) {
            try {
                c.setTamanoJardin(Double.parseDouble(JOptionPane.showInputDialog(null,
                        "Ingrese el tamaño de su jardín (en milimetros): ", "Vivero Naturalis ®",
                        JOptionPane.QUESTION_MESSAGE)));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El tamaño del jardín debe ser un número.", "Vivero Naturalis ®",
                        JOptionPane.ERROR_MESSAGE);
            }

        }

        clientes.add(c);
        JOptionPane.showMessageDialog(null, "Cliente registrado exitosamente: \n" + c.toString(), "Vivero Naturalis ®",
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Redirigiendo a Menú Principal", "Vivero Naturalis ®",
                JOptionPane.INFORMATION_MESSAGE);

    }

}
