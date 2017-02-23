package dds.ejercicios.macoWins;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrendaTest {

	private Prenda sacoImportado;
	
	@Before
	public void init(){
	
		sacoImportado = new PrendaImportada(new Saco());
	}
	
	@Test
	 public void precioPrendaImportada() {
		Assert.assertEquals(1755, sacoImportado.getPrecioFinal(), 0);
	  }
}
