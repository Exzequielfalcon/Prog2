
public class Masajistas extends Integrante {
	private String titulo;
	private int añosxp;
	
	public Masajistas(String nombre, String apellido, int pasaporte, String estado, int año, int mes, int dia,
			String titulo, int añosxp) {
		super(nombre, apellido, pasaporte, estado, año, mes, dia);
		this.titulo = titulo;
		this.añosxp = añosxp;
	}
	
	
}
