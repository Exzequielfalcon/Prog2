package empleados;

import java.util.HashSet;

import Notificacion.Notificacion;

public class Empleado extends User {
	private int legajo;
	private String apellido;
	private HashSet<Notificacion> notis= new HashSet<>();
	
	public Empleado(String nombre, int legajo, String apellido) {
		super(nombre);
		this.legajo = legajo;
		this.apellido = apellido;
	}

	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	@Override
	public int getCantUsers() {
		// TODO Auto-generated method stub
		return 1;
	}
	
	public void getNotificacion(Notificacion n) {
		this.notis.add(n);
	}
	
	public int getCantMsjs() {
		return this.notis.size();
	}

}
