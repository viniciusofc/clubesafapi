package com.api.ClubeSaf.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "er_parcelas")
public class updateparcelas {
	
	@Id
	@Column(name = "id_parcela")
	private Long id;
	
	@Column(name = "operacao")
	private String operacao;
	
	@Column(name = "comissao")
	private Double comissao;
	
	@Column(name = "juros")
	private Double juros;
	
	@Column(name = "id_local")
	private Long idLocal;
	
	@Column(name = "cformpag")
	private Long cformpag;
	
	@Column(name = "id_uo")
	private Long iduo;
	
	@Column(name = "autenticacao")
	private Long autenticacao;
	
	@Column(name = "datapag")
	private Date datapag;
	
	@Column(name = "dt_operacao2")
	private Date  dataOperacao;
	
	@Column(name = "id_usuario2")
	private Long idUser2;

	public String getOperacao() {
		return "2";
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

	public Long getIdLocal() {
		return idLocal;
	}

	public void setIdLocal(Long idLocal) {
		this.idLocal = idLocal;
	}

	public Long getCformpag() {
		return (long) 1;
	}

	public void setCformpag(Long cformpag) {
		this.cformpag = cformpag;
	}

	public Long getAutenticacao() {
		return autenticacao;
	}

	public void setAutenticacao(Long autenticacao) {
		this.autenticacao = autenticacao;
	}

	public Date getDatapag() throws ParseException {
		SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = sm.format(new Date());
		Date data = sm.parse(strDate);
		return data;
	}

	public void setDatapag(Date datapag) {
		this.datapag = datapag;
	}

	public Date  getDataOperacao() throws ParseException {
	SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String strDate = sm.format(new Date());
	Date dt = sm.parse(strDate);
	return dt;
}

	public void setDataOperacao(Date dataOperacao) {
		this.dataOperacao = dataOperacao;
	}

	public Long getIdUser2() {
		return (long) 50;
	}

	public void setIdUser2(Long idUser2) {
		this.idUser2 = idUser2;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getJuros() {
		return 0.00;
	}

	public void setJuros(Double juros) {
		this.juros = juros;
	}

	public Long getIduo() {
		return iduo;
	}

	public void setIduo(Long iduo) {
		this.iduo = iduo;
	}
	
	

}
