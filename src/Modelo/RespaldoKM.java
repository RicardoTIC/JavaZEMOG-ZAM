
package Modelo;


public class RespaldoKM {
    
    private int id;
    private String fecha;
    private int codigoArea;
    private int kmsReales;
    private int kmsException;
    private int numeroViajes;
    private double cuotaDiaria;
    private double cuotaAcumulada;
    private double venta;
    private String nombreOperacion;
    private String error;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public RespaldoKM() {
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(int codigoArea) {
        this.codigoArea = codigoArea;
    }

    public int getKmsReales() {
        return kmsReales;
    }

    public void setKmsReales(int kmsReales) {
        this.kmsReales = kmsReales;
    }

    public int getKmsException() {
        return kmsException;
    }

    public void setKmsException(int kmsException) {
        this.kmsException = kmsException;
    }

    public int getNumeroViajes() {
        return numeroViajes;
    }

    public void setNumeroViajes(int numeroViajes) {
        this.numeroViajes = numeroViajes;
    }

    public double getCuotaDiaria() {
        return cuotaDiaria;
    }

    public void setCuotaDiaria(double cuotaDiaria) {
        this.cuotaDiaria = cuotaDiaria;
    }

    public double getCuotaAcumulada() {
        return cuotaAcumulada;
    }

    public void setCuotaAcumulada(double cuotaAcumulada) {
        this.cuotaAcumulada = cuotaAcumulada;
    }

    public double getVenta() {
        return venta;
    }

    public void setVenta(double venta) {
        this.venta = venta;
    }

    public String getNombreOperacion() {
        return nombreOperacion;
    }

    public void setNombreOperacion(String nombreOperacion) {
        this.nombreOperacion = nombreOperacion;
    }
    
    
    
    
    
}
