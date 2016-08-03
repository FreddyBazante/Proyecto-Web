package ec.edu.epn.modelo.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sesiones database table.
 * 
 */
@Entity
@Table(name="bucalcenter.sesiones")
public class Sesione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_sesion")
	private String idSesion;

	private String estado;

	private String host;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="inicio_sesion")
	private Date inicioSesion;

	private String ip;

	private String servername;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ultimo_acceso")
	private Date ultimoAcceso;

	private String usuario;

	public Sesione() {
	}

	public String getIdSesion() {
		return this.idSesion;
	}

	public void setIdSesion(String idSesion) {
		this.idSesion = idSesion;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public Date getInicioSesion() {
		return this.inicioSesion;
	}

	public void setInicioSesion(Date inicioSesion) {
		this.inicioSesion = inicioSesion;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getServername() {
		return this.servername;
	}

	public void setServername(String servername) {
		this.servername = servername;
	}

	public Date getUltimoAcceso() {
		return this.ultimoAcceso;
	}

	public void setUltimoAcceso(Date ultimoAcceso) {
		this.ultimoAcceso = ultimoAcceso;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}