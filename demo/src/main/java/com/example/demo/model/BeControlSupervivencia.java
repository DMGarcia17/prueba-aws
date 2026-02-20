package com.example.demo.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;

@Entity
@IdClass(BCSId.class)
@Table(name = "BE_CONTROL_SUPERVIVENCIA")
public class BeControlSupervivencia{
	@Id
	@Column(name = "COD_EMPRESA" )
	private String codEmpresa;

	@Id
	@Column(name = "NUP" )
	private String nup;

	@Id
	@Column(name = "COD_PER_FISICA" )
	private String codPerFisica;

	@Id
	@Column(name = "CORRELATIVO" )
	private Integer correlativo;

	@Column(name = "FECHA1" )
	@DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate fecha1; 

	@Column(name = "FECHA2" )
	@DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate fecha2;

	@Column(name = "ESTADO" )
	private String estado;

	@Id
	@Column(name = "COD_CAUSAL" )
	private Integer codCausal;

	@Column(name = "FORMULARIO" )
	private Integer formulario;

	@Column(name = "TIPO_DOCUMENTO" )
	private String tipoDocumento;

	@Column(name = "NUM_DOCUMENTO" )
	private String numDocumento;

	@Column(name = "FECHA_ADICION" )
	@DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate fechaAdicion;

	@Column(name = "ADICIONADO_POR" )
	private String adicionadoPor;

	@Column(name = "FECHA_MODIFICACION" )
	@DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate fechaModificacion;

	@Column(name = "MODIFICADO_POR" )
	private String modificadoPor;

	@Column(name = "NUMERO_SUSPENSION" )
	private Integer numeroSuspension;

	@Column(name = "NUM_PLA" )
	private Integer numPla;

	@Column(name = "TIPO_PLA" )
	private Integer tipoPla;
	
	@Column(name = "FECHA_ENTREGA" )
	@DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate fechaEntrega;

	@Column(name = "FECHA_ENVIO" )
	@DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate fechaEnvio;

	@Column(name = "CONTROL_CALIDAD" )
	@DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate controlCalidad;

	@Column(name = "FECHA_ESCANEADO" )
	@DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate fechaEscaneado;

	@Column(name = "USUARIO_QC" )
	private String usuarioQc;

	@Column(name = "USUARIO_ENTREGA" )
	private String usuarioEntrega;

	@Column(name = "USUARIO_ENVIO" )
	private String usuarioEnvio;

	@Column(name = "USUARIO_ESCANEA" )
	private String usuarioEscanea;

	@Column(name = "COD_HUELLA" )
	private Integer codHuella;
	
	@Column(name = "CANAL_CONTROL" )
	private String canalControl;

	public String getCodEmpresa() {
		return codEmpresa;
	}

	public void setCodEmpresa(String codEmpresa) {
		this.codEmpresa = codEmpresa;
	}

	public String getNup() {
		return nup;
	}

	public void setNup(String nup) {
		this.nup = nup;
	}

	public String getCodPerFisica() {
		return codPerFisica;
	}

	public void setCodPerFisica(String codPerFisica) {
		this.codPerFisica = codPerFisica;
	}

	public Integer getCorrelativo() {
		return correlativo;
	}

	public void setCorrelativo(Integer correlativo) {
		this.correlativo = correlativo;
	}

	public LocalDate getFecha1() {
		return fecha1;
	}

	public void setFecha1(LocalDate fecha1) {
		this.fecha1 = fecha1;
	}

	public LocalDate getFecha2() {
		return fecha2;
	}

	public void setFecha2(LocalDate fecha2) {
		this.fecha2 = fecha2;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getCodCausal() {
		return codCausal;
	}

	public void setCodCausal(Integer codCausal) {
		this.codCausal = codCausal;
	}

	public Integer getFormulario() {
		return formulario;
	}

	public void setFormulario(Integer formulario) {
		this.formulario = formulario;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}

	public LocalDate getFechaAdicion() {
		return fechaAdicion;
	}

	public void setFechaAdicion(LocalDate fechaAdicion) {
		this.fechaAdicion = fechaAdicion;
	}

	public String getAdicionadoPor() {
		return adicionadoPor;
	}

	public void setAdicionadoPor(String adicionadoPor) {
		this.adicionadoPor = adicionadoPor;
	}

	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(LocalDate fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public String getModificadoPor() {
		return modificadoPor;
	}

	public void setModificadoPor(String modificadoPor) {
		this.modificadoPor = modificadoPor;
	}

	public Integer getNumeroSuspension() {
		return numeroSuspension;
	}

	public void setNumeroSuspension(int numeroSuspension) {
		this.numeroSuspension = numeroSuspension;
	}

	public Integer getNumPla() {
		return numPla;
	}

	public void setNumPla(Integer numPla) {
		this.numPla = numPla;
	}

	public Integer getTipoPla() {
		return tipoPla;
	}

	public void setTipoPla(Integer tipoPla) {
		this.tipoPla = tipoPla;
	}

	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public LocalDate getFechaEnvio() {
		return fechaEnvio;
	}

	public void setFechaEnvio(LocalDate fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}

	public LocalDate getControlCalidad() {
		return controlCalidad;
	}

	public void setControlCalidad(LocalDate controlCalidad) {
		this.controlCalidad = controlCalidad;
	}

	public LocalDate getFechaEscaneado() {
		return fechaEscaneado;
	}

	public void setFechaEscaneado(LocalDate fechaEscaneado) {
		this.fechaEscaneado = fechaEscaneado;
	}

	public String getUsuarioQc() {
		return usuarioQc;
	}

	public void setUsuarioQc(String usuarioQc) {
		this.usuarioQc = usuarioQc;
	}

	public String getUsuarioEntrega() {
		return usuarioEntrega;
	}

	public void setUsuarioEntrega(String usuarioEntrega) {
		this.usuarioEntrega = usuarioEntrega;
	}

	public String getUsuarioEnvio() {
		return usuarioEnvio;
	}

	public void setUsuarioEnvio(String usuarioEnvio) {
		this.usuarioEnvio = usuarioEnvio;
	}

	public String getUsuarioEscanea() {
		return usuarioEscanea;
	}

	public void setUsuarioEscanea(String usuarioEscanea) {
		this.usuarioEscanea = usuarioEscanea;
	}

	public Integer getCodHuella() {
		return codHuella;
	}

	public void setCodHuella(Integer codHuella) {
		this.codHuella = codHuella;
	}

	public String getCanalControl() {
		return canalControl;
	}

	public void setCanalControl(String canalControl) {
		this.canalControl = canalControl;
	}
	
	
}
