package fotos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Album extends Fotos {
	private List<Fotos> fotos;

	@Override
	public double getPeso() {
		double aux=0;
		for(Fotos e:fotos) {
			aux+=e.getPeso();
		}
		return aux;
	}

	@Override
	public int getCantidad() {
		int aux=0;
		for(Fotos e:fotos) {
			aux+=e.getCantidad();
		}
		return aux;
	}

	@Override
	public List<String> getPersonas() {
		List<String> aux = new ArrayList<String>();
		for(Fotos e:fotos) {
			aux.addAll(e.getPersonas());
		}
		return aux;
	}
	
	protected List<Fotografia> getFotos(){
		List<Fotografia> a = new ArrayList<Fotografia>();
		 for(Fotos e:fotos) {
			 a.addAll(e.getFotos());
		 }
		 return a;
	}
	
	public Iterator getFotosIt() {
		 return this.getFotos().iterator();
	}
}
