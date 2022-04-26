
package Modelo;


public class ConvenioRutas {

    private int id_convenio;
    private String desc_convenio;
    private String id_area;
    private int id_remitente;
    private String Remitente;
    private int id_destinatario;
    private String Destinatario;
    private int id_cliente;
    private String Cliente;
    private int id_origen;
    private String Origen;
    private int id_destino;
    private String Destino;
    private int id_ruta;
    private String desc_ruta;
    private int id_tipo_operacion;
    private String tipo_operacion;
    private String nombreCliente;
    private int kms_manual;
    private int kms_ruta;
    private int monto_factor_s;
    private int monto_factor_f;
    private int monto_factor_s_MT;
    private int monto_factor_f_MT;
    private int id_area_zemog;
    private int tarifa;
    private String ErrorMensaje;
    private String buscardor;

    public String getErrorMensaje() {
        return ErrorMensaje;
    }

    public void setErrorMensaje(String ErrorMensaje) {
        this.ErrorMensaje = ErrorMensaje;
    }

    public String getBuscardor() {
        return buscardor;
    }

    public void setBuscardor(String buscardor) {
        this.buscardor = buscardor;
    }
    
    
    //Constructor
    public ConvenioRutas() {
    }
    
    
    
    
    public int getId_convenio() {
        return id_convenio;
    }

    public void setId_convenio(int id_convenio) {
        this.id_convenio = id_convenio;
    }

    public String getDesc_convenio() {
        return desc_convenio;
    }

    public void setDesc_convenio(String desc_convenio) {
        this.desc_convenio = desc_convenio;
    }

    public String getId_area() {
        return id_area;
    }

    public void setId_area(String id_area) {
        this.id_area = id_area;
    }

    public int getId_remitente() {
        return id_remitente;
    }

    public void setId_remitente(int id_remitente) {
        this.id_remitente = id_remitente;
    }

    public String getRemitente() {
        return Remitente;
    }

    public void setRemitente(String Remitente) {
        this.Remitente = Remitente;
    }

    public int getId_destinatario() {
        return id_destinatario;
    }

    public void setId_destinatario(int id_destinatario) {
        this.id_destinatario = id_destinatario;
    }

    public String getDestinatario() {
        return Destinatario;
    }

    public void setDestinatario(String Destinatario) {
        this.Destinatario = Destinatario;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public int getId_origen() {
        return id_origen;
    }

    public void setId_origen(int id_origen) {
        this.id_origen = id_origen;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    public int getId_destino() {
        return id_destino;
    }

    public void setId_destino(int id_destino) {
        this.id_destino = id_destino;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public int getId_ruta() {
        return id_ruta;
    }

    public void setId_ruta(int id_ruta) {
        this.id_ruta = id_ruta;
    }

    public String getDesc_ruta() {
        return desc_ruta;
    }

    public void setDesc_ruta(String desc_ruta) {
        this.desc_ruta = desc_ruta;
    }

    public int getId_tipo_operacion() {
        return id_tipo_operacion;
    }

    public void setId_tipo_operacion(int id_tipo_operacion) {
        this.id_tipo_operacion = id_tipo_operacion;
    }

    public String getTipo_operacion() {
        return tipo_operacion;
    }

    public void setTipo_operacion(String tipo_operacion) {
        this.tipo_operacion = tipo_operacion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getKms_manual() {
        return kms_manual;
    }

    public void setKms_manual(int kms_manual) {
        this.kms_manual = kms_manual;
    }

    public int getKms_ruta() {
        return kms_ruta;
    }

    public void setKms_ruta(int kms_ruta) {
        this.kms_ruta = kms_ruta;
    }

    public int getMonto_factor_s() {
        return monto_factor_s;
    }

    public void setMonto_factor_s(int monto_factor_s) {
        this.monto_factor_s = monto_factor_s;
    }

    public int getMonto_factor_f() {
        return monto_factor_f;
    }

    public void setMonto_factor_f(int monto_factor_f) {
        this.monto_factor_f = monto_factor_f;
    }

    public int getMonto_factor_s_MT() {
        return monto_factor_s_MT;
    }

    public void setMonto_factor_s_MT(int monto_factor_s_MT) {
        this.monto_factor_s_MT = monto_factor_s_MT;
    }

    public int getMonto_factor_f_MT() {
        return monto_factor_f_MT;
    }

    public void setMonto_factor_f_MT(int monto_factor_f_MT) {
        this.monto_factor_f_MT = monto_factor_f_MT;
    }

    public int getId_area_zemog() {
        return id_area_zemog;
    }

    public void setId_area_zemog(int id_area_zemog) {
        this.id_area_zemog = id_area_zemog;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }
    
    
    

}
