package dds.ejercicios.regaloCumple;

public class PreferenciaRegaloCaro extends TipoPreferencia {

	@Override
	public boolean leGustaElRegalo(Regalo regalo, Persona persona) {
		return regalo.esCaro() && (regalo.isJuguete() || regalo.isJuguete());
	}

}
