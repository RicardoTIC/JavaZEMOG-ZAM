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
public class EstatusUnidad {
    private int id_estatus;
    private String nombre_Estatus;

    public EstatusUnidad() {
    }

    public int getId_estatus() {
        return id_estatus;
    }

    public void setId_estatus(int id_estatus) {
        this.id_estatus = id_estatus;
    }

    public String getNombre_Estatus() {
        return nombre_Estatus;
    }

    public void setNombre_Estatus(String nombre_Estatus) {
        this.nombre_Estatus = nombre_Estatus;
    }
    @Override
    public String toString(){
       return this.nombre_Estatus;
    }
    
    
}
