package com.api.ClubeSaf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gr_segmentos")
public class segmento {

	@Id
	@Column(name = "id_segmento")
	private Long id;
	
	@Column(name = "segmento")
	private String label;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	
	
}
