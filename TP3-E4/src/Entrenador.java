
public class Entrenador extends Integrante {
	private int federacion;

	public Entrenador(String nombre, String apellido, int pasaporte, String estado, int a�o, int mes, int dia,
			int federacion) {
		super(nombre, apellido, pasaporte, estado, a�o, mes, dia);
		this.federacion = federacion;
	}
	
	
}
