package com.api.ClubeSaf.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "er_parcelas")
public class parcelas {

	@Id
	@Column(name = "campoid")
	private Long id;
	
	@Column(name = "campocodigodebarras")
	private String codBarras;
	
	@Column(name = "campolinhadigitavel")
	private String linDigitavel;
	
	@Column(name = "campovalor")
	private Double valor;
	
	@Column(name = "campodataven")
	private String vencimento;
	
	@Column(name = "campoid_contrato")
	private Long inscricao;

	@Column(name = "campoid_uo")
	private Long iduo;

	public Double getValor() {
		return valor;
	}

	public Long getId() {
		return id;
	}


	public String getCodBarras() {
		return codBarras;
	}


	public String getLinDigitavel() {
		return linDigitavel;
	}


	public String getVencimento() {
		return vencimento;
	}


	public Long getIdcontrato() {
		return inscricao;
	}

	public Long getIduo() {
		return iduo;
	}

	public void setIduo(Long iduo) {
		this.iduo = iduo;
	}
	
}
