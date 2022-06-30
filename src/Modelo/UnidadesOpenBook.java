
package Modelo;


public class UnidadesOpenBook {
    private int id;
    private String id_unidad;
    private int id_area;
    private String fechaInicio;
    private String fechaFinal;
    private String tipoCuota;
    private int id_estatus;
    private int id_estatus_pepsi;
    private int id_estatus_operativo;
    private String comentario;
    
    private String Error;
    private String accion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getId_unidad() {
        return id_unidad;
    }

    public void setId_unidad(String id_unidad) {
        this.id_unidad = id_unidad;
    }

    public int getId_area() {
        return id_area;
    }

    public void setId_area(int id_area) {
        this.id_area = id_area;
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

    public String getTipoCuota() {
        return tipoCuota;
    }

    public void setTipoCuota(String tipoCuota) {
        this.tipoCuota = tipoCuota;
    }

    public int getId_estatus() {
        return id_estatus;
    }

    public void setId_estatus(int id_estatus) {
        this.id_estatus = id_estatus;
    }

    public int getId_estatus_pepsi() {
        return id_estatus_pepsi;
    }

    public void setId_estatus_pepsi(int id_estatus_pepsi) {
        this.id_estatus_pepsi = id_estatus_pepsi;
    }

    public int getId_estatus_operativo() {
        return id_estatus_operativo;
    }

    public void setId_estatus_operativo(int id_estatus_operativo) {
        this.id_estatus_operativo = id_estatus_operativo;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getError() {
        return Error;
    }

    public void setError(String Error) {
        this.Error = Error;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

}
