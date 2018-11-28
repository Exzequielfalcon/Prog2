package sistemadeArchivos;

public class ArchivosComprimidos extends Directorio{
	
	private int compresion;

	public ArchivosComprimidos(String nombre, String fechaC, int compresion) {
		super(nombre, fechaC);
		this.compresion=compresion;
		// TODO Auto-generated constructor stub
	}
	
	public double getTamanio() {
		return super.getTamanio()/compresion;
	}
	
}	
