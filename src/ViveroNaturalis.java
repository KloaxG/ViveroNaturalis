
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class ViveroNaturalis {

    static ArrayList<Usuario> usuarios = new ArrayList<>();
    static ArrayList<TecnicoMantenimiento> tecnicos = new ArrayList<>();
    static ArrayList<Administrador> administradores = new ArrayList<>();
    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Planta> plantas = new ArrayList<>();
    static ArrayList<Servicio> servicios = new ArrayList<>();

    public static void main(String[] args) {
        Administrador administrador = new Administrador("Gerardo Gómez Calderón", "agomezc@ucenfotec.ac.cr", "1234",
                "Administrador", 117520608);
        administradores.add(administrador);
        JOptionPane.showMessageDialog(null, "             --Bienvenido--" + "\nSerá redirigido al menú inicial.",
                "Vivero Naturalis ®", JOptionPane.INFORMATION_MESSAGE);
        mostrarMenu();
    }

    /* METODOS DE MENUS */
    static void mostrarMenu() {
        String[] opciones = {
            "1. Iniciar Sesión",
            "2. Salir"
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
                    JOptionPane.showMessageDialog(null, "Redirigiendo a Iniciar Sesión", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    mostrarMenuInicioSesion();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,
                            "Gracias por utilizar el servicio del Vivero \nNaturalis, ha sido un placer servirle.",
                            "Vivero Naturalis ®", JOptionPane.INFORMATION_MESSAGE);
                    break;

            }

        }
    }

    static void mostrarMenuInicioSesion() {
        String[] opciones = {
            "1. Iniciar Sesión como Administrador",
            "2. Iniciar Sesión como Cliente",
            "3. Iniciar Sesión como Técnico de Mantenimiento",
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
                case 1 -> {
                    JOptionPane.showMessageDialog(null, "Redirigiendo a Iniciar Sesion como Administrador", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    iniciarSesionAdministrador();
                }
                case 2 -> {
                    JOptionPane.showMessageDialog(null, "Redirigiendo a Iniciar Sesion como Cliente", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    iniciarSesionCliente();
                }
                case 3 ->
                    JOptionPane.showMessageDialog(null, "Redirigiendo a Iniciar Sesion como Técnico de Mantenimiento", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                case 4 -> {
                    JOptionPane.showMessageDialog(null, "Redirigiendo a Menú Principal", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    mostrarMenu();
                }
            }

        }
    }

    static void menuCliente() {
        String[] opciones = {
            "1. Citas de Mantenimiento",
            "2. Facturas",
            "3. Descripción de Cliente",
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
                    JOptionPane.showMessageDialog(null, "Verificar Facturas", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Descripción de Cliente \n" + clientes.toString(), "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Cerrando Sesión", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    mostrarMenuInicioSesion();
                    break;

            }

        }

    }

    static void mostrarMenuAdministrador() {
        String[] opciones = {
            "1. Gestionar Plantas",
            "2. Gestionar Inventario",
            "3. Registrar Clientes",
            "4. Registrar Técnicos de Mantenimiento",
            "5. Gestionar Servicios",
            "6. Cerrar Sesión"
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
                    JOptionPane.showMessageDialog(null, "Redirigiendo a 'Inventario de Plantas'", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    inventarioPlantas();
                }

                case 2 -> {
                    JOptionPane.showMessageDialog(null, "Redirigiendo a 'Gestión de Inventario'", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                }

                case 3 -> {
                    JOptionPane.showMessageDialog(null, "Redirigiendo a 'Registro de Clientes'", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    registroCliente();
                }

                case 4 -> {
                    JOptionPane.showMessageDialog(null, "Redirigiendo a 'Registro de Tecnicos'", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);

                }
                case 5 -> {
                    JOptionPane.showMessageDialog(null, "'Redirigiendo a 'Gestión de Servicios'", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    inventarioServicios();
                }

                case 6 -> {
                    JOptionPane.showMessageDialog(null, "Cerrando sesión, hasta la próxima.", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    mostrarMenuInicioSesion();
                }
            }

        }
    }

    //METODOS DE INICIO DE SESION
    static void iniciarSesionAdministrador() {
        String correo = JOptionPane.showInputDialog(null, "Ingrese su correo: ", "Vivero Naturalis ®",
                JOptionPane.QUESTION_MESSAGE);
        String contrasena = JOptionPane.showInputDialog(null, "Ingrese su contraseña: ", "Vivero Naturalis ®",
                JOptionPane.QUESTION_MESSAGE);

        if (correo == null || correo.isEmpty() || contrasena == null || contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese todos los campos.", "Vivero Naturalis ®",
                    JOptionPane.ERROR_MESSAGE);
            mostrarMenuInicioSesion();
            return;
        }

        boolean encontrado = false;
        for (Administrador administrador : administradores) {
            if (administrador.getCorreo().equals(correo) && administrador.getContrasena().equals(contrasena)) {
                JOptionPane.showMessageDialog(null, "Bienvenido " + administrador.getNombreCompleto(), "Vivero Naturalis ®",
                        JOptionPane.INFORMATION_MESSAGE);
                mostrarMenuAdministrador();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null,
                    "Usuario no encontrado, verifique sus credenciales e intente de nuevo.", "Vivero Naturalis ®", JOptionPane.ERROR_MESSAGE);
            mostrarMenuInicioSesion();
        }
    }

    static void iniciarSesionCliente() {
        if (clientes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay clientes registrados.", "Vivero Naturalis ®",
                    JOptionPane.INFORMATION_MESSAGE);
            mostrarMenuInicioSesion();
            return;
        }
        String correo = JOptionPane.showInputDialog(null, "Ingrese su correo: ", "Vivero Naturalis ®",
                JOptionPane.QUESTION_MESSAGE);
        String contrasena = JOptionPane.showInputDialog(null, "Ingrese su contraseña: ", "Vivero Naturalis ®",
                JOptionPane.QUESTION_MESSAGE);

        if (correo == null || correo.isEmpty() || contrasena == null || contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese todos los campos.", "Vivero Naturalis ®",
                    JOptionPane.ERROR_MESSAGE);
            mostrarMenuInicioSesion();
            return;
        }

        boolean encontrado = false;
        for (Cliente cliente : clientes) {
            if (cliente.getCorreo().equals(correo) && cliente.getContrasena().equals(contrasena)) {
                JOptionPane.showMessageDialog(null, "Bienvenido " + cliente.getNombreCompleto(), "Vivero Naturalis ®",
                        JOptionPane.INFORMATION_MESSAGE);
                encontrado = true;
                menuCliente();
                break;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null,
                    "Usuario no encontrado, verifique sus credenciales e intente de nuevo.", "Vivero Naturalis ®", JOptionPane.ERROR_MESSAGE);
            mostrarMenuInicioSesion();
        }
    }

    //METODOS DE REGISTROS
    static void registroCliente() {
        Cliente c = new Cliente();
        //Ingreso de nombre
        c.setNombreCompleto(JOptionPane.showInputDialog(null, "Ingrese su nombre: ", "Vivero Naturalis ®",
                JOptionPane.QUESTION_MESSAGE));
        //Ingreso de cedula
        while (true) {
            try {
                c.setCedula(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su cédula: ", "Vivero Naturalis ®",
                        JOptionPane.QUESTION_MESSAGE)));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "La cédula debe ser un número.", "Vivero Naturalis ®",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        //Ingreso de correo
        while (true) {
            String correo = JOptionPane.showInputDialog(null, "Ingrese su correo: ", "Vivero Naturalis ®",
                    JOptionPane.QUESTION_MESSAGE);
            if (correo != null) {

                String regex = "^[\\w-\\.]+@[\\w-\\.]+\\.(com|cr|gmail|hotmail|yahoo)$";
                if (correo.matches(regex)) {
                    c.setCorreo(correo);
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Correo inválido, debe incluir un @ y un dominio válido (.com, .cr, etc.).",
                            "Vivero Naturalis ®", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un correo.", "Vivero Naturalis ®", JOptionPane.ERROR_MESSAGE);
            }
        }
        //Ingreso de contraseña
        while (true) {
            c.setContrasena(JOptionPane.showInputDialog(null, "Ingrese su contraseña: ", "Vivero Naturalis ®",
                    JOptionPane.QUESTION_MESSAGE));
            if (c.getContrasena().length() >= 4) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "La contraseña debe tener al menos 4 caracteres.", "Vivero Naturalis ®",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        c.setRol("Cliente");
        //Ingreso de dirección
        c.setDireccion(JOptionPane.showInputDialog(null, "Ingrese su dirección: ", "Vivero Naturalis ®",
                JOptionPane.QUESTION_MESSAGE));
        //Ingreso de teléfono
        while (true) {
            try {
                c.setTelefono(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su teléfono: ", "Vivero Naturalis ®",
                        JOptionPane.QUESTION_MESSAGE)));

                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El teléfono debe ser un número.", "Vivero Naturalis ®",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        //Ingreso de tamaño de jardín
        while (true) {
            try {
                c.setTamanoJardin(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el tamaño de su jardín: ", "Vivero Naturalis ®",
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
        mostrarMenuInicioSesion();
    }

    static void registroTecnicoMantenimiento() {
        TecnicoMantenimiento tecnico = new TecnicoMantenimiento();
        tecnico.setNombreCompleto(JOptionPane.showInputDialog(null, "Ingrese su nombre completo: ", "Vivero Naturalis ®",
                JOptionPane.QUESTION_MESSAGE));
        tecnico.setCorreo(JOptionPane.showInputDialog(null, "Ingrese su correo: ", "Vivero Naturalis ®",
                JOptionPane.QUESTION_MESSAGE));
        tecnico.setContrasena(JOptionPane.showInputDialog(null, "Ingrese su contraseña: ", "Vivero Naturalis ®",
                JOptionPane.QUESTION_MESSAGE));

        if (tecnico.getNombreCompleto().isEmpty() || tecnico.getCorreo().isEmpty()
                || tecnico.getContrasena().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.", "Vivero Naturalis ®",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        tecnico.setRol("Técnico de Mantenimiento");
        tecnico.setCedula(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su cédula: ")));
        tecnico.setEspecializacion(JOptionPane.showInputDialog(null, "Ingrese su especialización: "));
        tecnico.setTelefono(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su teléfono: ")));
        tecnicos.add(tecnico);
        JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente: \n" + tecnico.toString());
        JOptionPane.showMessageDialog(null, "Redirigiendo a Menú Principal");
        mostrarMenuInicioSesion();
    }

    //METODOS DE INVENTARIO DE PLANTAS
    static void inventarioPlantas() {
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
                    crearPlanta();
                }
                case 2 -> {
                    JOptionPane.showMessageDialog(null, "Redirigiendo a 'Eliminar Plantas'", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    eliminarPlanta();
                }
                case 3 -> {
                    JOptionPane.showMessageDialog(null, "Redirigiendo a 'Consultar Plantas'", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    consultarPlanta();
                }
                case 4 -> {
                    JOptionPane.showMessageDialog(null, "Redirigiendo a 'Modificar Plantas'", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    modificarPlanta();
                }
                case 5 -> {
                    JOptionPane.showMessageDialog(null, "Regresando a Menú Administrador", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    mostrarMenuAdministrador();
                }

            }

        }
    }

    static void crearPlanta() {
        String opcion;
        boolean disponible;
        Planta p = new Planta();
        p.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre de la planta: ", "Vivero Naturalis ®",
                JOptionPane.QUESTION_MESSAGE));
        p.setEspecie(JOptionPane.showInputDialog(null, "Ingrese el tipo de la planta: ", "Vivero Naturalis ®",
                JOptionPane.QUESTION_MESSAGE));

        while (true) {
            try {
                p.setId(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID de la planta: ", "Vivero Naturalis ®",
                        JOptionPane.QUESTION_MESSAGE)));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El ID debe ser un número.", "Vivero Naturalis ®",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        while (true) {
            try {
                p.setPrecio(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio de la planta: ", "Vivero Naturalis ®",
                        JOptionPane.QUESTION_MESSAGE)));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El precio debe ser un número.", "Vivero Naturalis ®",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        while (true) {
            try {
                p.setStock(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad en stock de la planta: ", "Vivero Naturalis ®",
                        JOptionPane.QUESTION_MESSAGE)));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El stock debe ser un número.", "Vivero Naturalis ®",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        p.setDescripcion(JOptionPane.showInputDialog(null, "Ingrese una breve descripción de la planta: ", "Vivero Naturalis ®",
                JOptionPane.QUESTION_MESSAGE));
        while (true) {
            opcion = JOptionPane.showInputDialog(null, "¿La planta está disponible? (Y/N)", "Vivero Naturalis ®",
                    JOptionPane.QUESTION_MESSAGE);
            switch (opcion) {
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
        p.setDisponible(disponible);
        plantas.add(p);
        JOptionPane.showMessageDialog(null, "Planta registrada exitosamente: \n" + p.toString(), "Vivero Naturalis ®",
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Regresando a 'Inventario Plantas'", "Vivero Naturalis ®",
                JOptionPane.INFORMATION_MESSAGE);
        inventarioPlantas();
    }

    static void eliminarPlanta() {
        if (plantas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay plantas para eliminar.", "Vivero Naturalis ®",
                    JOptionPane.INFORMATION_MESSAGE);
            inventarioPlantas();
        }
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID de la planta a eliminar: ", "Vivero Naturalis ®",
                JOptionPane.QUESTION_MESSAGE));

        boolean encontrado = false;
        for (Planta planta : plantas) {
            if (planta.getId() == id) {
                plantas.remove(planta);
                JOptionPane.showMessageDialog(null, "Planta eliminada exitosamente.", "Vivero Naturalis ®",
                        JOptionPane.INFORMATION_MESSAGE);
                encontrado = true;
                inventarioPlantas();
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Planta no encontrada, intente de nuevo.", "Vivero Naturalis ®",
                    JOptionPane.ERROR_MESSAGE);
            eliminarPlanta();
        }
    }

    static void consultarPlanta() {
        if (plantas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay plantas para consultar.", "Vivero Naturalis ®",
                    JOptionPane.INFORMATION_MESSAGE);
            inventarioPlantas();
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
                case 1 -> {
                    while (true) {
                        try {
                            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de la planta a consultar: ", "Vivero Naturalis ®",
                                    JOptionPane.QUESTION_MESSAGE);
                            boolean encontrado = false;
                            for (Planta planta : plantas) {
                                if (planta.getNombre().equals(nombre)) {
                                    JOptionPane.showMessageDialog(null, planta.toString(), "Vivero Naturalis ®",
                                            JOptionPane.INFORMATION_MESSAGE);
                                    encontrado = true;
                                    consultarPlanta();
                                }
                            }
                            if (!encontrado) {
                                JOptionPane.showMessageDialog(null, "Planta no encontrada, intente de nuevo.", "Vivero Naturalis ®",
                                        JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "El nombre debe ser un texto.", "Vivero Naturalis ®",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
                case 2 -> {
                    while (true) {
                        try {
                            String especie = JOptionPane.showInputDialog(null, "Ingrese la especie de la planta a consultar: ", "Vivero Naturalis ®",
                                    JOptionPane.QUESTION_MESSAGE);
                            boolean encontrado = false;
                            for (Planta planta : plantas) {
                                if (planta.getEspecie().equals(especie)) {
                                    JOptionPane.showMessageDialog(null, planta.toString());
                                    encontrado = true;
                                    consultarPlanta();
                                }
                            }
                            if (!encontrado) {
                                JOptionPane.showMessageDialog(null, "Planta no encontrada, intente de nuevo.", "Vivero Naturalis ®",
                                        JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "La especie debe ser un texto.", "Vivero Naturalis ®",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
                case 3 -> {
                    while (true) {
                        try {
                            double min = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio mínimo: ", "Vivero Naturalis ®",
                                    JOptionPane.QUESTION_MESSAGE));
                            double max = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio máximo: ", "Vivero Naturalis ®",
                                    JOptionPane.QUESTION_MESSAGE));
                            boolean encontrado = false;
                            for (Planta planta : plantas) {
                                if (planta.getPrecio() >= min && planta.getPrecio() <= max) {
                                    JOptionPane.showMessageDialog(null, planta.toString(), "Vivero Naturalis ®",
                                            JOptionPane.INFORMATION_MESSAGE);
                                    encontrado = true;
                                    consultarPlanta();
                                }
                            }
                            if (!encontrado) {
                                JOptionPane.showMessageDialog(null, "Planta no encontrada, intente de nuevo.", "Vivero Naturalis ®",
                                        JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "El precio debe ser un número.", "Vivero Naturalis ®",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
                case 4 -> {
                    JOptionPane.showMessageDialog(null, "Regresando a 'Inventario Plantas'", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    inventarioPlantas();
                }
            }
        }

    }

    static void modificarPlanta() {
        if (plantas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay plantas para modificar.", "Vivero Naturalis ®",
                    JOptionPane.INFORMATION_MESSAGE);
            inventarioPlantas();
        }
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID de la planta a modificar: ", "Vivero Naturalis ®",
                JOptionPane.QUESTION_MESSAGE));
        boolean encontrado = false;
        for (Planta planta : plantas) {
            if (planta.getId() == id) {
                String opcion;
                boolean disponible;
                planta.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre de la planta: ", "Vivero Naturalis ®"));
                planta.setEspecie(JOptionPane.showInputDialog(null, "Ingrese la nueva especie de la planta: ", "Vivero Naturalis ®"));
                while (true) {
                    try {
                        planta.setPrecio(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el nuevo precio de la planta: ", "Vivero Naturalis ®")));
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "El precio debe ser un número.", "Vivero Naturalis ®",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
                while (true) {
                    try {
                        planta.setStock(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la nueva cantidad en stock de la planta: ", "Vivero Naturalis ®")));
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "El stock debe ser un número.", "Vivero Naturalis ®",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
                planta.setDescripcion(JOptionPane.showInputDialog(null, "Ingrese una breve descripción de la planta: ", "Vivero Naturalis ®"));
                while (true) {
                    opcion = JOptionPane.showInputDialog(null, "¿La planta está disponible? (Y/N)", "Vivero Naturalis ®");
                    switch (opcion) {
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
                planta.setDisponible(disponible);
                JOptionPane.showMessageDialog(null, "Planta modificada exitosamente: \n" + planta.toString(), "Vivero Naturalis ®",
                        JOptionPane.INFORMATION_MESSAGE);
                encontrado = true;
                inventarioPlantas();
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Planta no encontrada, intente de nuevo.", "Vivero Naturalis ®",
                    JOptionPane.ERROR_MESSAGE);
            modificarPlanta();
        }
    }

    //METODOS DE INVENTARIO DE SERVICIOS
    static void inventarioServicios() {
        String[] opciones = {
            "1. Registrar Servicios",
            "2. Eliminar Servicios",
            "3. Consultar Servicios",
            "4. Modificar Servicios",
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
                    JOptionPane.showMessageDialog(null, "Redirigiendo a 'Registro de Servicios'", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    crearServicio();
                }
                case 2 -> {
                    JOptionPane.showMessageDialog(null, "Redirigiendo a 'Eliminar Servicios'", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    eliminarServicio();
                }
                case 3 -> {
                    JOptionPane.showMessageDialog(null, "Redirigiendo a 'Consultar Servicios'", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    consultarServicio();
                }
                case 4 -> {
                    JOptionPane.showMessageDialog(null, "Redirigiendo a 'Modificar Servicios'", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    modificarServicio();
                }
                case 5 -> {
                    JOptionPane.showMessageDialog(null, "Regresando a Menú Administrador", "Vivero Naturalis ®",
                            JOptionPane.INFORMATION_MESSAGE);
                    mostrarMenuAdministrador();
                }

            }

        }
    }

    static void crearServicio() {
        boolean disponible;
        String opcion;

        Servicio s = new Servicio();
        s.setNombreServicio(JOptionPane.showInputDialog(null, "Ingrese el nombre del servicio: ", "Vivero Naturalis ®",
                JOptionPane.QUESTION_MESSAGE));
        String[] opciones = {
            "1. Mantenimiento de Jardines",
            "2. Fumigación",
            "3. Instalación de sistemas de riego automático"
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
            }

        }
        while (true) {
            try {
                s.setId(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del servicio: ", "Vivero Naturalis ®",
                        JOptionPane.QUESTION_MESSAGE)));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El ID debe ser un número.", "Vivero Naturalis ®",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        while (true) {
            try {
                s.setPrecioBase(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio base del servicio: ", "Vivero Naturalis ®",
                        JOptionPane.QUESTION_MESSAGE)));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El precio debe ser un número.", "Vivero Naturalis ®",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        s.setDescripcion(JOptionPane.showInputDialog(null, "Ingrese una breve descripción del servicio: ", "Vivero Naturalis ®",
                JOptionPane.QUESTION_MESSAGE));

        while (true) {
            try {
                String duracionStr = JOptionPane.showInputDialog(null, "Ingrese la duración estimada del servicio (dd/MM/yyyy): ", "Vivero Naturalis ®",
                        JOptionPane.QUESTION_MESSAGE);
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                sdf.setLenient(false);
                Date duracionEstimada = sdf.parse(duracionStr);
                s.setDuracionEstimada(duracionEstimada);
                break;
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Formato de fecha inválido. Por favor use el formato dd/MM/yyyy.", "Vivero Naturalis ®",
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
        inventarioServicios();

    }

    static void eliminarServicio() {
        if (servicios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay servicios para eliminar.", "Vivero Naturalis ®",
                    JOptionPane.INFORMATION_MESSAGE);
            inventarioServicios();
        }
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del servicio a eliminar: ", "Vivero Naturalis ®",
                JOptionPane.QUESTION_MESSAGE));

        boolean encontrado = false;
        for (Servicio servicio : servicios) {
            if (servicio.getId() == id) {
                servicios.remove(servicio);
                JOptionPane.showMessageDialog(null, "Servicio eliminado exitosamente.", "Vivero Naturalis ®",
                        JOptionPane.INFORMATION_MESSAGE);
                encontrado = true;
                inventarioServicios();
            }
        }

    }

    static void consultarServicio() {
        if (servicios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay servicios para consultar.", "Vivero Naturalis ®",
                    JOptionPane.INFORMATION_MESSAGE);
            inventarioServicios();
            return;
        }

        String[] opciones = {
            "1. Nombre del servicio",
            "2. Rango de precio",
            "3. Regresar"
        };

        while (true) {
            String seleccion = (String) JOptionPane.showInputDialog(
                    null,
                    "Seleccione un criterio de búsqueda: ",
                    "Vivero Naturalis ®",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);

            if (seleccion != null) {
                int opcion = Integer.parseInt(seleccion.split("\\.")[0]);

                switch (opcion) {
                    case 1 -> {
                        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del servicio: ", "Vivero Naturalis ®",
                                JOptionPane.QUESTION_MESSAGE);
                        buscarServicioPorNombre(nombre);
                    }
                    case 2 -> {
                        try {
                            double precioMin = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio mínimo: ", "Vivero Naturalis ®",
                                    JOptionPane.QUESTION_MESSAGE));
                            double precioMax = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio máximo: ", "Vivero Naturalis ®",
                                    JOptionPane.QUESTION_MESSAGE));
                            buscarServRango(precioMin, precioMax);
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "El precio debe ser un número.", "Vivero Naturalis ®",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    case 3 -> {
                        JOptionPane.showMessageDialog(null, "Regresando al menú anterior.", "Vivero Naturalis ®",
                                JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                    default -> {
                        JOptionPane.showMessageDialog(null, "Opción inválida, intente de nuevo.", "Vivero Naturalis ®",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Selección cancelada, regresando al menú anterior.", "Vivero Naturalis ®",
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
    }

    static void modificarServicio() {
        if (servicios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay servicios para modificar.", "Vivero Naturalis ®",
                    JOptionPane.INFORMATION_MESSAGE);
            inventarioServicios();
        }
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del servicio a modificar: ", "Vivero Naturalis ®",
                JOptionPane.QUESTION_MESSAGE));
        boolean encontrado = false;
        for (Servicio servicio : servicios) {
            if (servicio.getId() == id) {
                String opcion;
                boolean disponible;
                while (true) {
                    try {
                        servicio.setPrecioBase(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el nuevo precio base del servicio: ", "Vivero Naturalis ®")));
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "El precio debe ser un número.", "Vivero Naturalis ®",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
                servicio.setDescripcion(JOptionPane.showInputDialog(null, "Ingrese una breve descripción del servicio: ", "Vivero Naturalis ®"));
                while (true) {
                    try {
                        String duracionStr = JOptionPane.showInputDialog(null, "Ingrese la nueva duración estimada del servicio (dd/MM/yyyy): ", "Vivero Naturalis ®");
                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                        sdf.setLenient(false);
                        Date duracionEstimada = sdf.parse(duracionStr);
                        servicio.setDuracionEstimada(duracionEstimada);
                        break;
                    } catch (ParseException e) {
                        JOptionPane.showMessageDialog(null, "Formato de fecha inválido. Por favor use el formato dd/MM/yyyy.", "Vivero Naturalis ®",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
                while (true) {
                    opcion = JOptionPane.showInputDialog(null, "¿El servicio está disponible? (Y/N)", "Vivero Naturalis ®");
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
            }
        }

    }

    static void buscarServicioPorNombre(String nombre) {
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

    static void buscarServRango(double min, double max) {
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
