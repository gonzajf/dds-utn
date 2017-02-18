package dds.ejercicios.regaloCumple;

public class PreferenciaRegaloElDiaDelCumple extends TipoPreferencia{

	@Override
	public boolean leGustaElRegalo(Regalo regalo, Persona persona) {
		return regalo.getFechaEntrega().equals(persona.getFechaCumple());
	}


}
