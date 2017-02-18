package dds.ejercicios.regaloCumple;

import java.time.MonthDay;

public class Persona {
	
	private MonthDay fechaCumple;
	private String nombre;
	private TipoPreferencia tipoPreferencia;

	public Persona(String nombre, MonthDay fechaCumple, TipoPreferencia preferencia){
		this.nombre = nombre;
		this.fechaCumple = fechaCumple;
		this.tipoPreferencia = preferencia;
	}
	
	public boolean leGustaElRegalo(Regalo unRegalo) {
		return this.tipoPreferencia.leGustaElRegalo(unRegalo, this);
	}

	public MonthDay getFechaCumple() {
		return fechaCumple;
	}

	public void setFechaCumple(MonthDay fechaCumple) {
		this.fechaCumple = fechaCumple;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public TipoPreferencia getTipoPreferencia() {
		return tipoPreferencia;
	}

	public void setTipoPreferencia(TipoPreferencia tipoPreferencia) {
		this.tipoPreferencia = tipoPreferencia;
	}
	
}
