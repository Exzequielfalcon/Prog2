package empleados;

import Notificacion.Notificacion;

public abstract class User {
	protected String nombre;
	
	
	public User(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract int getCantUsers();
	public abstract void getNotificacion(Notificacion n);
	public abstract int getCantMsjs();
}
