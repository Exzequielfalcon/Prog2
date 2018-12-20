package fotos;

import java.util.Iterator;
import java.util.List;

public abstract class Fotos {
	private String titulo;
	
	public abstract double getPeso();
	public abstract int getCantidad();
	public abstract List<String> getPersonas();
	protected abstract List<Fotografia> getFotos();
}	
