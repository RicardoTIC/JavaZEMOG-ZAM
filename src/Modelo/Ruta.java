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
public class Ruta {

    private int id_cliente;
    private float monto_factor_s;
    private float monto_factor_f;
    private float monto_factor_s_MT;
    private float monto_factor_f_MT;
    private int id_ruta;
    private String nombreRuta;
    private int kmRuta;
    private int codigo_ruta;
    private int id_convenio;
    private String ErrorMensaje;
    private int codigoArea;
    private String nombreSucursal;

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public int getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(int codigoArea) {
        this.codigoArea = codigoArea;
    }

    public String getErrorMensaje() {
        return ErrorMensaje;
    }

    public void setErrorMensaje(String ErrorMensaje) {
        this.ErrorMensaje = ErrorMensaje;
    }
    
    
    public int getId_convenio() {
        return id_convenio;
    }

    public void setId_convenio(int id_convenio) {
        this.id_convenio = id_convenio;
    }
    
    
    public Ruta() {
    }

    
    
    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public float getMonto_factor_s() {
        return monto_factor_s;
    }

    public void setMonto_factor_s(float monto_factor_s) {
        this.monto_factor_s = monto_factor_s;
    }

    public float getMonto_factor_f() {
        return monto_factor_f;
    }

    public void setMonto_factor_f(float monto_factor_f) {
        this.monto_factor_f = monto_factor_f;
    }

    public float getMonto_factor_s_MT() {
        return monto_factor_s_MT;
    }

    public void setMonto_factor_s_MT(float monto_factor_s_MT) {
        this.monto_factor_s_MT = monto_factor_s_MT;
    }

    public float getMonto_factor_f_MT() {
        return monto_factor_f_MT;
    }

    public void setMonto_factor_f_MT(float monto_factor_f_MT) {
        this.monto_factor_f_MT = monto_factor_f_MT;
    }

    public int getCodigo_ruta() {
        return codigo_ruta;
    }

    public void setCodigo_ruta(int codigo_ruta) {
        this.codigo_ruta = codigo_ruta;
    }

    public int getId_ruta() {
        return id_ruta;
    }

    public void setId_ruta(int id_ruta) {
        this.id_ruta = id_ruta;
    }

    public String getNombreRuta() {
        return nombreRuta;
    }

    public void setNombreRuta(String nombreRuta) {
        this.nombreRuta = nombreRuta;
    }

    public int getKmRuta() {
        return kmRuta;
    }

    public void setKmRuta(int kmRuta) {
        this.kmRuta = kmRuta;
    }

}
