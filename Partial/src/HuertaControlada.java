import java.util.ArrayList;

public class HuertaControlada extends Huerta {
	private ArrayList<Producto> nocivos;
	private int menora=2000;
	
	public HuertaControlada(int sup, Administrador admin, int menora) {
		super(sup, admin);
		this.menora = menora;
	}
	
	
}
