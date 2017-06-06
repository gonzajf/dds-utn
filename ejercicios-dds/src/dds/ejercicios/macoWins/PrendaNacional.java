package dds.ejercicios.macoWins;

public class PrendaNacional extends Prenda {

	private static double tasaNacional = 1;
	
	public PrendaNacional(TipoPrenda prenda){
		super(prenda);
		this.setTasaDeImportacion(tasaNacional);
	}
	
}
