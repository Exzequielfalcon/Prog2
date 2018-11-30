package kiosco;

import java.util.ArrayList;
import java.util.List;

import Condicion.CondicionAgregado;
import CondicionListado.CondicionListado;

public class Categoria extends Items{
	private List<Items> productos;
	private CondicionAgregado c;
	private CondicionListado condi;
	
	public Categoria() {
		this.productos= new ArrayList<>();
	}
	
	public double getPrecio() {			//Retorna la suma de los precios de todos los productos
		double aux=0;
		for(Items p:productos) {
			aux+=p.getPrecio();
		}
		return aux;
	}
	
	public int getCantidad() {
		int aux=0;
		for(Items p:productos) {
			aux+=p.getCantidad();
		}
		return aux;
	}
	
	public void setCondicionAgregado(CondicionAgregado c) {
		this.c=c;
	}
	
	public void setCondicionListado(CondicionListado condi) {
		this.condi=condi;
	}
	
	public void addProducto(Producto p) {
		
		if (c!=null&&c.cumple(p)) {
			this.productos.add(p);
		}
	}
	
	public boolean contienePalabra(String s) {
		for(Items i:productos) {
			if(i.contienePalabra(s)) {
				return true;
			}
		}
		return false;
	}
	
	public double getPrecios() {
		double aux=0;
		for(Items p:productos) {
			aux+=p.getPrecios();
		}
		return aux;
	}
	
	public List<Producto> getProductos(){
		ArrayList<Producto> e = new ArrayList<>();
		if (condi!=null) {
			for(Items p:productos) {
				for(Producto l:p.getProductos()) {
					if(condi.cumple(l)) {
						e.add(l);
					}
				}
			}
		}else {
			for(Items i:productos) {
				e.addAll(i.getProductos());
			}
		}
		return e;
	}

	@Override
	public String toString() {
		return "Categoria [productos=" + productos + ", c=" + c + ", condi=" + condi + "]";
	}
	
	
	
}
