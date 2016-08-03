package ec.edu.epn.modelo.jpa;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the paciente database table.
 * 
 */
@Entity
@Table(name="bucalcenter.paciente")
public class Paciente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_USR")
	private int idUsr;

	@Column(name="APELLIDO1_USR")
	private String apellido1Usr;

	@Column(name="APELLIDO2_USR")
	private String apellido2Usr;

	@Column(name="CEDULA_USR")
	private String cedulaUsr;

	@Column(name="CONFIRM_PASSWORD_USR")
	private String confirmPasswordUsr;

	@Column(name="CORREOE_USR")
	private String correoeUsr;

	@Column(name="DIRECCION_USR")
	private String direccionUsr;

	@Column(name="EDAD_USR")
	private String edadUsr;

	@Column(name="ESTADO_USR")
	private String estadoUsr;

	@Column(name="ESTADOCIVIL_USR")
	private String estadocivilUsr;

	@Temporal(TemporalType.DATE)
	@Column(name="FECNAC_USR")
	private Date fecnacUsr;

	@Column(name="LUGARNAC_USR")
	private String lugarnacUsr;

	@Column(name="NOMBRE1_USR")
	private String nombre1Usr;

	@Column(name="NOMBRE2_USR")
	private String nombre2Usr;

	@Column(name="NOMRE_USR")
	private String nomreUsr;

	@Column(name="OCUPACION_PACIENTE")
	private String ocupacionPaciente;

	@Column(name="PASSWORD_USR")
	private String passwordUsr;

	@Column(name="SEXO_USR")
	private String sexoUsr;

	@Column(name="TELFCEL_USR")
	private String telfcelUsr;

	@Column(name="TELFDOM_USR")
	private String telfdomUsr;

	@Column(name="TIPO_USR")
	private String tipoUsr;

	public Paciente() {
	}

	public int getIdUsr() {
		return this.idUsr;
	}

	public void setIdUsr(int idUsr) {
		this.idUsr = idUsr;
	}

	public String getApellido1Usr() {
		return this.apellido1Usr;
	}

	public void setApellido1Usr(String apellido1Usr) {
		this.apellido1Usr = apellido1Usr;
	}

	public String getApellido2Usr() {
		return this.apellido2Usr;
	}

	public void setApellido2Usr(String apellido2Usr) {
		this.apellido2Usr = apellido2Usr;
	}

	public String getCedulaUsr() {
		return this.cedulaUsr;
	}

	public void setCedulaUsr(String cedulaUsr) {
		this.cedulaUsr = cedulaUsr;
	}

	public String getConfirmPasswordUsr() {
		return this.confirmPasswordUsr;
	}

	public void setConfirmPasswordUsr(String confirmPasswordUsr) {
		this.confirmPasswordUsr = confirmPasswordUsr;
	}

	public String getCorreoeUsr() {
		return this.correoeUsr;
	}

	public void setCorreoeUsr(String correoeUsr) {
		this.correoeUsr = correoeUsr;
	}

	public String getDireccionUsr() {
		return this.direccionUsr;
	}

	public void setDireccionUsr(String direccionUsr) {
		this.direccionUsr = direccionUsr;
	}

	public String getEdadUsr() {
		return this.edadUsr;
	}

	public void setEdadUsr(String edadUsr) {
		this.edadUsr = edadUsr;
	}

	public String getEstadoUsr() {
		return this.estadoUsr;
	}

	public void setEstadoUsr(String estadoUsr) {
		this.estadoUsr = estadoUsr;
	}

	public String getEstadocivilUsr() {
		return this.estadocivilUsr;
	}

	public void setEstadocivilUsr(String estadocivilUsr) {
		this.estadocivilUsr = estadocivilUsr;
	}

	public Date getFecnacUsr() {
		return this.fecnacUsr;
	}

	public void setFecnacUsr(Date fecnacUsr) {
		this.fecnacUsr = fecnacUsr;
	}

	public String getLugarnacUsr() {
		return this.lugarnacUsr;
	}

	public void setLugarnacUsr(String lugarnacUsr) {
		this.lugarnacUsr = lugarnacUsr;
	}

	public String getNombre1Usr() {
		return this.nombre1Usr;
	}

	public void setNombre1Usr(String nombre1Usr) {
		this.nombre1Usr = nombre1Usr;
	}

	public String getNombre2Usr() {
		return this.nombre2Usr;
	}

	public void setNombre2Usr(String nombre2Usr) {
		this.nombre2Usr = nombre2Usr;
	}

	public String getNomreUsr() {
		return this.nomreUsr;
	}

	public void setNomreUsr(String nomreUsr) {
		this.nomreUsr = nomreUsr;
	}

	public String getOcupacionPaciente() {
		return this.ocupacionPaciente;
	}

	public void setOcupacionPaciente(String ocupacionPaciente) {
		this.ocupacionPaciente = ocupacionPaciente;
	}

	public String getPasswordUsr() {
		return this.passwordUsr;
	}

	public void setPasswordUsr(String passwordUsr) {
		this.passwordUsr = passwordUsr;
	}

	public String getSexoUsr() {
		return this.sexoUsr;
	}

	public void setSexoUsr(String sexoUsr) {
		this.sexoUsr = sexoUsr;
	}

	public String getTelfcelUsr() {
		return this.telfcelUsr;
	}

	public void setTelfcelUsr(String telfcelUsr) {
		this.telfcelUsr = telfcelUsr;
	}

	public String getTelfdomUsr() {
		return this.telfdomUsr;
	}

	public void setTelfdomUsr(String telfdomUsr) {
		this.telfdomUsr = telfdomUsr;
	}

	public String getTipoUsr() {
		return this.tipoUsr;
	}

	public void setTipoUsr(String tipoUsr) {
		this.tipoUsr = tipoUsr;
	}

}