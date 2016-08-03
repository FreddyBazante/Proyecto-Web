package ec.edu.epn.modelo.jpa;

import java.io.Serializable;

import javax.persistence.*;

import java.sql.Time;


/**
 * The persistent class for the horario database table.
 * 
 */
@Entity
@Table(name="bucalcenter.horario")
public class Horario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_HORARIO")
	private int idHorario;

	@Column(name="HORAFIN_HORARIO")
	private Time horafinHorario;

	@Column(name="HORAINICIO_HORARIO")
	private Time horainicioHorario;

	@Column(name="JUEVES_HORARIO")
	private Time juevesHorario;

	@Column(name="LUNES_HORARIO")
	private Time lunesHorario;

	@Column(name="MARTES_HORARIO")
	private Time martesHorario;

	@Column(name="MIERCOLES_HORARIO")
	private Time miercolesHorario;

	@Column(name="VIERNES_HORARIO")
	private Time viernesHorario;

	public Horario() {
	}

	public int getIdHorario() {
		return this.idHorario;
	}

	public void setIdHorario(int idHorario) {
		this.idHorario = idHorario;
	}

	public Time getHorafinHorario() {
		return this.horafinHorario;
	}

	public void setHorafinHorario(Time horafinHorario) {
		this.horafinHorario = horafinHorario;
	}

	public Time getHorainicioHorario() {
		return this.horainicioHorario;
	}

	public void setHorainicioHorario(Time horainicioHorario) {
		this.horainicioHorario = horainicioHorario;
	}

	public Time getJuevesHorario() {
		return this.juevesHorario;
	}

	public void setJuevesHorario(Time juevesHorario) {
		this.juevesHorario = juevesHorario;
	}

	public Time getLunesHorario() {
		return this.lunesHorario;
	}

	public void setLunesHorario(Time lunesHorario) {
		this.lunesHorario = lunesHorario;
	}

	public Time getMartesHorario() {
		return this.martesHorario;
	}

	public void setMartesHorario(Time martesHorario) {
		this.martesHorario = martesHorario;
	}

	public Time getMiercolesHorario() {
		return this.miercolesHorario;
	}

	public void setMiercolesHorario(Time miercolesHorario) {
		this.miercolesHorario = miercolesHorario;
	}

	public Time getViernesHorario() {
		return this.viernesHorario;
	}

	public void setViernesHorario(Time viernesHorario) {
		this.viernesHorario = viernesHorario;
	}

}