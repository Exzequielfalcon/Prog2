
public class Masajistas extends Integrante {
	private String titulo;
	private int a�osxp;
	
	public Masajistas(String nombre, String apellido, int pasaporte, String estado, int a�o, int mes, int dia,
			String titulo, int a�osxp) {
		super(nombre, apellido, pasaporte, estado, a�o, mes, dia);
		this.titulo = titulo;
		this.a�osxp = a�osxp;
	}
	
	
}
