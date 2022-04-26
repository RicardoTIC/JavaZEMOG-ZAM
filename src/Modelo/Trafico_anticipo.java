package Modelo;


public class Trafico_anticipo {

    private int id_cheque;
    private int no_viaje;
    private int id_area;
    private String nombreCorto;
    private String fecha_anticipo;
    private double monto_anticipo;
    private String status_anticipo;
    private String estatus_letra;
    private String id_ingreso;
    private String observaciones;
    private String nombre;
    private String fecha_pago;
    private String referenci_pago;
    private String fecha_ingreso;
    private String detalles;
    private String ErrorMensaje;

    
    /// Metodo contructor
    public Trafico_anticipo() {
    }
    
    
    

    public String getErrorMensaje() {
        return ErrorMensaje;
    }

    public void setErrorMensaje(String ErrorMensaje) {
        this.ErrorMensaje = ErrorMensaje;
    }
    
    
    public int getId_cheque() {
        return id_cheque;
    }

    public void setId_cheque(int id_cheque) {
        this.id_cheque = id_cheque;
    }

    public int getNo_viaje() {
        return no_viaje;
    }

    public void setNo_viaje(int no_viaje) {
        this.no_viaje = no_viaje;
    }

    public int getId_area() {
        return id_area;
    }

    public void setId_area(int id_area) {
        this.id_area = id_area;
    }

    public String getNombreCorto() {
        return nombreCorto;
    }

    public void setNombreCorto(String nombreCorto) {
        this.nombreCorto = nombreCorto;
    }

    public String getFecha_anticipo() {
        return fecha_anticipo;
    }

    public void setFecha_anticipo(String fecha_anticipo) {
        this.fecha_anticipo = fecha_anticipo;
    }

    public double getMonto_anticipo() {
        return monto_anticipo;
    }

    public void setMonto_anticipo(double monto_anticipo) {
        this.monto_anticipo = monto_anticipo;
    }

    public String getStatus_anticipo() {
        return status_anticipo;
    }

    public void setStatus_anticipo(String status_anticipo) {
        this.status_anticipo = status_anticipo;
    }

    public String getEstatus_letra() {
        return estatus_letra;
    }

    public void setEstatus_letra(String estatus_letra) {
        this.estatus_letra = estatus_letra;
    }

    public String getId_ingreso() {
        return id_ingreso;
    }

    public void setId_ingreso(String id_ingreso) {
        this.id_ingreso = id_ingreso;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(String fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public String getReferenci_pago() {
        return referenci_pago;
    }

    public void setReferenci_pago(String referenci_pago) {
        this.referenci_pago = referenci_pago;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
    
    
    
    
    
}
