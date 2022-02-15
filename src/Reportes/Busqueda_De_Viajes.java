/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

import Logica.fViajes;

/**
 *
 * @author Ricardo Herrera
 */
public class Busqueda_De_Viajes extends Thread {

    ///sobre escrivimos el metodo run()
    fViajes func = new fViajes();

    private String fechainiciales;
    private String fechafinales;
    private String buscar;

    @Override
    public void run() {
        func.showdataFordate(fechainiciales, fechafinales, buscar);
    }

}
