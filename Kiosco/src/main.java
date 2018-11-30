import java.util.ArrayList;
import java.util.List;

import CondicionListado.CondKeyValue;
import kiosco.Categoria;
import kiosco.Items;
import kiosco.Producto;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Categoria c1 = new Categoria();
		Producto p1 = new Producto("galletita",5,20);
		Producto p2 = new Producto("galletita",5,20);
		Producto p3 = new Producto("galletita",5,20);
		Producto p4 = new Producto("galletita",5,20);
		c1.setCondicionListado(new CondKeyValue("calorias",10));
		p1.addCaracteristica("calorias", 9);
		c1.addProducto(p1);
		c1.addProducto(p2);
		c1.addProducto(p3);
		c1.addProducto(p4);
		
		ShowBusqueda(c1.getProductos());
	}
	
	public static void ShowBusqueda(List<Producto> productos) {
		System.out.println("Busqueda "+"\n");
		for (Items p:productos) {
			System.out.println(p);
		}
		System.out.println("------------------------------\n");
	}

}
