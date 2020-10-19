package com.mitocode.exception;

import java.time.LocalDateTime;

public class ExceptionResponse {
	
	private LocalDateTime fecha;
	private String mensaje;
	private String detalles;

	public ExceptionResponse(LocalDateTime fechaHora, String mensaje, String detalles) {		
		this.fecha = fechaHora;
		this.mensaje = mensaje;
		this.detalles = detalles;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

}
