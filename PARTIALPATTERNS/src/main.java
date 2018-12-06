import empleados.Empleado;
import empleados.Grupo;
import empleados.User;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado e1 = new Empleado("Juan1",18,"GFo");
		Empleado e2 = new Empleado("Juan2",18,"GFo");
		Empleado e3 = new Empleado("Juan3",18,"GFo");
		Empleado e4 = new Empleado("Juan4",18,"GFo");
		Empleado e5 = new Empleado("Juan5",18,"GFo");
		Grupo g1 = new Grupo("El", e1);
		Grupo g2 = new Grupo("El", e2);
		g1.addUser(e3);
		g1.addUser(e4);
		g2.addUser(e5);
		g2.addUser(g1);
		g2.addUser(e1);
		System.out.println(g2.getCantUsers());
		Sistema s = new Sistema(g1);
		s.addUser(g2);
		s.addUser(e1);
		for(User i:s.getUsuarios()) {
			System.out.println(i.getNombre());
		}
	}

}
