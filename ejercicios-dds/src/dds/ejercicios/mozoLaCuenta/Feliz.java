package dds.ejercicios.mozoLaCuenta;

public class Feliz implements Humor {

	@Override
	public double cuantoPagoEnTotal(Cliente c) {
		return c.getConsumo()*1.25;
	}

}
