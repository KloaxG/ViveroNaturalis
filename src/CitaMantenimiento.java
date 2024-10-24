
import java.util.ArrayList;
import java.util.Date;

class CitaMantenimiento {

    private Date fecha;
    private Cliente cliente;
    private ArrayList<TecnicoMantenimiento> tecnicos;
    private ArrayList<Planta> plantasAdicionales;
    private Servicio servicio;
    private double costoTotal;

    public CitaMantenimiento() {
    }

    public CitaMantenimiento(Date fecha, Cliente cliente, Servicio servicio) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.tecnicos = new ArrayList<>();
        this.plantasAdicionales = new ArrayList<>();
        this.servicio = servicio;
        calcularCostoTotal();
    }

    private void calcularCostoTotal() {
        double costoBase;
        if (cliente.getTamanoJardin() <= 20) {
            costoBase = 20000;
        } else if (cliente.getTamanoJardin() <= 50) {
            costoBase = 30000;
        } else {
            costoBase = 50000;
        }
        double costoPlantas = 0;
        for (Planta planta : plantasAdicionales) {
            costoPlantas += planta.getPrecio();
        }
        this.costoTotal = costoBase + costoPlantas + servicio.getPrecioBase();
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void agregarTecnico(TecnicoMantenimiento tecnico) {
        tecnicos.add(tecnico);
    }

    public void agregarPlanta(Planta planta) {
        plantasAdicionales.add(planta);
    }

    public ArrayList<TecnicoMantenimiento> getTecnicos() {
        return tecnicos;
    }

    public void setTecnicos(ArrayList<TecnicoMantenimiento> tecnicos) {
        this.tecnicos = tecnicos;
    }

    public ArrayList<Planta> getPlantasAdicionales() {
        return plantasAdicionales;
    }

    public void setPlantasAdicionales(ArrayList<Planta> plantasAdicionales) {
        this.plantasAdicionales = plantasAdicionales;
    }

    @Override
    public String toString() {
        return "Cita para " + cliente.getNombreCompleto() + " con el técnico " + tecnicos.get(0).getNombreCompleto() + " para el " + fecha + ".\nCosto total: " + costoTotal;
    }
};
