
abstract class Usuario {

    protected int cedula;
    protected String nombreCompleto;
    protected String correo;
    protected String contrasena;
    protected String rol;

    public Usuario() {
    }

    public Usuario(String nombreCompleto, String correo, String contrasena, String rol, int cedula) {
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.contrasena = contrasena;
        this.rol = rol;
        this.cedula = cedula;
    }

    abstract void iniciarSesion();

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        String usuario = "Nombre: " + nombreCompleto + "\nCorreo: " + correo + "\nRol: " + rol + "\nCedula: " + cedula;
        return usuario;
    }
}
