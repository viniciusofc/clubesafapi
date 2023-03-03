package com.api.ClubeSaf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "gr_segmentos")
public class filtroParceiros {

	@Id
	@Column(name = "id_parceiro")
	private Long id;

	@Column(name = "parceiro")
    private String nome;
    
    private String segmento;
    
    private String cidade;
    
    private String uf;
    
    private String logradouro;
    
    private String numero;
    
    private String atividade;
    
    private String facebook;
    
    private String bairro;
    
    private String referencia;
    
    private String email;
    
    private String complemento;
    
	@Column(name = "telcel1")
    private String tel1;
	
	@Column(name = "telcel2")
    private String tel2;

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getSegmento() {
		return segmento;
	}

	public String getCidade() {
		return cidade;
	}

	public String getUf() {
		return uf;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public String getContato() {
		return tel1;
	}

	public String getAtividade() {
		return atividade;
	}
    
  
	public String getFacebook() {
			return facebook;
	}

	public String getTel1() {
		return tel1;
	}

	public String getTel2() {
		return tel2;
	}

	public String getEmail() {
		return email;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public String getReferencia() {
		return referencia;
	}


}
