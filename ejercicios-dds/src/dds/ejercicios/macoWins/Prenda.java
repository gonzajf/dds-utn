package dds.ejercicios.macoWins;

public abstract class Prenda {

	private static double valorFijoDelNegocio = 50;
	private double precioBase;
	private double tasaDeImportacion;
	private TipoPrenda tipoPrenda;

	public Prenda(TipoPrenda prenda){
		this.tipoPrenda = prenda;
	}
	
	public static double getValorfijodelnegocio() {
		return valorFijoDelNegocio;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public double getTasaDeImportacion() {
		return tasaDeImportacion;
	}

	public void setTasaDeImportacion(double tasaDeImportacion) {
		this.tasaDeImportacion = tasaDeImportacion;
	}
	
	public double getPrecioFinal(){
		return (valorFijoDelNegocio + this.tipoPrenda.getPrecioBase())*this.getTasaDeImportacion();
	}

	public TipoPrenda getTipoPrenda() {
		return tipoPrenda;
	}

	public void setTipoPrenda(TipoPrenda tipoPrenda) {
		this.tipoPrenda = tipoPrenda;
	}
	
}
