import empleados.Empleado;
import empleados.Grupo;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado e1 = new Empleado("Juan",18,"GFo");
		Empleado e2 = new Empleado("Juan",18,"GFo");
		Empleado e3 = new Empleado("Juan",18,"GFo");
		Empleado e4 = new Empleado("Juan",18,"GFo");
		Empleado e5 = new Empleado("Juan",18,"GFo");
		Grupo g1 = new Grupo("El", e1);
		Grupo g2 = new Grupo("El", e2);
		g1.addUser(e3);
		g1.addUser(e4);
		g2.addUser(e5);
		g2.addUser(g1);
		g2.addUser(e1);
		System.out.println(g2.getCantUsers());
	}

}
