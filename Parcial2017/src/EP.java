import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EP extends Empleado {
	private int sueldo;
	private int antiguedad;
	private ArrayList<Empleado> empleados = new ArrayList();
	
	public EP(String nombre, String apellido, int edad, int sueldo, int antiguedad) {
		super(nombre, apellido, edad);
		this.sueldo = sueldo;
		this.antiguedad = antiguedad;
	}
	
	public int getGastos() {
		return 2;
	}
	
	public int getSueldo() {
		int b=0;
		for (int i=0;i<this.empleados.size();i++) {
			b+=this.empleados.get(i).getSueldo();
		}
		return b+this.sueldo;
	}
	
	public List<String> getEspecialidad() {
		ArrayList<String> aux = new ArrayList();
		for (int i=0;i<this.empleados.size();i++) {
			ArrayList<String> e = new ArrayList(empleados.get(i).getEspecialidad());
			for (int j=0;j<this.empleados.size();j++) {
				aux.add(e.get(i));
			}
		}
		return aux;
	}
	
	public void addEmpleado(Empleado e) {
		this.empleados.add(e);
	}
	
	public List<Empleado> OrdenadoNombre(Comparator<Empleado> comparator) {
		ArrayList<Empleado> e = new ArrayList<>(this.empleados);
		Collections.sort(e, comparator);
		return e;
	}
}
