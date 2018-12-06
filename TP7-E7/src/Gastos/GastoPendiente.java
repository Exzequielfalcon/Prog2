package Gastos;

import java.util.HashMap;
import java.util.List;

import Condicion.Condicion;

public class GastoPendiente extends TipodeGasto{
	private int porcentaje;
	private int diasD;
	private boolean sepago;
	public GastoPendiente(int fecha, int monto, Dinero d, int porcentaje, int diasD) {
		super(fecha, monto, d);
		this.porcentaje = porcentaje;
		this.diasD = diasD;
	}
	@Override
	public int getMonto() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public List<Gasto> getTotal(Condicion c) {
		
	}
	@Override
	public HashMap<String, String> getDetalles() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
