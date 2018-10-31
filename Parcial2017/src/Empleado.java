import java.util.List;

public abstract class Empleado {
	protected String nombre;
	protected String apellido;
	protected int edad;
	
	
	
	public Empleado(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	public abstract int getSueldo();
	public abstract List getEspecialidad();
}
