package kiosco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Producto extends Items{
	private String nombre;
	private HashMap<String,Object> desc;
	private int cantidad;
	private double precio;
	
	
	
	public Producto(String nombre, int cantidad, double precio) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
		this.desc= new HashMap<>();
	}
	
	public void addCaracteristica(String s, Object o) {
		this.desc.put(s, o);
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public double getPrecio() {
		return this.precio;
	}
	
	public double getPrecios() {
		return this.precio*this.cantidad;
	}
	
	public boolean contienePalabra(String s) {
		if(desc.containsKey(s)) {
			return true;
		}
		if(desc.containsValue(s)) {
			return true;
		}
		return false;
	}
	
	public List<Producto> getProductos(){
		ArrayList<Producto> aux = new ArrayList();
		aux.add(this);
		return aux;
	}
	
	public boolean containsKey(String s) {
		return desc.containsKey(s);
	}
	
	public Object getValue(String s) {
		return desc.get(s);
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", desc=" + desc + ", cantidad=" + cantidad + ", precio=" + precio + "]";
	}
	
	
}
