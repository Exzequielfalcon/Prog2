import java.util.Comparator;

public class CompareName implements Comparator<Empleado> {

	public int compare(Empleado e1,Empleado e2) {
		// TODO Auto-generated method stub
		if(e1.getApellido().compareTo(e2.getApellido())==0) {
			return e1.getNombre().compareTo(e2.getNombre());
		} else return e1.getApellido().compareTo(e2.getApellido());
	}

}
