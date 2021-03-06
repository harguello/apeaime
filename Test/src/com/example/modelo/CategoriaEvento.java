package com.example.modelo;

// default package
// Generated 29/09/2014 10:20:51 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * CategoriaEvento generated by hbm2java
 */
public class CategoriaEvento implements java.io.Serializable {

	private long id;
	private String categoriaEvento;
	private Set eventoCategoriaEventos = new HashSet(0);

	public CategoriaEvento() {
	}

	public CategoriaEvento(long id) {
		this.id = id;
	}

	public CategoriaEvento(long id, String categoriaEvento,
			Set eventoCategoriaEventos) {
		this.id = id;
		this.categoriaEvento = categoriaEvento;
		this.eventoCategoriaEventos = eventoCategoriaEventos;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategoriaEvento() {
		return this.categoriaEvento;
	}

	public void setCategoriaEvento(String categoriaEvento) {
		this.categoriaEvento = categoriaEvento;
	}

	public Set getEventoCategoriaEventos() {
		return this.eventoCategoriaEventos;
	}

	public void setEventoCategoriaEventos(Set eventoCategoriaEventos) {
		this.eventoCategoriaEventos = eventoCategoriaEventos;
	}

}
