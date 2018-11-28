package sistemadeArchivos;

public class Archivos extends SistemadeArchivos {
	
	private String fechaM;
	private double tamanio;
	
	public Archivos(String nombre, String fechaC) {
		super(nombre, fechaC);
		// TODO Auto-generated constructor stub
	}
	
	public double getTamanio() {
		return this.tamanio;
	}
	
}
