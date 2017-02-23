package dds.ejercicios.mozoLaCuenta;

public class Indiferente implements Humor {

	@Override
	public double cuantoPagoEnTotal(Cliente c) {
		return c.getConsumo() + c.getLoQueTieneEnELBolsillo();
	}

}
