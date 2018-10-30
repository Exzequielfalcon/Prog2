
public class Futbolista extends Integrante{
	private int posicion;
	private String pie;
	private int goles;
	
	public Futbolista(String nombre, String apellido, int pasaporte, String estado, int año, int mes, int dia,
			int posicion, String pie, int goles) {
		super(nombre,apellido,pasaporte,estado,año,mes,dia);
		this.posicion=posicion;
		this.pie=pie;
		this.goles=goles;
	}
	
	
	
}
