package com.example.modelo;

// default package
// Generated 29/09/2014 10:20:51 PM by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario implements java.io.Serializable {

	private long id;
	private String nombre;
	private String apellido;
	private String email;
	private String latitud;
	private String longitud;
	private Date fecha;
	private byte[] foto;
	private String password;
	private Integer habilitado;
	private Long facebook;
	private Set comentarioSitios = new HashSet(0);
	private Set calificacionRutaTuristicas = new HashSet(0);
	private Set eventos = new HashSet(0);
	private Set calificacionSitios = new HashSet(0);
	private Set sitios = new HashSet(0);
	private Set auditorias = new HashSet(0);
	private Set rutaTuristicas = new HashSet(0);
	private Set comentarioRutaTuristicas = new HashSet(0);
	private Set checkins = new HashSet(0);
	private Set rolUsuarioUsuarios = new HashSet(0);

	public Usuario() {
	}

	public Usuario(long id) {
		this.id = id;
	}

	public Usuario(long id, String nombre, String apellido, String email,
			String latitud, String longitud, Date fecha, byte[] foto,
			String password, Integer habilitado, Long facebook,
			Set comentarioSitios, Set calificacionRutaTuristicas, Set eventos,
			Set calificacionSitios, Set sitios, Set auditorias,
			Set rutaTuristicas, Set comentarioRutaTuristicas, Set checkins,
			Set rolUsuarioUsuarios) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.latitud = latitud;
		this.longitud = longitud;
		this.fecha = fecha;
		this.foto = foto;
		this.password = password;
		this.habilitado = habilitado;
		this.facebook = facebook;
		this.comentarioSitios = comentarioSitios;
		this.calificacionRutaTuristicas = calificacionRutaTuristicas;
		this.eventos = eventos;
		this.calificacionSitios = calificacionSitios;
		this.sitios = sitios;
		this.auditorias = auditorias;
		this.rutaTuristicas = rutaTuristicas;
		this.comentarioRutaTuristicas = comentarioRutaTuristicas;
		this.checkins = checkins;
		this.rolUsuarioUsuarios = rolUsuarioUsuarios;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLatitud() {
		return this.latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return this.longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public byte[] getFoto() {
		return this.foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getHabilitado() {
		return this.habilitado;
	}

	public void setHabilitado(Integer habilitado) {
		this.habilitado = habilitado;
	}

	public Long getFacebook() {
		return this.facebook;
	}

	public void setFacebook(Long facebook) {
		this.facebook = facebook;
	}

	public Set getComentarioSitios() {
		return this.comentarioSitios;
	}

	public void setComentarioSitios(Set comentarioSitios) {
		this.comentarioSitios = comentarioSitios;
	}

	public Set getCalificacionRutaTuristicas() {
		return this.calificacionRutaTuristicas;
	}

	public void setCalificacionRutaTuristicas(Set calificacionRutaTuristicas) {
		this.calificacionRutaTuristicas = calificacionRutaTuristicas;
	}

	public Set getEventos() {
		return this.eventos;
	}

	public void setEventos(Set eventos) {
		this.eventos = eventos;
	}

	public Set getCalificacionSitios() {
		return this.calificacionSitios;
	}

	public void setCalificacionSitios(Set calificacionSitios) {
		this.calificacionSitios = calificacionSitios;
	}

	public Set getSitios() {
		return this.sitios;
	}

	public void setSitios(Set sitios) {
		this.sitios = sitios;
	}

	public Set getAuditorias() {
		return this.auditorias;
	}

	public void setAuditorias(Set auditorias) {
		this.auditorias = auditorias;
	}

	public Set getRutaTuristicas() {
		return this.rutaTuristicas;
	}

	public void setRutaTuristicas(Set rutaTuristicas) {
		this.rutaTuristicas = rutaTuristicas;
	}

	public Set getComentarioRutaTuristicas() {
		return this.comentarioRutaTuristicas;
	}

	public void setComentarioRutaTuristicas(Set comentarioRutaTuristicas) {
		this.comentarioRutaTuristicas = comentarioRutaTuristicas;
	}

	public Set getCheckins() {
		return this.checkins;
	}

	public void setCheckins(Set checkins) {
		this.checkins = checkins;
	}

	public Set getRolUsuarioUsuarios() {
		return this.rolUsuarioUsuarios;
	}

	public void setRolUsuarioUsuarios(Set rolUsuarioUsuarios) {
		this.rolUsuarioUsuarios = rolUsuarioUsuarios;
	}

}
