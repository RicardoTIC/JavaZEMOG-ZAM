
package Modelo;

public class Operador {
    
    private int id_operador;
    private int no_viaje;
    private int codigo_area;
    private String nombreOperador;
    private String estado;
    private String estatus;

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
    
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombreOperador() {
        return nombreOperador;
    }

    public void setNombreOperador(String nombreOperador) {
        this.nombreOperador = nombreOperador;
    }

    public Operador() {
    }

    public int getId_operador() {
        return id_operador;
    }

    public void setId_operador(int id_operador) {
        this.id_operador = id_operador;
    }

    public int getNo_viaje() {
        return no_viaje;
    }

    public void setNo_viaje(int no_viaje) {
        this.no_viaje = no_viaje;
    }

    public int getCodigo_area() {
        return codigo_area;
    }

    public void setCodigo_area(int codigo_area) {
        this.codigo_area = codigo_area;
    }
    
    
    
    
    
}
