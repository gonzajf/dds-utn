package dds.ejercicios.regaloCumple;

import java.time.MonthDay;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonaTest {

	private Persona gonza;
	private Regalo unRegalo;
	private Persona dani;
	private Persona facu;
	
	@Before
	public void init(){
		gonza = new Persona("gonza", MonthDay.of(5, 16), new PreferenciaCualquierCosa());
		unRegalo = new Regalo(150, MonthDay.of(1, 10), true, false);
		dani = new Persona("dani", MonthDay.of(1,10), new PreferenciaRegaloElDiaDelCumple());
		facu = new Persona("facu", MonthDay.of(7, 23), new PreferenciaRopa());
	}
	  
	@Test
	 public void aGonzaLeGustaElRegalo() {
		Assert.assertTrue(gonza.leGustaElRegalo(unRegalo));
	  }
	
	@Test
	 public void aDaniLeGustaElRegalo() {
		Assert.assertTrue(dani.leGustaElRegalo(unRegalo));
	  }
	
	@Test
	 public void aFacuNoLeGustaElRegalo() {
		Assert.assertFalse(facu.leGustaElRegalo(unRegalo));
	  }
	
	@Test
	public void aFacuLeGustaElRegaloCaro(){
		facu.setTipoPreferencia(new PreferenciaRegaloCaro());
		Assert.assertTrue(facu.leGustaElRegalo(unRegalo));
	}
	
}
