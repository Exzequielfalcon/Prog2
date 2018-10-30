import java.util.ArrayList;
import java.util.Iterator;

public class Fabrica {
	private String nombre;
	private ArrayList<Pedido> pedidos = new ArrayList();
	
	public Fabrica(String nombre) {
		this.nombre= nombre;
	}
	
	public void addPedido(Mueble m) {
		this.pedidos.add(m);
	}
	
	public Iterator getPedido() {
		return this.pedidos.iterator();
	}
	
}
