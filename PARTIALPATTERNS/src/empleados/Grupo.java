package empleados;

import java.util.HashSet;

import Notificacion.Notificacion;

public class Grupo extends User{
	private HashSet<User> empleados = new HashSet<>();
	
	public Grupo(String nombre, User miembro) {
		super(nombre);
		this.empleados.add(miembro);
	}
	
	public void getNotificacion(Notificacion n) {
		for (User i:empleados) {
			i.getNotificacion(n);
		}
	}

	public void addUser(User u) {
		this.empleados.add(u);
	}
	
	@Override
	public int getCantUsers() {
		int aux=0;
		for (User i:empleados) {
			aux+=i.getCantUsers();
		}
		return aux;
	}
	
	public int getCantMsjs() {
		int aux=0;
		for (User i:empleados) {
			aux+=i.getCantMsjs();
		}
		return aux;
	}
}
