import java.util.ArrayList;
import java.util.HashSet;

import Notificacion.Notificacion;
import empleados.User;

public class Sistema {
	private HashSet<User> usuarios = new HashSet<User>();
	
	public Sistema(User usuario) {
		this.usuarios.add(usuario);
	}
	public void enviarNotificacion(Notificacion n, User u) {
		u.getNotificacion(n);
	}
	
	
}
