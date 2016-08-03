package ec.edu.epn.modelo.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the historia_clinica database table.
 * 
 */
@Entity
@Table(name="historia_clinica")
public class HistoriaClinica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_HISTORIACLINICA")
	private int idHistoriaclinica;

	@Column(name="ALTURA_HISTORIACLINICA")
	private int alturaHistoriaclinica;

	@Column(name="ANTECEDENTES_HISTORIACLINICA")
	private String antecedentesHistoriaclinica;

	@Column(name="MOTIVOCONSULTA_HISTORIACLINICA")
	private String motivoconsultaHistoriaclinica;

	@Column(name="PESO_HISTORIACLINICA")
	private int pesoHistoriaclinica;

	@Column(name="RIESGO_HISTORIACLINICA")
	private String riesgoHistoriaclinica;

	@Column(name="TIPOSANGRE_HISTORIACLINICA")
	private String tiposangreHistoriaclinica;

	public HistoriaClinica() {
	}

	public int getIdHistoriaclinica() {
		return this.idHistoriaclinica;
	}

	public void setIdHistoriaclinica(int idHistoriaclinica) {
		this.idHistoriaclinica = idHistoriaclinica;
	}

	public int getAlturaHistoriaclinica() {
		return this.alturaHistoriaclinica;
	}

	public void setAlturaHistoriaclinica(int alturaHistoriaclinica) {
		this.alturaHistoriaclinica = alturaHistoriaclinica;
	}

	public String getAntecedentesHistoriaclinica() {
		return this.antecedentesHistoriaclinica;
	}

	public void setAntecedentesHistoriaclinica(String antecedentesHistoriaclinica) {
		this.antecedentesHistoriaclinica = antecedentesHistoriaclinica;
	}

	public String getMotivoconsultaHistoriaclinica() {
		return this.motivoconsultaHistoriaclinica;
	}

	public void setMotivoconsultaHistoriaclinica(String motivoconsultaHistoriaclinica) {
		this.motivoconsultaHistoriaclinica = motivoconsultaHistoriaclinica;
	}

	public int getPesoHistoriaclinica() {
		return this.pesoHistoriaclinica;
	}

	public void setPesoHistoriaclinica(int pesoHistoriaclinica) {
		this.pesoHistoriaclinica = pesoHistoriaclinica;
	}

	public String getRiesgoHistoriaclinica() {
		return this.riesgoHistoriaclinica;
	}

	public void setRiesgoHistoriaclinica(String riesgoHistoriaclinica) {
		this.riesgoHistoriaclinica = riesgoHistoriaclinica;
	}

	public String getTiposangreHistoriaclinica() {
		return this.tiposangreHistoriaclinica;
	}

	public void setTiposangreHistoriaclinica(String tiposangreHistoriaclinica) {
		this.tiposangreHistoriaclinica = tiposangreHistoriaclinica;
	}

}