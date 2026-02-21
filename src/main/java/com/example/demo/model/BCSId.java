package com.example.demo.model;

import java.io.Serializable;
import java.util.Objects;

public class BCSId implements Serializable{
	private String codEmpresa;
	private String nup;
	private String codPerFisica;
	private int correlativo;
	private int codCausal;
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
	public int getCorrelativo() {
		return correlativo;
	}
	public void setCorrelativo(int correlativo) {
		this.correlativo = correlativo;
	}
	public int getCodCausal() {
		return codCausal;
	}
	public void setCodCausal(int codCausal) {
		this.codCausal = codCausal;
	}
	public BCSId(String codEmpresa, String nup, String codPerFisica, int correlativo, int codCausal) {
		this.codEmpresa = codEmpresa;
		this.nup = nup;
		this.codPerFisica = codPerFisica;
		this.correlativo = correlativo;
		this.codCausal = codCausal;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codEmpresa, nup, codPerFisica, correlativo, codCausal);
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof BCSId that)) return false;

		return Objects.equals(codEmpresa, that.codEmpresa)
            && Objects.equals(nup, that.nup)
            && Objects.equals(codPerFisica, that.codPerFisica)
            && Objects.equals(correlativo, that.correlativo)
            && Objects.equals(codCausal, that.codCausal);

	}
	protected  BCSId() {
	}
	
	
	
	
	
}
