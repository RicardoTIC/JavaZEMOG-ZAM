/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author Ricardo Herrera
 */
public class PowerZamUnidades {

    private int id_area;

    private String id_unidad;
    private String f_inicial;
    private String f_fin;
    private String tipocuota;
    private int ind_titular;
    private int ind_ingresoxflete;
    private int ind_ingresoventafija;
    private float montorentafija;
    private int id_razon_detenida;
    private int id_estatus;
    private int id_estatus_pepsi;
    
    //constructor
    public PowerZamUnidades() {
    }

    public String getF_inicial() {
        return f_inicial;
    }

    public void setF_inicial(String f_inicial) {
        this.f_inicial = f_inicial;
    }

    
    
    public String getF_fin() {
        return f_fin;
    }

    public void setF_fin(String f_fin) {
        this.f_fin = f_fin;
    }



    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    private String comentarios;

    public String getId_unidad() {
        return id_unidad;
    }

    public void setId_unidad(String id_unidad) {
        this.id_unidad = id_unidad;
    }

    public int getInd_ingresoxflete() {
        return ind_ingresoxflete;
    }

    public void setInd_ingresoxflete(int ind_ingresoxflete) {
        this.ind_ingresoxflete = ind_ingresoxflete;
    }


    public int getId_area() {
        return id_area;
    }

    public void setId_area(int id_area) {
        this.id_area = id_area;
    }

    public String getTipocuota() {
        return tipocuota;
    }

    public void setTipocuota(String tipocuota) {
        this.tipocuota = tipocuota;
    }

    public int getInd_titular() {
        return ind_titular;
    }

    public void setInd_titular(int ind_titular) {
        this.ind_titular = ind_titular;
    }

    public int getInd_ingresoventafija() {
        return ind_ingresoventafija;
    }

    public void setInd_ingresoventafija(int ind_ingresoventafija) {
        this.ind_ingresoventafija = ind_ingresoventafija;
    }

    public float getMontorentafija() {
        return montorentafija;
    }

    public void setMontorentafija(float montorentafija) {
        this.montorentafija = montorentafija;
    }

    public int getId_razon_detenida() {
        return id_razon_detenida;
    }

    public void setId_razon_detenida(int id_razon_detenida) {
        this.id_razon_detenida = id_razon_detenida;
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

}
