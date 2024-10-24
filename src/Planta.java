
class Planta {

    private int id;
    private String nombre;
    private String especie;
    private double precio;
    private int stock;
    private String descripcion;
    private boolean disponible;

    public Planta() {
    }

    public Planta(int id, String nombre, String especie, double precio, int stock, String descripcion, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.precio = precio;
        this.stock = stock;
        this.descripcion = descripcion;
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Planta"
                + "\nID = " + id + ", Nombre = " + "." + nombre + "\nEspecie = " + especie + "." + "\nPrecio = " + precio + "." + "\nStock = " + stock + "." + "\nDescripcion = " + descripcion + "." + "\nDisponible = " + disponible + ".";
    }

};
