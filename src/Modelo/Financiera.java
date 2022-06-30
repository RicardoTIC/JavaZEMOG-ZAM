
package Modelo;


public class Financiera {
    
    private int id;
    private String fecha_financiera;
    private int diaMes;
    private double kilometros;
    private double venta;
    private double ventaXkm;
    private double VentaDiaria;
    private double KmsDiarios;
    private int id_area;
    private String accion;

    public String getError() {
        return Error;
    }

    public void setError(String Error) {
        this.Error = Error;
    }
    
    private String Error;

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }
    
    
    public Financiera() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha_financiera() {
        return fecha_financiera;
    }

    public void setFecha_financiera(String fecha_financiera) {
        this.fecha_financiera = fecha_financiera;
    }

    public int getDiaMes() {
        return diaMes;
    }

    public void setDiaMes(int diaMes) {
        this.diaMes = diaMes;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    public double getVenta() {
        return venta;
    }

    public void setVenta(double venta) {
        this.venta = venta;
    }

    public double getVentaXkm() {
        return ventaXkm;
    }

    public void setVentaXkm(double ventaXkm) {
        this.ventaXkm = ventaXkm;
    }

    public double getVentaDiaria() {
        return VentaDiaria;
    }

    public void setVentaDiaria(double VentaDiaria) {
        this.VentaDiaria = VentaDiaria;
    }

    public double getKmsDiarios() {
        return KmsDiarios;
    }

    public void setKmsDiarios(double KmsDiarios) {
        this.KmsDiarios = KmsDiarios;
    }

    public int getId_area() {
        return id_area;
    }

    public void setId_area(int id_area) {
        this.id_area = id_area;
    }



    
    
}
