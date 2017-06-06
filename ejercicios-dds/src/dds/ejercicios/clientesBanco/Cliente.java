package dds.ejercicios.clientesBanco;

public class Cliente {

	private double ingresosMensuales;
	private double saldoTotalCuentas;
	private double valorBienesDeclarados;
	private CriterioLimites criterio;


	public Cliente(double ingresos, double saldo, double bienes){
		this.ingresosMensuales = ingresos;
		this.saldoTotalCuentas = saldo;
		this.valorBienesDeclarados = bienes;
	}
	
	public double getIngresosMensuales() {
		return ingresosMensuales;
	}

	public void setIngresosMensuales(double ingresosMensuales) {
		this.ingresosMensuales = ingresosMensuales;
	}

	public double getSaldoTotalCuentas() {
		return saldoTotalCuentas;
	}

	public void setSaldoTotalCuentas(double saldoTotalCuentas) {
		this.saldoTotalCuentas = saldoTotalCuentas;
	}

	public double getValorBienesDeclarados() {
		return valorBienesDeclarados;
	}

	public void setValorBienesDeclarados(double valorBienesDeclarados) {
		this.valorBienesDeclarados = valorBienesDeclarados;
	}
	
	public CriterioLimites getCriterio() {
		return criterio;
	}
	
	public void setCriterio(CriterioLimites criterio) {
		this.criterio = criterio;
	}

	public double getLimiteDeCredito(){
		return this.getCriterio().getLimiteDeCredito(this);
	}

	public double getLimiteDeCompraConTarjeta(){
		return this.getCriterio().getLimiteDeCompraConTarjeta(this);
	}
	
	public double getLimiteDeDescubierto(){
		return this.getCriterio().getLimiteDeDescubierto(this);
	}
	
	public double getRiesgoTotal(){
		return this.getLimiteDeCredito() + this.getLimiteDeCompraConTarjeta() + this.getLimiteDeDescubierto();
	}
}
