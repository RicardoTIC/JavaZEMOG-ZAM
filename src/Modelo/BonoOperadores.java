package Modelo;



import java.util.Date;
import javafx.scene.chart.PieChart.Data;


public class BonoOperadores {
    
    private int id_personal;
    private String nombreOperador;
    private String nombreSucursa;
    private int meta;
    private double km;
    private int bono;
    private double capi;
    private String fechaInicio;
    private String fechaFinal;

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





    // Constructor
    public BonoOperadores() {
    }

    
    public int getId_personal() {
        return id_personal;
    }

    public void setId_personal(int id_personal) {
        this.id_personal = id_personal;
    }

    public String getNombreOperador() {
        return nombreOperador;
    }

    public void setNombreOperador(String nombreOperador) {
        this.nombreOperador = nombreOperador;
    }

    public String getNombreSucursa() {
        return nombreSucursa;
    }

    public void setNombreSucursa(String nombreSucursa) {
        this.nombreSucursa = nombreSucursa;
    }

    public int getMeta() {
        return meta;
    }

    public void setMeta(int meta) {
        this.meta = meta;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public int getBono() {
        return bono;
    }

    public void setBono(int bono) {
        this.bono = bono;
    }

    public double getCapi() {
        return capi;
    }

    public void setCapi(double capi) {
        this.capi = capi;
    }
    
    
    
}
