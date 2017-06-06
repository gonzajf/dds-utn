package dds.ejercicios.clientesBanco;

public class CriterioConservador implements CriterioLimites {

	public double getLimiteDeCredito(Cliente c) {
		return c.getIngresosMensuales()*3 + c.getValorBienesDeclarados()/50;
	}

	public double getLimiteDeCompraConTarjeta(Cliente c) {
		return c.getIngresosMensuales()/2 + c.getSaldoTotalCuentas()/4;
	}

	public double getLimiteDeDescubierto(Cliente c) {
		return c.getLimiteDeDescubierto()/40;
	}
}
