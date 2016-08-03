package ec.edu.epn.modelo.jpa;

import java.io.Serializable;

import javax.persistence.*;

import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the cita database table.
 * 
 */
@Entity
@Table(name="bucalcenter.cita")
public class Cita implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_CITA")
	private int idCita;

	@Column(name="ESTADO_CITA")
	private String estadoCita;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_CITA")
	private Date fechaCita;

	@Column(name="HORA_CITA")
	private Time horaCita;

	public Cita() {
	}

	public int getIdCita() {
		return this.idCita;
	}

	public void setIdCita(int idCita) {
		this.idCita = idCita;
	}

	public String getEstadoCita() {
		return this.estadoCita;
	}

	public void setEstadoCita(String estadoCita) {
		this.estadoCita = estadoCita;
	}

	public Date getFechaCita() {
		return this.fechaCita;
	}

	public void setFechaCita(Date fechaCita) {
		this.fechaCita = fechaCita;
	}

	public Time getHoraCita() {
		return this.horaCita;
	}

	public void setHoraCita(Time horaCita) {
		this.horaCita = horaCita;
	}

}