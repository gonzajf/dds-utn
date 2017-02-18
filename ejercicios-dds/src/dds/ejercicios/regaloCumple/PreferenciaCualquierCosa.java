package dds.ejercicios.regaloCumple;

public class PreferenciaCualquierCosa extends TipoPreferencia{

	@Override
	public boolean leGustaElRegalo(Regalo regalo, Persona persona) {
		return true;
	}
}
