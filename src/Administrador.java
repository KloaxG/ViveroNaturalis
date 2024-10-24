
class Administrador extends Usuario {

    public Administrador() {
    }

    public Administrador(String nombreCompleto, String correo, String contrasena, String rol, int cedula) {
        super(nombreCompleto, correo, contrasena, rol, cedula);

    }

    public void iniciarSesion() {

    }

    @Override
    public String toString() {
        return "Administrador: \n" + super.toString();
    }
};
