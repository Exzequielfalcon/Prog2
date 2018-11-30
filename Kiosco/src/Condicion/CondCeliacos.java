package Condicion;

import kiosco.Producto;

public class CondCeliacos implements CondicionAgregado {
	private String palabra;
	
	public CondCeliacos(String palabra) {
		this.palabra=palabra;
	}
	
	public boolean cumple(Producto p) {
		return !(p.contienePalabra(palabra));
	}
}
