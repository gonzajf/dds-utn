package dds.ejercicios.regaloCumple;

import java.time.MonthDay;

public class Regalo {

	private double valor;
	private MonthDay fechaEntrega;
	private boolean juguete;
	private boolean ropa;

	public Regalo(double valor, MonthDay fechaEntrega, boolean juguete, boolean ropa){
		this.valor = valor;
		this.fechaEntrega = fechaEntrega;
		this.juguete = juguete;
		this.ropa = ropa;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public MonthDay getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(MonthDay fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public boolean isJuguete() {
		return juguete;
	}
	public void setJuguete(boolean juguete) {
		this.juguete = juguete;
	}
	public boolean isRopa() {
		return ropa;
	}
	public void setRopa(boolean ropa) {
		this.ropa = ropa;
	}

	public boolean esCaro() {
		return this.getValor() > 100;
	}
}
