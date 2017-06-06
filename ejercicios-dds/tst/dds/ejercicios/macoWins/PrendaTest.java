package dds.ejercicios.macoWins;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrendaTest {

	private Prenda sacoImportado;
	private Venta ventaSacoImportado;
	private Prenda pantalonNacional;
	private Macowins maco;
	
	@Before
	public void init(){
		sacoImportado = new PrendaImportada(new Saco());
		pantalonNacional = new PrendaNacional(new Pantalon());
		Macowins.getMacowins().agregarVenta(sacoImportado, 5, LocalDate.now());
		maco = Macowins.getMacowins();
		maco.agregarVenta(pantalonNacional, 2, LocalDate.now());
	}
	
	@Test
	 public void precioPrendaImportada() {
		Assert.assertEquals(1755, sacoImportado.getPrecioFinal(), 0);
	  }
	
	@Test
	 public void cantidadDeVentasEs2() {
		Assert.assertEquals(2, maco.getVentas().size(), 0);
	  }

}
