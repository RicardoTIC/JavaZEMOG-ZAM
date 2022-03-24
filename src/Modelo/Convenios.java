/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Ricardo Herrera
 */
public class Convenios {
    
    private int id_convenio;
    private String nombreConvenio;
    private String remitente;
    private String destinatario;
    private String origen;
    private String destino;
    private double ventaFullMT;
    private double ventaSencilloMT;
    private double ventaFactorSencillo;
    private double ventaFactorFull;
    private int codigoArea;
    private int codigoRuta;
    private int numeroviaje;
    private String num_guia;

    public String getNum_guia() {
        return num_guia;
    }

    public void setNum_guia(String num_guia) {
        this.num_guia = num_guia;
    }

    public int getNumeroviaje() {
        return numeroviaje;
    }

    public void setNumeroviaje(int numeroviaje) {
        this.numeroviaje = numeroviaje;
    }

    public int getCodigoRuta() {
        return codigoRuta;
    }
    

    public void setCodigoRuta(int codigoRuta) {
        this.codigoRuta = codigoRuta;
    }

    public int getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(int codigoArea) {
        this.codigoArea = codigoArea;
    }

    public int getId_convenio() {
        return id_convenio;
    }

    public void setId_convenio(int id_convenio) {
        this.id_convenio = id_convenio;
    }

    public String getNombreConvenio() {
        return nombreConvenio;
    }

    public void setNombreConvenio(String nombreConvenio) {
        this.nombreConvenio = nombreConvenio;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getVentaFullMT() {
        return ventaFullMT;
    }

    public void setVentaFullMT(double ventaFullMT) {
        this.ventaFullMT = ventaFullMT;
    }

    public double getVentaSencilloMT() {
        return ventaSencilloMT;
    }

    public void setVentaSencilloMT(double ventaSencilloMT) {
        this.ventaSencilloMT = ventaSencilloMT;
    }

    public double getVentaFactorSencillo() {
        return ventaFactorSencillo;
    }

    public void setVentaFactorSencillo(double ventaFactorSencillo) {
        this.ventaFactorSencillo = ventaFactorSencillo;
    }

    public double getVentaFactorFull() {
        return ventaFactorFull;
    }

    public void setVentaFactorFull(double ventaFactorFull) {
        this.ventaFactorFull = ventaFactorFull;
    }


    
}
