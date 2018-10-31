import java.util.ArrayList;
import java.util.List;

public class Programador extends Empleado{

	private int htrabajo;
	private int sueldoph;
	private ArrayList<String> especialidad;
	
	
	
	public Programador(String nombre, String apellido, int edad, int htrabajo, int sueldoph) {
		super(nombre, apellido, edad);
		this.htrabajo = htrabajo;
		this.sueldoph = sueldoph;
	}

	public int getSueldo() {
		return this.htrabajo*this.sueldoph;
	}
	
	public List getEspecialidad() {
		return new ArrayList<String>(this.especialidad);
	}
	
	public void addEspecialidad(String s) {
		this.especialidad.add(s);
	}
	
	public Empleado getEmpleado() {
		return this;
	}
}
