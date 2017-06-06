package dds.ejercicios.clientesBanco;

public class CriterioMixto implements CriterioLimites {

	private CriterioArriesgado arriesgado;
	private CriterioConservador conservador;
	
	public CriterioMixto(){
		this.arriesgado = new CriterioArriesgado();
		this.conservador = new CriterioConservador();
	}
	
	public double getLimiteDeCredito(Cliente c) {
		return this.conservador.getLimiteDeCredito(c);
	}

	public double getLimiteDeCompraConTarjeta(Cliente c) {
		return this.arriesgado.getLimiteDeCompraConTarjeta(c);
	}

	public double getLimiteDeDescubierto(Cliente c) {
		return this.conservador.getLimiteDeDescubierto(c);
	}

}
