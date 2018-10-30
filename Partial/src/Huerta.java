import java.util.ArrayList;

public class Huerta {
	protected ArrayList<String> plagas = new ArrayList();
	protected ArrayList<String> cultivos = new ArrayList();
	protected int sup =0;
	protected Administrador admin;
	
	public Huerta(int sup, Administrador admin) {
		this.sup = sup;
		this.admin = admin;
	}

	public Huerta(Administrador admin) {
		this.admin = admin;
	}
	
	
	
	
}
