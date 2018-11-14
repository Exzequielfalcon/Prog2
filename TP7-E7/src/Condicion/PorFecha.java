package Condicion;

import Gastos.Gasto;

public class PorFecha implements Condicion{

	private int fecha;
	
	public PorFecha(int fecha) {
		this.fecha = fecha;
	}
	
	public boolean cumple(Gasto g) {
		// TODO Auto-generated method stub
		return (this.fecha==g.getFecha());
	}
	
}
