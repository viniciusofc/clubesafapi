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
    
    @Column(name = "telcel1")
    private String contato;

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
		return contato;
	}
    
  
	

}
