/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ricardo Herrera
 */
public abstract class crud<T> {
    
    
    public abstract DefaultTableModel showdata(String buscar);

    public abstract boolean insert(T obj);

    public abstract boolean delete(T obj);

    public abstract boolean update(T Obj);
    
    public abstract DefaultListModel showListData(String buscar);
    
    public abstract DefaultTableModel showdataFordate(String fechaInicio , String fechafinal);
    public abstract DefaultTableModel resumenIndicador(String fechaInicio, String fechafinal);
    public abstract DefaultTableModel showdataFordate(String fechaInicio, String fechafinal, String buscar);

    
}
