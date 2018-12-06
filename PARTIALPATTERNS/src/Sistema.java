import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import Notificacion.Notificacion;
import empleados.User;

public class Sistema {
	private HashSet<User> usuarios = new HashSet<>();
	
	public Sistema(User usuario) {
		this.usuarios.add(usuario);
	}
	
	public void addUser(User a) {
		usuarios.add(a);
	}
	
	public void enviarNotificacion(Notificacion n, User u) {
		u.getNotificacion(n);
	}
	
	public List<User> getUsuarios(){
		HashSet<User> aux = new HashSet<User>();
		for (User i:usuarios) {
			aux.addAll(i.getEmpleados());
		}
		
		return new ArrayList<User>(aux);
	}
}
