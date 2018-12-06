package empleados;

import java.util.List;

import Notificacion.Notificacion;

public abstract class User {
	protected String nombre;
	
	
	public User(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract int getCantUsers();
	public abstract void getNotificacion(Notificacion n);
	public abstract int getCantMsjs();
	public abstract List<User> getEmpleados();
	public abstract String getNombre();
}
