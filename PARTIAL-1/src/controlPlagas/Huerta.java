package controlPlagas;

import java.util.ArrayList;

public class Huerta {
	protected ArrayList<String> plagas = new ArrayList();
	protected ArrayList<String> cultivos = new ArrayList();
	protected int sup;
	protected Administrador admin;
	
	public Huerta(Administrador admin) {
		this.admin = admin;
	}
	public Huerta(int sup, Administrador admin) {
		this.sup = sup;
		this.admin = admin;
	}
	
	public boolean ProductoUtilizable (Producto p) {
		
	}
}
