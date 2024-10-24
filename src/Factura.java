import java.util.Date;

public class Factura {

    private int id;
    private Date fechaEmision;
    private double costoTotal;
    private Servicio servicios;

    public Factura(int id, Date fechaEmision, Servicio servicios, double costoTotal) {
        this.id = id;
        this.fechaEmision = fechaEmision;
        this.servicios = servicios;
        this.costoTotal = costoTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Servicio getServicios() {
        return servicios;
    }

    public void setServicios(Servicio servicios) {
        this.servicios = servicios;
    }

   
    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    @Override
    public String toString() {
        return "Factura {"
        + "\n\tID = " + id
        + "\n\tFecha de emisión = " + fechaEmision 
        + "\n\tCosto total = " + costoTotal
        + "\n\tServicios = [" + servicios + "\n\t]"
        + "\n}";
    }
}
