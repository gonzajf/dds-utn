package dds.ejercicios.regaloCumple;

public class PreferenciaRopa extends TipoPreferencia{

	@Override
	public boolean leGustaElRegalo(Regalo regalo, Persona persona) {
		return regalo.isRopa();
	}

}
