package Notificacion;

import java.util.List;
import java.util.ArrayList;

import empleados.Empleado;

public class Notificacion {
	private ArrayList<String> mensaje = new ArrayList<String>();
	private Empleado de;
	private int fecha;
	
	public Notificacion(String mensaje, Empleado de, int fecha) {
		this.mensaje.add(mensaje);
		this.de = de;
		this.fecha = fecha;
	}
	
	public List<String> getMensaje(){
		return new ArrayList<String>(this.mensaje);
	}
	
	public boolean equals(Notificacion n) {
		int j=0;
		for (String i:this.mensaje) {
			if(!(i.equals(n.getMensaje().get(j)))) {
				return false;
			}
			j++;
		}
		return true;
	}
}
