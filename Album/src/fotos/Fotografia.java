package fotos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fotografia extends Fotos{
	private int id;
	private String titulo;
	private double peso;
	private List<String> personas;
	private String fecha;
	private String comentarios;
	
	@Override
	public double getPeso() {
		return this.peso;
	}
	@Override
	public int getCantidad() {
		return 1;
	}
	@Override
	public List<String> getPersonas() {
		return new ArrayList<String>(this.personas);
	}
	
	public Fotografia getFotografia() {
		return this;
	}
	
	protected List<Fotografia> getFotos() {
		 List<Fotografia> a = new ArrayList<Fotografia>();
		 a.add(this);
		 return a;
	}
	
}
