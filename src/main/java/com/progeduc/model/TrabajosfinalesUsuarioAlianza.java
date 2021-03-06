package com.progeduc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="TRABAJOSFINALES_USUARIOALIANZA")
@IdClass(TrabajosfinalesUsuarioAlianzaPK.class)/*se comunica con la clase*/
public class TrabajosfinalesUsuarioAlianza {

	@Id
	private Trabajosfinales trabajosfinales;
	
	@Id
	private UsuarioAlianza usuarioalianza;
	
	@Column(name="nota")
	private Float nota;

	public Trabajosfinales getTrabajosfinales() {
		return trabajosfinales;
	}

	public void setTrabajosfinales(Trabajosfinales trabajosfinales) {
		this.trabajosfinales = trabajosfinales;
	}

	public UsuarioAlianza getUsuarioalianza() {
		return usuarioalianza;
	}

	public void setUsuarioalianza(UsuarioAlianza usuarioalianza) {
		this.usuarioalianza = usuarioalianza;
	}

	public Float getNota() {
		return nota;
	}

	public void setNota(Float nota) {
		this.nota = nota;
	}
	
}
