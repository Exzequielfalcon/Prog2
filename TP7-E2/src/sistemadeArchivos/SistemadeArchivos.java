package sistemadeArchivos;

public abstract class SistemadeArchivos {
	protected String nombre;
	protected String fechaC;
	
	public SistemadeArchivos(String nombre, String fechaC) {
		this.nombre = nombre;
		this.fechaC = fechaC;
	}
	
	public abstract double getTamanio();
}
