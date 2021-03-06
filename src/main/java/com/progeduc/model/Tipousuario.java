package com.progeduc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TIPOUSUARIO")
public class Tipousuario {
	
	@Id
	@Column(name="ID")
	private Integer id;
	
	@Column(name="DESCRIPCION",nullable=false,length=80)
	private String descripcion;
	
	@Column(name="ORDEN",nullable=true)
	private Integer orden;
	
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

	public Integer getOrden() {
		return orden;
	}

	public void setOrden(Integer orden) {
		this.orden = orden;
	}
}
