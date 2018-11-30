package kiosco;

import java.util.List;

public abstract class Items {
	
	public abstract double getPrecio();
	public abstract double getPrecios();
	public abstract int getCantidad();
	public abstract boolean contienePalabra(String s);
	public abstract List<Producto> getProductos();
}
