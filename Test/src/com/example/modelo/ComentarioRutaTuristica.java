package com.example.modelo;

// default package
// Generated 29/09/2014 10:20:51 PM by Hibernate Tools 4.0.0

/**
 * ComentarioRutaTuristica generated by hbm2java
 */
public class ComentarioRutaTuristica implements java.io.Serializable {

	private long id;
	private RutaTuristica rutaTuristica;
	private Usuario usuario;
	private String comentario;

	public ComentarioRutaTuristica() {
	}

	public ComentarioRutaTuristica(long id, RutaTuristica rutaTuristica,
			Usuario usuario) {
		this.id = id;
		this.rutaTuristica = rutaTuristica;
		this.usuario = usuario;
	}

	public ComentarioRutaTuristica(long id, RutaTuristica rutaTuristica,
			Usuario usuario, String comentario) {
		this.id = id;
		this.rutaTuristica = rutaTuristica;
		this.usuario = usuario;
		this.comentario = comentario;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public RutaTuristica getRutaTuristica() {
		return this.rutaTuristica;
	}

	public void setRutaTuristica(RutaTuristica rutaTuristica) {
		this.rutaTuristica = rutaTuristica;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getComentario() {
		return this.comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

}
