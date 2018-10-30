
public class OrdenarPorCaracteristica {
	private String c;
	
	public OrdenarPorCaracteristica(String s) {
		this.c = s;
	}
	
	public int compare(Pedido p1, Pedido p2) {
		if (p1.tieneCaracteristica(this.c)&&p2.tieneCaracteristica(this.c)) {
			return p1.getCaracteristica(this.c).compareTo(p2.getCaracteristica(this.c));
		} else return 0;
	}
}
