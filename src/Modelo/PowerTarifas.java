package Modelo;

public class PowerTarifas {

    private int id;
    private int id_area;
    private int cuotaKmUnidad;
    private double cuotaViajesUnidad;
    private String fecha_inicio;
    private String accion;
    public String error;
    private String fechaInicio;
    private String fechaFinal;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
    
    
    
    
    
    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public PowerTarifas() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_area() {
        return id_area;
    }

    public void setId_area(int id_area) {
        this.id_area = id_area;
    }

    public int getCuotaKmUnidad() {
        return cuotaKmUnidad;
    }

    public void setCuotaKmUnidad(int cuotaKmUnidad) {
        this.cuotaKmUnidad = cuotaKmUnidad;
    }

    public double getCuotaViajesUnidad() {
        return cuotaViajesUnidad;
    }

    public void setCuotaViajesUnidad(double cuotaViajesUnidad) {
        this.cuotaViajesUnidad = cuotaViajesUnidad;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

}
