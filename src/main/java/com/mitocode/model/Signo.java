package com.mitocode.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="signo")
public class Signo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idSigno;
	
	@ManyToOne // FK
	@JoinColumn(name = "id_paciente", nullable = false, foreignKey = @ForeignKey(name = "FK_signo_paciente"))
	private Paciente paciente;
	
	@Column(name = "fecha", nullable = false)
	private LocalDateTime fecha;
	
	@Column(name = "temperatura", length = 100, nullable = true)
	private String temperatura;
	
	@Column(name = "pulso", length = 100, nullable = true)
	private String pulso;
	
	@Column(name = "ritmorespiratorio", length = 100, nullable = true)
	private String ritmoRespiratorio;

	public Integer getIdSigno() {
		return idSigno;
	}

	public void setIdSigno(Integer idSigno) {
		this.idSigno = idSigno;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}

	public String getPulso() {
		return pulso;
	}

	public void setPulso(String pulso) {
		this.pulso = pulso;
	}

	public String getRitmoRespiratorio() {
		return ritmoRespiratorio;
	}

	public void setRitmoRespiratorio(String ritmoRespiratorio) {
		this.ritmoRespiratorio = ritmoRespiratorio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idSigno == null) ? 0 : idSigno.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Signo other = (Signo) obj;
		if (idSigno == null) {
			if (other.idSigno != null)
				return false;
		} else if (!idSigno.equals(other.idSigno))
			return false;
		return true;
	}
	
	
	
	
	
}
