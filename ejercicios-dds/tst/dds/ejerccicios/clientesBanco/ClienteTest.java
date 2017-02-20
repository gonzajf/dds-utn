package dds.ejerccicios.clientesBanco;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteTest {

	private Cliente clienteArriesgado;
	private Cliente clienteMixto;
	
	@Before
	public void init(){
		clienteArriesgado = new Cliente(15000, 50000, 0);
		clienteArriesgado.setCriterio(new CriterioArriesgado());
		clienteMixto = new Cliente(15000, 50000, 0);
		clienteMixto.setCriterio(new CriterioMixto());
	}
	 
	@Test
	 public void limiteCreditoClienteArriesgado() {
		Assert.assertEquals(175000, clienteArriesgado.getLimiteDeCredito(), 0);
	  }
	
	@Test
	 public void limiteCmpraConTarjetaClienteArriesgado() {
		Assert.assertEquals(25000, clienteArriesgado.getLimiteDeCompraConTarjeta(), 0);
	  }
	
	@Test
	 public void limiteDescubiertoClienteArriesgado() {
		Assert.assertEquals(7500, clienteArriesgado.getLimiteDeDescubierto(), 0);
	  }
	
	@Test
	 public void limiteDeCompraConTarjetaEsIgualEnArriesgadoYMixto() {
		Assert.assertEquals(clienteArriesgado.getLimiteDeCompraConTarjeta(), clienteMixto.getLimiteDeCompraConTarjeta(), 0);
	  }
	
}
