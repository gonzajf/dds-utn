package dds.ejercicios.mozoLaCuenta;

public class Cliente {

	private double consumo;
	private Humor humor;
	private double loQueTieneEnELBolsillo;

	public Cliente(double consumo){
		this.consumo = consumo;
	}

	public double getConsumo(){
		return this.consumo;
	}
	
	public Humor getHumor() {
		return humor;
	}

	public void setHumor(Humor humor) {
		this.humor = humor;
	}
	
	public double cuantoPagoEnTotal(){
		return this.humor.cuantoPagoEnTotal(this);
	}

	public double getLoQueTieneEnELBolsillo() {
		return loQueTieneEnELBolsillo;
	}

	public void setLoQueTieneEnELBolsillo(double loQueTieneEnELBolsillo) {
		this.loQueTieneEnELBolsillo = loQueTieneEnELBolsillo;
	}
}
