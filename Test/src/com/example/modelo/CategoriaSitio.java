package com.example.modelo;

// default package
// Generated 29/09/2014 10:20:51 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * CategoriaSitio generated by hbm2java
 */
public class CategoriaSitio implements java.io.Serializable {

	private long id;
	private String categoriaSitio;
	private Set sitioCategoriaSitios = new HashSet(0);

	public CategoriaSitio() {
	}

	public CategoriaSitio(long id) {
		this.id = id;
	}

	public CategoriaSitio(long id, String categoriaSitio,
			Set sitioCategoriaSitios) {
		this.id = id;
		this.categoriaSitio = categoriaSitio;
		this.sitioCategoriaSitios = sitioCategoriaSitios;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategoriaSitio() {
		return this.categoriaSitio;
	}

	public void setCategoriaSitio(String categoriaSitio) {
		this.categoriaSitio = categoriaSitio;
	}

	public Set getSitioCategoriaSitios() {
		return this.sitioCategoriaSitios;
	}

	public void setSitioCategoriaSitios(Set sitioCategoriaSitios) {
		this.sitioCategoriaSitios = sitioCategoriaSitios;
	}

}
