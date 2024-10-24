
import java.util.Date;

class Servicio {

    private int id;
    private String nombreServicio;
    private String descripcion;
    private double precioBase;
    private Date duracionEstimada;
    private boolean disponible;

    public Servicio() {

    }

    public Servicio(int id, String nombreServicio, String descripcion, double precioBase, Date duracionEstimada, boolean disponible) {

        this.id = id;
        this.nombreServicio = nombreServicio;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        this.duracionEstimada = duracionEstimada;
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public Date getDuracionEstimada() {
        return duracionEstimada;
    }

    public void setDuracionEstimada(Date duracionEstimada) {
        this.duracionEstimada = duracionEstimada;
    }

    public boolean getIsDisponible() {
        return disponible;
    }

    public void setIsDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Servicio"
                + "\nID = " + id + ", Nombre del servicio='" + nombreServicio
                + "\nDescripcion='" + descripcion
                + "\nPrecioBase=" + precioBase
                + "\nDuracion estimada=" + duracionEstimada
                + "\nDisponible=" + disponible;
    }
}
