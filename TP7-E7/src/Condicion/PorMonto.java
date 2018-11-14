package Condicion;

import Gastos.Gasto;

public class PorMonto implements Condicion{

	private int monto;
	
	public PorMonto(int monto) {
		this.monto = monto;
	}
	
	public boolean cumple(Gasto g) {
		// TODO Auto-generated method stub
		return (this.monto>g.getMonto());
	}
	
}