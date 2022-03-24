package Modelo;

import java.util.Date;



public class Carta_de_Cobro {
    
    private int id_area;
    private String no_guia;
    private String factura;
    private String fecha_guia;
    private Double flete;
    private String remision;
    private String cartaCobro;
    private Date fecha_vencimiento;

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }



    public Carta_de_Cobro() {
    }

    public int getId_area() {
        return id_area;
    }

    public void setId_area(int id_area) {
        this.id_area = id_area;
    }

    public String getNo_guia() {
        return no_guia;
    }

    public void setNo_guia(String no_guia) {
        this.no_guia = no_guia;
    }



    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public String getFecha_guia() {
        return fecha_guia;
    }

    public void setFecha_guia(String fecha_guia) {
        this.fecha_guia = fecha_guia;
    }

    public Double getFlete() {
        return flete;
    }

    public void setFlete(Double flete) {
        this.flete = flete;
    }

    public String getRemision() {
        return remision;
    }

    public void setRemision(String remision) {
        this.remision = remision;
    }

    public String getCartaCobro() {
        return cartaCobro;
    }

    public void setCartaCobro(String cartaCobro) {
        this.cartaCobro = cartaCobro;
    }
    
    
}
