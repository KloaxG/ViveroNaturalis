
class Cliente extends Usuario {

    public void iniciarSesion() {
    }

    private String direccion;
    private int telefono;
    private double tamanoJardin;
    private CitaMantenimiento verCitaMantenimiento;

    public Cliente() {
    }

    ;

    public Cliente(String nombreCompleto, String correo, String contrasena, String rol, int cedula, String direccion,
            int telefono, double tamanoJardin, CitaMantenimiento verCitaMantenimiento) {
        super(nombreCompleto, correo, contrasena, rol, cedula);
        this.direccion = direccion;
        this.telefono = telefono;
        this.tamanoJardin = tamanoJardin;
        this.verCitaMantenimiento = verCitaMantenimiento;

    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getTamanoJardin() {
        return tamanoJardin;
    }

    public void setTamanoJardin(double tamanoJardin) {
        this.tamanoJardin = tamanoJardin;
    }

    public CitaMantenimiento getVerCitaMantenimiento() {
        return verCitaMantenimiento;
    }

    @Override
    public String toString() {
        return "Cliente: " + super.nombreCompleto + ", Correo: " + super.correo + "\nDireccion: " + direccion + " \nTelefono: " + telefono + " \nTamano Jardin: "
                + tamanoJardin;
    }

};
