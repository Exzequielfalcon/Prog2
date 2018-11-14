package Gastos;

import java.util.HashMap;
import java.util.List;

import Condicion.Condicion;

public abstract class Dinero {
	protected int fecha;
	protected int monto;
	protected HashMap<String,String> detalles = new HashMap<String,String>();
	
	public Dinero(int fecha, int monto) {
		this.fecha=fecha;
		this.monto=monto;
	}
	
	public abstract int getMonto();
	public abstract List<Gasto> getTotal(Condicion c);
	
	public abstract HashMap<String,String> getDetalles();
}
