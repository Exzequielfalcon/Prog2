package kiosco;

import java.util.ArrayList;
import java.util.List;

public class Kiosco {
	private List<Items> productos;
	
	public Kiosco(Producto p) {
		productos= new ArrayList<>();
		productos.add(p);
	}
	
	public List<Items> getProductos(){
		ArrayList<Items> aux = new ArrayList<>();
		for(Items p:productos) {
			aux.addAll(p.getProductos());
		}
		return aux;
	}
	
	public double getPrecios() {
		double aux=0;
		for(Items p:productos) {
			aux+=p.getPrecios();
		}
		return aux;
	}
	
	
}
