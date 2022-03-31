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
public class ListaProductos {

    private String nombre_corto;
    private int id_unidad_medida;
    private int id_area;
    private int no_guia;
    private int consecutivo;
    private int id_producto;
    private int id_fraccion;
    private int cantidad;
    private int embalaje;
    private String desc_embalaje;
    private String descripcion_producto;
    private Double peso;
    private Double volumen_m3;
    private Double vol3;
    private int peso_estimado;
    private int importe;
    private int importe_reparto;
    private int volumen_20;
    private int volumen_natural;
    private int volumen_carga;
    private int volumen_descarga;
    private int precio_pemex;
    private int temperatura;
    private int peso_especifico;
    private int temperatura_carga;
    private int temperatura_descarga;
    private int peso_bruto;
    private int peso_tara;
    private String clave_producto;
    private int sku;
    private int unidad_medida;
    private int linea;
    private int clase;
    private int subclase;
    private int num_correlativo_cte;
    private int volumen_20_descarga;
    private int origen;
    private int destino;
    private int num_piezas;
    private String cve_unidad;
    private String unidad;
    private String unidad_peso;
    private int peso_neto;
    private Double kgs;
    private int cve_producto;
    private int dimensiones;
    private int valor_merc;
    private int moneda;
    private String mat_pelig;
    private String cve_mat_pelig;
    private String cve_embalaje;
    private String fraccion_arancelaria;
    private String uuid_comercio_exterior;
    private int ubicacion;

    ///constructor

    public ListaProductos() {
    }
    
    
    //Metodos accesores
    
    public String getNombre_corto() {
        return nombre_corto;
    }

    public void setNombre_corto(String nombre_corto) {
        this.nombre_corto = nombre_corto;
    }

    public int getId_unidad_medida() {
        return id_unidad_medida;
    }

    public void setId_unidad_medida(int id_unidad_medida) {
        this.id_unidad_medida = id_unidad_medida;
    }

    public int getId_area() {
        return id_area;
    }

    public void setId_area(int id_area) {
        this.id_area = id_area;
    }

    public int getNo_guia() {
        return no_guia;
    }

    public void setNo_guia(int no_guia) {
        this.no_guia = no_guia;
    }

    public int getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_fraccion() {
        return id_fraccion;
    }

    public void setId_fraccion(int id_fraccion) {
        this.id_fraccion = id_fraccion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getEmbalaje() {
        return embalaje;
    }

    public void setEmbalaje(int embalaje) {
        this.embalaje = embalaje;
    }

    public String getDesc_embalaje() {
        return desc_embalaje;
    }

    public void setDesc_embalaje(String desc_embalaje) {
        this.desc_embalaje = desc_embalaje;
    }

    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getVolumen_m3() {
        return volumen_m3;
    }

    public void setVolumen_m3(Double volumen_m3) {
        this.volumen_m3 = volumen_m3;
    }

    public Double getVol3() {
        return vol3;
    }

    public void setVol3(Double vol3) {
        this.vol3 = vol3;
    }

    public int getPeso_estimado() {
        return peso_estimado;
    }

    public void setPeso_estimado(int peso_estimado) {
        this.peso_estimado = peso_estimado;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public int getImporte_reparto() {
        return importe_reparto;
    }

    public void setImporte_reparto(int importe_reparto) {
        this.importe_reparto = importe_reparto;
    }

    public int getVolumen_20() {
        return volumen_20;
    }

    public void setVolumen_20(int volumen_20) {
        this.volumen_20 = volumen_20;
    }

    public int getVolumen_natural() {
        return volumen_natural;
    }

    public void setVolumen_natural(int volumen_natural) {
        this.volumen_natural = volumen_natural;
    }

    public int getVolumen_carga() {
        return volumen_carga;
    }

    public void setVolumen_carga(int volumen_carga) {
        this.volumen_carga = volumen_carga;
    }

    public int getVolumen_descarga() {
        return volumen_descarga;
    }

    public void setVolumen_descarga(int volumen_descarga) {
        this.volumen_descarga = volumen_descarga;
    }

    public int getPrecio_pemex() {
        return precio_pemex;
    }

    public void setPrecio_pemex(int precio_pemex) {
        this.precio_pemex = precio_pemex;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getPeso_especifico() {
        return peso_especifico;
    }

    public void setPeso_especifico(int peso_especifico) {
        this.peso_especifico = peso_especifico;
    }

    public int getTemperatura_carga() {
        return temperatura_carga;
    }

    public void setTemperatura_carga(int temperatura_carga) {
        this.temperatura_carga = temperatura_carga;
    }

    public int getTemperatura_descarga() {
        return temperatura_descarga;
    }

    public void setTemperatura_descarga(int temperatura_descarga) {
        this.temperatura_descarga = temperatura_descarga;
    }

    public int getPeso_bruto() {
        return peso_bruto;
    }

    public void setPeso_bruto(int peso_bruto) {
        this.peso_bruto = peso_bruto;
    }

    public int getPeso_tara() {
        return peso_tara;
    }

    public void setPeso_tara(int peso_tara) {
        this.peso_tara = peso_tara;
    }

    public String getClave_producto() {
        return clave_producto;
    }

    public void setClave_producto(String clave_producto) {
        this.clave_producto = clave_producto;
    }

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public int getUnidad_medida() {
        return unidad_medida;
    }

    public void setUnidad_medida(int unidad_medida) {
        this.unidad_medida = unidad_medida;
    }

    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public int getClase() {
        return clase;
    }

    public void setClase(int clase) {
        this.clase = clase;
    }

    public int getSubclase() {
        return subclase;
    }

    public void setSubclase(int subclase) {
        this.subclase = subclase;
    }

    public int getNum_correlativo_cte() {
        return num_correlativo_cte;
    }

    public void setNum_correlativo_cte(int num_correlativo_cte) {
        this.num_correlativo_cte = num_correlativo_cte;
    }

    public int getVolumen_20_descarga() {
        return volumen_20_descarga;
    }

    public void setVolumen_20_descarga(int volumen_20_descarga) {
        this.volumen_20_descarga = volumen_20_descarga;
    }

    public int getOrigen() {
        return origen;
    }

    public void setOrigen(int origen) {
        this.origen = origen;
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }

    public int getNum_piezas() {
        return num_piezas;
    }

    public void setNum_piezas(int num_piezas) {
        this.num_piezas = num_piezas;
    }

    public String getCve_unidad() {
        return cve_unidad;
    }

    public void setCve_unidad(String cve_unidad) {
        this.cve_unidad = cve_unidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getUnidad_peso() {
        return unidad_peso;
    }

    public void setUnidad_peso(String unidad_peso) {
        this.unidad_peso = unidad_peso;
    }

    public int getPeso_neto() {
        return peso_neto;
    }

    public void setPeso_neto(int peso_neto) {
        this.peso_neto = peso_neto;
    }

    public Double getKgs() {
        return kgs;
    }

    public void setKgs(Double kgs) {
        this.kgs = kgs;
    }

    public int getCve_producto() {
        return cve_producto;
    }

    public void setCve_producto(int cve_producto) {
        this.cve_producto = cve_producto;
    }

    public int getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(int dimensiones) {
        this.dimensiones = dimensiones;
    }

    public int getValor_merc() {
        return valor_merc;
    }

    public void setValor_merc(int valor_merc) {
        this.valor_merc = valor_merc;
    }

    public int getMoneda() {
        return moneda;
    }

    public void setMoneda(int moneda) {
        this.moneda = moneda;
    }

    public String getMat_pelig() {
        return mat_pelig;
    }

    public void setMat_pelig(String mat_pelig) {
        this.mat_pelig = mat_pelig;
    }

    public String getCve_mat_pelig() {
        return cve_mat_pelig;
    }

    public void setCve_mat_pelig(String cve_mat_pelig) {
        this.cve_mat_pelig = cve_mat_pelig;
    }

    public String getCve_embalaje() {
        return cve_embalaje;
    }

    public void setCve_embalaje(String cve_embalaje) {
        this.cve_embalaje = cve_embalaje;
    }

    public String getFraccion_arancelaria() {
        return fraccion_arancelaria;
    }

    public void setFraccion_arancelaria(String fraccion_arancelaria) {
        this.fraccion_arancelaria = fraccion_arancelaria;
    }

    public String getUuid_comercio_exterior() {
        return uuid_comercio_exterior;
    }

    public void setUuid_comercio_exterior(String uuid_comercio_exterior) {
        this.uuid_comercio_exterior = uuid_comercio_exterior;
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }


}
