package dds.ejercicios.mozoLaCuenta;

public class Enojado implements Humor {

	@Override
	public double cuantoPagoEnTotal(Cliente c) {
		return c.getConsumo();
	}

}
