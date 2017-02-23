package dds.ejercicios.mozoLaCuenta;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteTest {

	private Cliente cliente;
	
	@Before
	public void init(){
		cliente = new Cliente(350);
		cliente.setLoQueTieneEnELBolsillo(10);
	}
	
	@Test
	 public void clienteFeliz() {
		cliente.setHumor(new Feliz());
		Assert.assertEquals(437.5, cliente.cuantoPagoEnTotal(), 0);
	  }
	
	@Test
	 public void clienteEnojado() {
		cliente.setHumor(new Enojado());
		Assert.assertEquals(350, cliente.cuantoPagoEnTotal(), 0);
	  }

	@Test
	 public void clienteIndiferente() {
		cliente.setHumor(new Indiferente());
		Assert.assertEquals(360, cliente.cuantoPagoEnTotal(), 0);
	  }
}
