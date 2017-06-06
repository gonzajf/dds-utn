package dds.ejercicios.macoWins;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Macowins {

	private static Macowins macowins;
	private List<Venta> ventas = new ArrayList<Venta>();
	
	private Macowins(){		
	
	}
	
	public static Macowins getMacowins(){
		if(macowins == null){
			macowins = new Macowins();
		}
		return macowins;
	}
	
	public List<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}
	
	public void agregarVenta(Prenda prenda, int cantidad, LocalDate fecha){
		Venta v = new Venta();
		v.setPrenda(prenda);
		v.setCantidad(cantidad);
		v.setFecha(fecha);
		this.ventas.add(v);
	}
}
