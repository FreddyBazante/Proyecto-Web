package ec.edu.epn.modelo.jpa;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the especialidad database table.
 * 
 */
@Entity
@Table(name="bucalcenter.especialidad")
public class Especialidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_ESPECIALIDAD")
	private int idEspecialidad;

	@Column(name="NOMBRE_ESPECIALIDAD")
	private String nombreEspecialidad;

	public Especialidad() {
	}

	public int getIdEspecialidad() {
		return this.idEspecialidad;
	}

	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public String getNombreEspecialidad() {
		return this.nombreEspecialidad;
	}

	public void setNombreEspecialidad(String nombreEspecialidad) {
		this.nombreEspecialidad = nombreEspecialidad;
	}

}