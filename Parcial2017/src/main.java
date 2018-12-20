import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empresa e = new Empresa();
		EP ep1 = new EP("Juan","asd",12,1,2019);
		EP ep2 = new EP("miranda","asd",12,22,2019);
		EP ep3 = new EP("Juan","asd",12,1,2019);
		ep1.addEmpleado(new Programador("asd","Asd",1,1,1));
		ep1.addEmpleado(ep2);
		ep1.addEmpleado(ep3);
		e.addEmpleado(ep1);
		System.out.println(ep1.getSueldo());
		ArrayList<Empleado> es= (ArrayList<Empleado>) ep1.OrdenadoNombre(new CompareName());
		for(Empleado f:es) {
			System.out.println(f.nombre);
		}
	}

}
