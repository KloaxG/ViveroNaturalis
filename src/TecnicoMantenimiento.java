
class TecnicoMantenimiento extends Usuario {

    public void iniciarSesion() {
        System.out.println("Iniciando sesión para Técnico de Mantenimiento");
    }

    private String especializacion;
    private int telefono;
    private boolean activo;

    public TecnicoMantenimiento() {
    }

    public TecnicoMantenimiento(String nombreCompleto, String correo, String contrasena, String rol, int cedula,
            String especializacion, int telefono, boolean activo) {
        super(nombreCompleto, correo, contrasena, rol, cedula);
        this.especializacion = especializacion;
        this.telefono = telefono;
        this.activo = activo;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean getIsActivo() {
        return activo;
    }

    public void setIsActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "TecnicoMantenimiento{"
                + "Especializacion= " + especializacion + "\nTelefono = " + telefono + "\n¿Activo? = " + activo + "\n"
                + super.toString();
    }

};
