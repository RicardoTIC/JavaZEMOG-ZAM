/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;



public class ConcentradoDetalleUnidades {
    
    
    private int id;
    private int id_area;
    private String fecha_unidades;
    private Date fecha_final;
    private int numeroUnidades;
    private String mensajeError;
    private int numeroUnidadesBackup;
    private int numeroUnidadesDetenidasPorEstrategia;

    public int getNumeroUnidadesBackup() {
        return numeroUnidadesBackup;
    }

    public void setNumeroUnidadesBackup(int numeroUnidadesBackup) {
        this.numeroUnidadesBackup = numeroUnidadesBackup;
    }

    public int getNumeroUnidadesDetenidasPorEstrategia() {
        return numeroUnidadesDetenidasPorEstrategia;
    }

    public void setNumeroUnidadesDetenidasPorEstrategia(int numeroUnidadesDetenidasPorEstrategia) {
        this.numeroUnidadesDetenidasPorEstrategia = numeroUnidadesDetenidasPorEstrategia;
    }
    

    public Date getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(Date fecha_final) {
        this.fecha_final = fecha_final;
    }

    
    
    public ConcentradoDetalleUnidades() {
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

    public String getFecha_unidades() {
        return fecha_unidades;
    }

    public void setFecha_unidades(String fecha_unidades) {
        this.fecha_unidades = fecha_unidades;
    }

    public int getNumeroUnidades() {
        return numeroUnidades;
    }

    public void setNumeroUnidades(int numeroUnidades) {
        this.numeroUnidades = numeroUnidades;
    }

    public String getMensajeError() {
        return mensajeError;
    }

    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }
    
    
    
    
    
}
