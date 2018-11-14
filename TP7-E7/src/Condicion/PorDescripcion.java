package Condicion;

import Gastos.Gasto;

public class PorDescripcion implements Condicion {
	private String descripcion;
	
	public PorDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public boolean cumple(Gasto g) {
		return (this.descripcion==g.getDescripcion());
	}
}
