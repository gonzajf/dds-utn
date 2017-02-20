package dds.ejerccicios.clientesBanco;

public interface CriterioLimites {

	public double getLimiteDeCredito(Cliente c);
	public double getLimiteDeCompraConTarjeta(Cliente c);
	public double getLimiteDeDescubierto(Cliente cliente);
}
