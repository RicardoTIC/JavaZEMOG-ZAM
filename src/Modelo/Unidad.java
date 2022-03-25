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
public class Unidad {
    
    private String id_unidad;
    private int numeroViaje;
    private int codigoArea;
    private String id_remolque1;
    private String id_remolque2;
    private String id_dolly;
    
    

    public Unidad() {
    }

    public String getId_remolque1() {
        return id_remolque1;
    }

    public void setId_remolque1(String id_remolque1) {
        this.id_remolque1 = id_remolque1;
    }

    public String getId_remolque2() {
        return id_remolque2;
    }

    public void setId_remolque2(String id_remolque2) {
        this.id_remolque2 = id_remolque2;
    }

    public String getId_dolly() {
        return id_dolly;
    }

    public void setId_dolly(String id_dolly) {
        this.id_dolly = id_dolly;
    }
    
    

    public String getId_unidad() {
        return id_unidad;
    }

    public void setId_unidad(String id_unidad) {
        this.id_unidad = id_unidad;
    }

    public int getNumeroViaje() {
        return numeroViaje;
    }

    public void setNumeroViaje(int numeroViaje) {
        this.numeroViaje = numeroViaje;
    }

    public int getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(int codigoArea) {
        this.codigoArea = codigoArea;
    }
    
    
    
    
}
