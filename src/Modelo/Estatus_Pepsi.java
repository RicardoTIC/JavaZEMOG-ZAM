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
public class Estatus_Pepsi {
    private int id_estatus_pepsi;
    private String nombreEstatus;

    public Estatus_Pepsi() {
    }

    public int getId_estatus_pepsi() {
        return id_estatus_pepsi;
    }

    public void setId_estatus_pepsi(int id_estatus_pepsi) {
        this.id_estatus_pepsi = id_estatus_pepsi;
    }

    public String getNombreEstatus() {
        return nombreEstatus;
    }

    public void setNombreEstatus(String nombreEstatus) {
        this.nombreEstatus = nombreEstatus;
    }

    @Override
    public String toString() {
        return this.nombreEstatus;
    }
    
    
    
}
