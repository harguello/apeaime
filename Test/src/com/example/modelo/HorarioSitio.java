package com.example.modelo;

// default package
// Generated 29/09/2014 10:20:51 PM by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * HorarioSitio generated by hbm2java
 */
public class HorarioSitio implements java.io.Serializable {

	private long id;
	private Dia dia;
	private Date horarioApertura;
	private Date horarioCierre;

	public HorarioSitio() {
	}

	public HorarioSitio(long id, Dia dia) {
		this.id = id;
		this.dia = dia;
	}

	public HorarioSitio(long id, Dia dia, Date horarioApertura,
			Date horarioCierre) {
		this.id = id;
		this.dia = dia;
		this.horarioApertura = horarioApertura;
		this.horarioCierre = horarioCierre;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Dia getDia() {
		return this.dia;
	}

	public void setDia(Dia dia) {
		this.dia = dia;
	}

	public Date getHorarioApertura() {
		return this.horarioApertura;
	}

	public void setHorarioApertura(Date horarioApertura) {
		this.horarioApertura = horarioApertura;
	}

	public Date getHorarioCierre() {
		return this.horarioCierre;
	}

	public void setHorarioCierre(Date horarioCierre) {
		this.horarioCierre = horarioCierre;
	}

}
