package com.example.modelo;

// default package
// Generated 29/09/2014 10:20:51 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * Dia generated by hbm2java
 */
public class Dia implements java.io.Serializable {

	private long id;
	private Evento evento;
	private Sitio sitio;
	private String dia;
	private Set horarioSitios = new HashSet(0);

	public Dia() {
	}

	public Dia(long id) {
		this.id = id;
	}

	public Dia(long id, Evento evento, Sitio sitio, String dia,
			Set horarioSitios) {
		this.id = id;
		this.evento = evento;
		this.sitio = sitio;
		this.dia = dia;
		this.horarioSitios = horarioSitios;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Evento getEvento() {
		return this.evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public Sitio getSitio() {
		return this.sitio;
	}

	public void setSitio(Sitio sitio) {
		this.sitio = sitio;
	}

	public String getDia() {
		return this.dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public Set getHorarioSitios() {
		return this.horarioSitios;
	}

	public void setHorarioSitios(Set horarioSitios) {
		this.horarioSitios = horarioSitios;
	}

}
