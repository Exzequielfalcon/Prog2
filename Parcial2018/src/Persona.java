import java.util.ArrayList;

public class Persona extends User{
	int edad;
	int legajo;
	ArrayList<Notificacion> notificaciones = new ArrayList();
	
	public void addNotificacion(Notificacion n) {
		if (!(notificaciones.contains(n))) {
			notificaciones.add(n);
		}
	}
	
	public int contar() {
		return 1;
	}
	
	public List<Persona> buscar(Condicion c){
		ArrayList<Notificacion> salida = new ArrayList() {
			if(c.cumple(this)) {
				salida.add(this);
			}
			return sal;
		}
	}
}
