import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;

public abstract class Pedido {
	private String material;
	private Hashtable<String, String> ht= new Hashtable();
	private Date entrega;
	private String lugar;
	private Date pedido;
	
	public Pedido(String material, Date entrega, String lugar, Date pedido) {
		this.material = material;
		this.entrega = entrega;
		this.lugar = lugar;
		this.pedido = pedido;
	}
	
	public void addCaracteristica(String caracteristica, String valor) {
		this.ht.put(caracteristica, valor);
	}
	
	public String getCaracteristica(String caracteristica) {
		return ht.get(caracteristica);
	}
	
	public boolean tieneCaracteristica(String cara) {
		return ht.contains(cara);
	}
	
	public List<String> getCaracteristicas(){
		return new ArrayList<String> (this.ht.keySet());
	}
	
}
