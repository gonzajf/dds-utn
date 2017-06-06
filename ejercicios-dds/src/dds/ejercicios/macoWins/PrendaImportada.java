package dds.ejercicios.macoWins;

public class PrendaImportada extends Prenda{
	
	private static double tasaImportada = 1.30;
	
	public PrendaImportada(TipoPrenda prenda){
		super(prenda);
		this.setTasaDeImportacion(tasaImportada);
	}

}
