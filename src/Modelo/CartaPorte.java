package Modelo;

public class CartaPorte {

    private int id_area;
    private int no_guia;
    private String num_guia;
    private String tipo_pago;
    private String status_guia;
    private String tipo_cobro;
    private int clasificacion_doc;
    private String fecha_guia;
    private String fecha_confirmacion;
    private String fecha_pago;
    private int id_area_guia;
    private int id_pedido;
    private int id_pedidopk;
    private int num_pedido;
    private String thermotempmax;
    private String fecha_ingreso;
    private String fecha_modifico;
    private Double valor_unitario;
    private Double convenido_tonelada;
    private Double conv_operador;
    private Double conv_permisionario;
    private int id_area_facturacion;
    private String telefono_cliente;
    private String contacto1_cliente;
    private int id_cliente;
    private String nombre_cliente;
    private int id_iva;
    private float factor_iva;
    private String num_guiacancel;
    private int id_personal;
    private int no_viaje;
    private int id_remitente;
    private String nombre_remitente;
    private String domicilio_remitente;
    private String rfc_remitente;
    private int id_destinatario;
    private String nombre_destinatario;
    private String domicilio_destinatario;
    private String rfc_destinatario;
    private int id_condujo;
    private int id_operador2;
    private float kms_guia;
    private Double flete;
    private Double seguro;
    private Double maniobras;
    private Double autopistas;
    private Double otros;
    private Double CPAC;
    private Double cruces;
    private Double subtotal;
    private Double iva_guia;
    private Double cobro_viaje_kms;
    private float monto_tipo_cambio;
    private int tipo_doc;
    private int id_origen;
    private String desc_origen;
    private int id_destino;
    private String desc_destino;
    private int id_fraccion;
    private int plaza_emision;
    private String desc_plazaemision;
    private int conducir_de;
    private String desc_conducir_de;
    private int conducir_a;
    private String desc_conducir_a;
    private int id_tipo_moneda;
    private String no_carta;
    private String fecha_cancelacion;
    private int id_remolque1;
    private String fecha_contabilizado;
    private int id_unidad;
    private String recoger_en;
    private String entregar_en;
    private int valor_declarado;
    private String observaciones_guia;
    private String no_remision;
    private String motivo_cancelacion;
    private String obs_cobranza;
    private int id_remolque2;
    private String prestamo;
    private String num_guia_asignado;
    private String no_deposito;
    private String id_ingreso;
    private String id_modifico;
    private String unidadplaca;
    private String unidadtipo;
    private String rem1placa;
    private String rem1tipo;
    private String rem2placa;
    private String rem2tipo;
    private String personalnombre;
    private String tipo_facturacion;

    private String no_transferencia_cobranza;
    private Double monto_ncredito;
    private Double monto_ncargo;
    private Double monto_pago;
    private int cant_movguia;
    private int id_serieguia;
    private String desc_plazaserie;
    private String num_serie;
    private int id_serieguia2;
    private Double monto_ivancredito;
    private Double monto_ivancargo;
    private Double monto_comisiontercero;
    private int id_linearem1;
    private int id_pago;
    private int tipo_origen;
    private int no_poliza;
    private Double monto_retencion;
    private String status_pago;
    private Double monto_retenciontercero;
    private String control_pago;
    private String sustituye_documento;
    private int id_linearem2;
    private int id_tercero;
    private String tipo_movimiento;
    private String tipo_viaje;
    private float monto_ivaflete;
    private int tipocambioconvenio;
    private Double desc_flete;
    private Double flete_bruto;
 
    private int id_retencion;
    private float factor_retencion;
    private String desc_retencion;
    private int id_convenio;
    private int id_areaconvenio;
    private String tipo_serv;
    private String vale_carga;
    private int id_vendedor;
    private int id_tipo_operacion;
    private int id_seguro;
    private String desc_tiposerv;
    private String desc_tipooperacion;
    private String no_kit;
    private Double campo1;
    private Double campo2;
    private Double campo3;
    private Double campo4;
    private Double campo5;
    private Double campo6;
    private Double campo7;
    private Double campo8;
    private Double campo9;
    private int codigo;
    private int medida;
    private int tipo_cpac;
    private int kms_cpac;
    private Double factor_cpac;
    private int id_contrato;
    private int numero_contrato;
    private int id_factura;
    private int tipo_facturacion_serie;
    private int id_compania;
    private String nombre_corto_compania;
    private String nombre_compania;
    private String pedimento;
    private int tipo_cobro_op;
    private int cobro_viaje_op;
    private int contacto1_remitente;
    private String telefono_remitente;
    private String contacto1_destinatario;
    private String telefono_destinatario;
    private String domicilio_cliente;
    private String rfc_cliente;
    private String cfdi_relacionado;

    public String getNo_transferencia_cobranza() {
        return no_transferencia_cobranza;
    }

    public void setNo_transferencia_cobranza(String no_transferencia_cobranza) {
        this.no_transferencia_cobranza = no_transferencia_cobranza;
    }

    public Double getMonto_ncredito() {
        return monto_ncredito;
    }

    public void setMonto_ncredito(Double monto_ncredito) {
        this.monto_ncredito = monto_ncredito;
    }

    public Double getMonto_ncargo() {
        return monto_ncargo;
    }

    public void setMonto_ncargo(Double monto_ncargo) {
        this.monto_ncargo = monto_ncargo;
    }

    public Double getMonto_pago() {
        return monto_pago;
    }

    public void setMonto_pago(Double monto_pago) {
        this.monto_pago = monto_pago;
    }

    public int getCant_movguia() {
        return cant_movguia;
    }

    public void setCant_movguia(int cant_movguia) {
        this.cant_movguia = cant_movguia;
    }

    public int getId_serieguia() {
        return id_serieguia;
    }

    public void setId_serieguia(int id_serieguia) {
        this.id_serieguia = id_serieguia;
    }

    public String getDesc_plazaserie() {
        return desc_plazaserie;
    }

    public void setDesc_plazaserie(String desc_plazaserie) {
        this.desc_plazaserie = desc_plazaserie;
    }

    public String getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(String num_serie) {
        this.num_serie = num_serie;
    }

    public int getId_serieguia2() {
        return id_serieguia2;
    }

    public void setId_serieguia2(int id_serieguia2) {
        this.id_serieguia2 = id_serieguia2;
    }

    public Double getMonto_ivancredito() {
        return monto_ivancredito;
    }

    public void setMonto_ivancredito(Double monto_ivancredito) {
        this.monto_ivancredito = monto_ivancredito;
    }

    public Double getMonto_ivancargo() {
        return monto_ivancargo;
    }

    public void setMonto_ivancargo(Double monto_ivancargo) {
        this.monto_ivancargo = monto_ivancargo;
    }

    public Double getMonto_comisiontercero() {
        return monto_comisiontercero;
    }

    public void setMonto_comisiontercero(Double monto_comisiontercero) {
        this.monto_comisiontercero = monto_comisiontercero;
    }

    public int getId_linearem1() {
        return id_linearem1;
    }

    public void setId_linearem1(int id_linearem1) {
        this.id_linearem1 = id_linearem1;
    }

    public int getId_pago() {
        return id_pago;
    }

    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
    }

    public int getTipo_origen() {
        return tipo_origen;
    }

    public void setTipo_origen(int tipo_origen) {
        this.tipo_origen = tipo_origen;
    }

    public int getNo_poliza() {
        return no_poliza;
    }

    public void setNo_poliza(int no_poliza) {
        this.no_poliza = no_poliza;
    }

    public Double getMonto_retencion() {
        return monto_retencion;
    }

    public void setMonto_retencion(Double monto_retencion) {
        this.monto_retencion = monto_retencion;
    }

    public String getStatus_pago() {
        return status_pago;
    }

    public void setStatus_pago(String status_pago) {
        this.status_pago = status_pago;
    }

    public Double getMonto_retenciontercero() {
        return monto_retenciontercero;
    }

    public void setMonto_retenciontercero(Double monto_retenciontercero) {
        this.monto_retenciontercero = monto_retenciontercero;
    }

    public String getControl_pago() {
        return control_pago;
    }

    public void setControl_pago(String control_pago) {
        this.control_pago = control_pago;
    }

    public String getSustituye_documento() {
        return sustituye_documento;
    }

    public void setSustituye_documento(String sustituye_documento) {
        this.sustituye_documento = sustituye_documento;
    }

    public int getId_linearem2() {
        return id_linearem2;
    }

    public void setId_linearem2(int id_linearem2) {
        this.id_linearem2 = id_linearem2;
    }

    public int getId_tercero() {
        return id_tercero;
    }

    public void setId_tercero(int id_tercero) {
        this.id_tercero = id_tercero;
    }

    public String getTipo_movimiento() {
        return tipo_movimiento;
    }

    public void setTipo_movimiento(String tipo_movimiento) {
        this.tipo_movimiento = tipo_movimiento;
    }

    public String getTipo_viaje() {
        return tipo_viaje;
    }

    public void setTipo_viaje(String tipo_viaje) {
        this.tipo_viaje = tipo_viaje;
    }

    public float getMonto_ivaflete() {
        return monto_ivaflete;
    }

    public void setMonto_ivaflete(float monto_ivaflete) {
        this.monto_ivaflete = monto_ivaflete;
    }

    public int getTipocambioconvenio() {
        return tipocambioconvenio;
    }

    public void setTipocambioconvenio(int tipocambioconvenio) {
        this.tipocambioconvenio = tipocambioconvenio;
    }

    public Double getDesc_flete() {
        return desc_flete;
    }

    public void setDesc_flete(Double desc_flete) {
        this.desc_flete = desc_flete;
    }

    public Double getFlete_bruto() {
        return flete_bruto;
    }

    public void setFlete_bruto(Double flete_bruto) {
        this.flete_bruto = flete_bruto;
    }

    public int getId_retencion() {
        return id_retencion;
    }

    public void setId_retencion(int id_retencion) {
        this.id_retencion = id_retencion;
    }

    public float getFactor_retencion() {
        return factor_retencion;
    }

    public void setFactor_retencion(float factor_retencion) {
        this.factor_retencion = factor_retencion;
    }

    public String getDesc_retencion() {
        return desc_retencion;
    }

    public void setDesc_retencion(String desc_retencion) {
        this.desc_retencion = desc_retencion;
    }

    public int getId_convenio() {
        return id_convenio;
    }

    public void setId_convenio(int id_convenio) {
        this.id_convenio = id_convenio;
    }

    public int getId_areaconvenio() {
        return id_areaconvenio;
    }

    public void setId_areaconvenio(int id_areaconvenio) {
        this.id_areaconvenio = id_areaconvenio;
    }

    public String getTipo_serv() {
        return tipo_serv;
    }

    public void setTipo_serv(String tipo_serv) {
        this.tipo_serv = tipo_serv;
    }

    public String getVale_carga() {
        return vale_carga;
    }

    public void setVale_carga(String vale_carga) {
        this.vale_carga = vale_carga;
    }

    public int getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public int getId_tipo_operacion() {
        return id_tipo_operacion;
    }

    public void setId_tipo_operacion(int id_tipo_operacion) {
        this.id_tipo_operacion = id_tipo_operacion;
    }

    public int getId_seguro() {
        return id_seguro;
    }

    public void setId_seguro(int id_seguro) {
        this.id_seguro = id_seguro;
    }

    public String getDesc_tiposerv() {
        return desc_tiposerv;
    }

    public void setDesc_tiposerv(String desc_tiposerv) {
        this.desc_tiposerv = desc_tiposerv;
    }

    public String getDesc_tipooperacion() {
        return desc_tipooperacion;
    }

    public void setDesc_tipooperacion(String desc_tipooperacion) {
        this.desc_tipooperacion = desc_tipooperacion;
    }

    public String getNo_kit() {
        return no_kit;
    }

    public void setNo_kit(String no_kit) {
        this.no_kit = no_kit;
    }

    public Double getCampo1() {
        return campo1;
    }

    public void setCampo1(Double campo1) {
        this.campo1 = campo1;
    }

    public Double getCampo2() {
        return campo2;
    }

    public void setCampo2(Double campo2) {
        this.campo2 = campo2;
    }

    public Double getCampo3() {
        return campo3;
    }

    public void setCampo3(Double campo3) {
        this.campo3 = campo3;
    }

    public Double getCampo4() {
        return campo4;
    }

    public void setCampo4(Double campo4) {
        this.campo4 = campo4;
    }

    public Double getCampo5() {
        return campo5;
    }

    public void setCampo5(Double campo5) {
        this.campo5 = campo5;
    }

    public Double getCampo6() {
        return campo6;
    }

    public void setCampo6(Double campo6) {
        this.campo6 = campo6;
    }

    public Double getCampo7() {
        return campo7;
    }

    public void setCampo7(Double campo7) {
        this.campo7 = campo7;
    }

    public Double getCampo8() {
        return campo8;
    }

    public void setCampo8(Double campo8) {
        this.campo8 = campo8;
    }

    public Double getCampo9() {
        return campo9;
    }

    public void setCampo9(Double campo9) {
        this.campo9 = campo9;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getMedida() {
        return medida;
    }

    public void setMedida(int medida) {
        this.medida = medida;
    }

    public int getTipo_cpac() {
        return tipo_cpac;
    }

    public void setTipo_cpac(int tipo_cpac) {
        this.tipo_cpac = tipo_cpac;
    }

    public int getKms_cpac() {
        return kms_cpac;
    }

    public void setKms_cpac(int kms_cpac) {
        this.kms_cpac = kms_cpac;
    }

    public Double getFactor_cpac() {
        return factor_cpac;
    }

    public void setFactor_cpac(Double factor_cpac) {
        this.factor_cpac = factor_cpac;
    }

    public int getId_contrato() {
        return id_contrato;
    }

    public void setId_contrato(int id_contrato) {
        this.id_contrato = id_contrato;
    }

    public int getNumero_contrato() {
        return numero_contrato;
    }

    public void setNumero_contrato(int numero_contrato) {
        this.numero_contrato = numero_contrato;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getTipo_facturacion_serie() {
        return tipo_facturacion_serie;
    }

    public void setTipo_facturacion_serie(int tipo_facturacion_serie) {
        this.tipo_facturacion_serie = tipo_facturacion_serie;
    }

    public int getId_compania() {
        return id_compania;
    }

    public void setId_compania(int id_compania) {
        this.id_compania = id_compania;
    }

    public String getNombre_corto_compania() {
        return nombre_corto_compania;
    }

    public void setNombre_corto_compania(String nombre_corto_compania) {
        this.nombre_corto_compania = nombre_corto_compania;
    }

    public String getNombre_compania() {
        return nombre_compania;
    }

    public void setNombre_compania(String nombre_compania) {
        this.nombre_compania = nombre_compania;
    }

    public String getPedimento() {
        return pedimento;
    }

    public void setPedimento(String pedimento) {
        this.pedimento = pedimento;
    }

    public int getTipo_cobro_op() {
        return tipo_cobro_op;
    }

    public void setTipo_cobro_op(int tipo_cobro_op) {
        this.tipo_cobro_op = tipo_cobro_op;
    }

    public int getCobro_viaje_op() {
        return cobro_viaje_op;
    }

    public void setCobro_viaje_op(int cobro_viaje_op) {
        this.cobro_viaje_op = cobro_viaje_op;
    }

    public int getContacto1_remitente() {
        return contacto1_remitente;
    }

    public void setContacto1_remitente(int contacto1_remitente) {
        this.contacto1_remitente = contacto1_remitente;
    }

    public String getTelefono_remitente() {
        return telefono_remitente;
    }

    public void setTelefono_remitente(String telefono_remitente) {
        this.telefono_remitente = telefono_remitente;
    }

    public String getContacto1_destinatario() {
        return contacto1_destinatario;
    }

    public void setContacto1_destinatario(String contacto1_destinatario) {
        this.contacto1_destinatario = contacto1_destinatario;
    }

    public String getTelefono_destinatario() {
        return telefono_destinatario;
    }

    public void setTelefono_destinatario(String telefono_destinatario) {
        this.telefono_destinatario = telefono_destinatario;
    }

    public String getDomicilio_cliente() {
        return domicilio_cliente;
    }

    public void setDomicilio_cliente(String domicilio_cliente) {
        this.domicilio_cliente = domicilio_cliente;
    }

    public String getRfc_cliente() {
        return rfc_cliente;
    }

    public void setRfc_cliente(String rfc_cliente) {
        this.rfc_cliente = rfc_cliente;
    }

    public String getCfdi_relacionado() {
        return cfdi_relacionado;
    }

    public void setCfdi_relacionado(String cfdi_relacionado) {
        this.cfdi_relacionado = cfdi_relacionado;
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

    public String getNum_guia() {
        return num_guia;
    }

    public void setNum_guia(String num_guia) {
        this.num_guia = num_guia;
    }

    public String getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(String tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    public String getStatus_guia() {
        return status_guia;
    }

    public void setStatus_guia(String status_guia) {
        this.status_guia = status_guia;
    }

    public String getTipo_cobro() {
        return tipo_cobro;
    }

    public void setTipo_cobro(String tipo_cobro) {
        this.tipo_cobro = tipo_cobro;
    }

    public int getClasificacion_doc() {
        return clasificacion_doc;
    }

    public void setClasificacion_doc(int clasificacion_doc) {
        this.clasificacion_doc = clasificacion_doc;
    }

    public String getFecha_guia() {
        return fecha_guia;
    }

    public void setFecha_guia(String fecha_guia) {
        this.fecha_guia = fecha_guia;
    }

    public String getFecha_confirmacion() {
        return fecha_confirmacion;
    }

    public void setFecha_confirmacion(String fecha_confirmacion) {
        this.fecha_confirmacion = fecha_confirmacion;
    }

    public String getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(String fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public int getId_area_guia() {
        return id_area_guia;
    }

    public void setId_area_guia(int id_area_guia) {
        this.id_area_guia = id_area_guia;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_pedidopk() {
        return id_pedidopk;
    }

    public void setId_pedidopk(int id_pedidopk) {
        this.id_pedidopk = id_pedidopk;
    }

    public int getNum_pedido() {
        return num_pedido;
    }

    public void setNum_pedido(int num_pedido) {
        this.num_pedido = num_pedido;
    }

    public String getThermotempmax() {
        return thermotempmax;
    }

    public void setThermotempmax(String thermotempmax) {
        this.thermotempmax = thermotempmax;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getFecha_modifico() {
        return fecha_modifico;
    }

    public void setFecha_modifico(String fecha_modifico) {
        this.fecha_modifico = fecha_modifico;
    }

    public Double getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(Double valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public Double getConvenido_tonelada() {
        return convenido_tonelada;
    }

    public void setConvenido_tonelada(Double convenido_tonelada) {
        this.convenido_tonelada = convenido_tonelada;
    }

    public Double getConv_operador() {
        return conv_operador;
    }

    public void setConv_operador(Double conv_operador) {
        this.conv_operador = conv_operador;
    }

    public Double getConv_permisionario() {
        return conv_permisionario;
    }

    public void setConv_permisionario(Double conv_permisionario) {
        this.conv_permisionario = conv_permisionario;
    }

    public int getId_area_facturacion() {
        return id_area_facturacion;
    }

    public void setId_area_facturacion(int id_area_facturacion) {
        this.id_area_facturacion = id_area_facturacion;
    }

    public String getTelefono_cliente() {
        return telefono_cliente;
    }

    public void setTelefono_cliente(String telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    public String getContacto1_cliente() {
        return contacto1_cliente;
    }

    public void setContacto1_cliente(String contacto1_cliente) {
        this.contacto1_cliente = contacto1_cliente;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public int getId_iva() {
        return id_iva;
    }

    public void setId_iva(int id_iva) {
        this.id_iva = id_iva;
    }

    public float getFactor_iva() {
        return factor_iva;
    }

    public void setFactor_iva(float factor_iva) {
        this.factor_iva = factor_iva;
    }

    public String getNum_guiacancel() {
        return num_guiacancel;
    }

    public void setNum_guiacancel(String num_guiacancel) {
        this.num_guiacancel = num_guiacancel;
    }

    public int getId_personal() {
        return id_personal;
    }

    public void setId_personal(int id_personal) {
        this.id_personal = id_personal;
    }

    public int getNo_viaje() {
        return no_viaje;
    }

    public void setNo_viaje(int no_viaje) {
        this.no_viaje = no_viaje;
    }

    public int getId_remitente() {
        return id_remitente;
    }

    public void setId_remitente(int id_remitente) {
        this.id_remitente = id_remitente;
    }

    public String getNombre_remitente() {
        return nombre_remitente;
    }

    public void setNombre_remitente(String nombre_remitente) {
        this.nombre_remitente = nombre_remitente;
    }

    public String getDomicilio_remitente() {
        return domicilio_remitente;
    }

    public void setDomicilio_remitente(String domicilio_remitente) {
        this.domicilio_remitente = domicilio_remitente;
    }

    public String getRfc_remitente() {
        return rfc_remitente;
    }

    public void setRfc_remitente(String rfc_remitente) {
        this.rfc_remitente = rfc_remitente;
    }

    public int getId_destinatario() {
        return id_destinatario;
    }

    public void setId_destinatario(int id_destinatario) {
        this.id_destinatario = id_destinatario;
    }

    public String getNombre_destinatario() {
        return nombre_destinatario;
    }

    public void setNombre_destinatario(String nombre_destinatario) {
        this.nombre_destinatario = nombre_destinatario;
    }

    public String getDomicilio_destinatario() {
        return domicilio_destinatario;
    }

    public void setDomicilio_destinatario(String domicilio_destinatario) {
        this.domicilio_destinatario = domicilio_destinatario;
    }

    public String getRfc_destinatario() {
        return rfc_destinatario;
    }

    public void setRfc_destinatario(String rfc_destinatario) {
        this.rfc_destinatario = rfc_destinatario;
    }

    public int getId_condujo() {
        return id_condujo;
    }

    public void setId_condujo(int id_condujo) {
        this.id_condujo = id_condujo;
    }

    public int getId_operador2() {
        return id_operador2;
    }

    public void setId_operador2(int id_operador2) {
        this.id_operador2 = id_operador2;
    }

    public float getKms_guia() {
        return kms_guia;
    }

    public void setKms_guia(float kms_guia) {
        this.kms_guia = kms_guia;
    }

    public Double getFlete() {
        return flete;
    }

    public void setFlete(Double flete) {
        this.flete = flete;
    }

    public Double getSeguro() {
        return seguro;
    }

    public void setSeguro(Double seguro) {
        this.seguro = seguro;
    }

    public Double getManiobras() {
        return maniobras;
    }

    public void setManiobras(Double maniobras) {
        this.maniobras = maniobras;
    }

    public Double getAutopistas() {
        return autopistas;
    }

    public void setAutopistas(Double autopistas) {
        this.autopistas = autopistas;
    }

    public Double getOtros() {
        return otros;
    }

    public void setOtros(Double otros) {
        this.otros = otros;
    }

    public Double getCPAC() {
        return CPAC;
    }

    public void setCPAC(Double CPAC) {
        this.CPAC = CPAC;
    }

    public Double getCruces() {
        return cruces;
    }

    public void setCruces(Double cruces) {
        this.cruces = cruces;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getIva_guia() {
        return iva_guia;
    }

    public void setIva_guia(Double iva_guia) {
        this.iva_guia = iva_guia;
    }

    public Double getCobro_viaje_kms() {
        return cobro_viaje_kms;
    }

    public void setCobro_viaje_kms(Double cobro_viaje_kms) {
        this.cobro_viaje_kms = cobro_viaje_kms;
    }

    public float getMonto_tipo_cambio() {
        return monto_tipo_cambio;
    }

    public void setMonto_tipo_cambio(float monto_tipo_cambio) {
        this.monto_tipo_cambio = monto_tipo_cambio;
    }

    public int getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(int tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    public int getId_origen() {
        return id_origen;
    }

    public void setId_origen(int id_origen) {
        this.id_origen = id_origen;
    }

    public String getDesc_origen() {
        return desc_origen;
    }

    public void setDesc_origen(String desc_origen) {
        this.desc_origen = desc_origen;
    }

    public int getId_destino() {
        return id_destino;
    }

    public void setId_destino(int id_destino) {
        this.id_destino = id_destino;
    }

    public String getDesc_destino() {
        return desc_destino;
    }

    public void setDesc_destino(String desc_destino) {
        this.desc_destino = desc_destino;
    }

    public int getId_fraccion() {
        return id_fraccion;
    }

    public void setId_fraccion(int id_fraccion) {
        this.id_fraccion = id_fraccion;
    }

    public int getPlaza_emision() {
        return plaza_emision;
    }

    public void setPlaza_emision(int plaza_emision) {
        this.plaza_emision = plaza_emision;
    }

    public String getDesc_plazaemision() {
        return desc_plazaemision;
    }

    public void setDesc_plazaemision(String desc_plazaemision) {
        this.desc_plazaemision = desc_plazaemision;
    }

    public int getConducir_de() {
        return conducir_de;
    }

    public void setConducir_de(int conducir_de) {
        this.conducir_de = conducir_de;
    }

    public String getDesc_conducir_de() {
        return desc_conducir_de;
    }

    public void setDesc_conducir_de(String desc_conducir_de) {
        this.desc_conducir_de = desc_conducir_de;
    }

    public int getConducir_a() {
        return conducir_a;
    }

    public void setConducir_a(int conducir_a) {
        this.conducir_a = conducir_a;
    }

    public String getDesc_conducir_a() {
        return desc_conducir_a;
    }

    public void setDesc_conducir_a(String desc_conducir_a) {
        this.desc_conducir_a = desc_conducir_a;
    }

    public int getId_tipo_moneda() {
        return id_tipo_moneda;
    }

    public void setId_tipo_moneda(int id_tipo_moneda) {
        this.id_tipo_moneda = id_tipo_moneda;
    }

    public String getNo_carta() {
        return no_carta;
    }

    public void setNo_carta(String no_carta) {
        this.no_carta = no_carta;
    }

    public String getFecha_cancelacion() {
        return fecha_cancelacion;
    }

    public void setFecha_cancelacion(String fecha_cancelacion) {
        this.fecha_cancelacion = fecha_cancelacion;
    }

    public int getId_remolque1() {
        return id_remolque1;
    }

    public void setId_remolque1(int id_remolque1) {
        this.id_remolque1 = id_remolque1;
    }

    public String getFecha_contabilizado() {
        return fecha_contabilizado;
    }

    public void setFecha_contabilizado(String fecha_contabilizado) {
        this.fecha_contabilizado = fecha_contabilizado;
    }

    public int getId_unidad() {
        return id_unidad;
    }

    public void setId_unidad(int id_unidad) {
        this.id_unidad = id_unidad;
    }

    public String getRecoger_en() {
        return recoger_en;
    }

    public void setRecoger_en(String recoger_en) {
        this.recoger_en = recoger_en;
    }

    public String getEntregar_en() {
        return entregar_en;
    }

    public void setEntregar_en(String entregar_en) {
        this.entregar_en = entregar_en;
    }

    public int getValor_declarado() {
        return valor_declarado;
    }

    public void setValor_declarado(int valor_declarado) {
        this.valor_declarado = valor_declarado;
    }

    public String getObservaciones_guia() {
        return observaciones_guia;
    }

    public void setObservaciones_guia(String observaciones_guia) {
        this.observaciones_guia = observaciones_guia;
    }

    public String getNo_remision() {
        return no_remision;
    }

    public void setNo_remision(String no_remision) {
        this.no_remision = no_remision;
    }

    public String getMotivo_cancelacion() {
        return motivo_cancelacion;
    }

    public void setMotivo_cancelacion(String motivo_cancelacion) {
        this.motivo_cancelacion = motivo_cancelacion;
    }

    public String getObs_cobranza() {
        return obs_cobranza;
    }

    public void setObs_cobranza(String obs_cobranza) {
        this.obs_cobranza = obs_cobranza;
    }

    public int getId_remolque2() {
        return id_remolque2;
    }

    public void setId_remolque2(int id_remolque2) {
        this.id_remolque2 = id_remolque2;
    }

    public String getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(String prestamo) {
        this.prestamo = prestamo;
    }

    public String getNum_guia_asignado() {
        return num_guia_asignado;
    }

    public void setNum_guia_asignado(String num_guia_asignado) {
        this.num_guia_asignado = num_guia_asignado;
    }

    public String getNo_deposito() {
        return no_deposito;
    }

    public void setNo_deposito(String no_deposito) {
        this.no_deposito = no_deposito;
    }

    public String getId_ingreso() {
        return id_ingreso;
    }

    public void setId_ingreso(String id_ingreso) {
        this.id_ingreso = id_ingreso;
    }

    public String getId_modifico() {
        return id_modifico;
    }

    public void setId_modifico(String id_modifico) {
        this.id_modifico = id_modifico;
    }

    public String getUnidadplaca() {
        return unidadplaca;
    }

    public void setUnidadplaca(String unidadplaca) {
        this.unidadplaca = unidadplaca;
    }

    public String getUnidadtipo() {
        return unidadtipo;
    }

    public void setUnidadtipo(String unidadtipo) {
        this.unidadtipo = unidadtipo;
    }

    public String getRem1placa() {
        return rem1placa;
    }

    public void setRem1placa(String rem1placa) {
        this.rem1placa = rem1placa;
    }

    public String getRem1tipo() {
        return rem1tipo;
    }

    public void setRem1tipo(String rem1tipo) {
        this.rem1tipo = rem1tipo;
    }

    public String getRem2placa() {
        return rem2placa;
    }

    public void setRem2placa(String rem2placa) {
        this.rem2placa = rem2placa;
    }

    public String getRem2tipo() {
        return rem2tipo;
    }

    public void setRem2tipo(String rem2tipo) {
        this.rem2tipo = rem2tipo;
    }

    public String getPersonalnombre() {
        return personalnombre;
    }

    public void setPersonalnombre(String personalnombre) {
        this.personalnombre = personalnombre;
    }

    public String getTipo_facturacion() {
        return tipo_facturacion;
    }

    public void setTipo_facturacion(String tipo_facturacion) {
        this.tipo_facturacion = tipo_facturacion;
    }

}
