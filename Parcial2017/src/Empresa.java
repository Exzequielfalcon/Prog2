import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Empresa {
	ArrayList<Empleado> empleados;
	
	
	
	public Empresa() {
		this.empleados = new ArrayList();
	}


	public List<String> OrdenadoNombre() {
		ArrayList e = new ArrayList(this.empleados);
		Collections.sort(e, new CompareName());
		return e;
	}

	public void addEmpleado(Empleado e) {
		this.empleados.add(e);
	}
	
	
}
