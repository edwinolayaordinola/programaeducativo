package com.progeduc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TIPO_AUSPICIO")
public class TipoAuspicio {
	
	@Id
	@Column(name="ID")
	private Integer id;
	
	@Column(name="DESCRIPCION" ,length=50)
	private String descripcion;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
