package dds.ejerccicios.clientesBanco;

public class CriterioArriesgado implements CriterioLimites {

	public double getLimiteDeCredito(Cliente c) {
		return c.getIngresosMensuales()*5 + c.getValorBienesDeclarados()/30 + c.getSaldoTotalCuentas()*2;
	}

	public double getLimiteDeCompraConTarjeta(Cliente c) {
		return c.getIngresosMensuales() + c.getSaldoTotalCuentas()/5 ;
	}

	public double getLimiteDeDescubierto(Cliente c) {
		return c.getValorBienesDeclarados()/30 + c.getIngresosMensuales()/2;
	}

}
