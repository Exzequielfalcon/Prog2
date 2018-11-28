package sistemadeArchivos;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends SistemadeArchivos{
	
	List<SistemadeArchivos> directorios = new ArrayList<>();
	
	public Directorio(String nombre, String fechaC) {
		super(nombre, fechaC);
		// TODO Auto-generated constructor stub
	}
	
	public double getTamanio() {
		double aux=0;
		for (SistemadeArchivos s:directorios) {
			aux+=s.getTamanio();
		}
		return aux;
	}
}
