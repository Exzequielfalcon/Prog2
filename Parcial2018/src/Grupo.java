import java.util.ArrayList;

public class Grupo extends User {
	ArrayList<User> uss;
	
	public void addNotificacion(Notificacion n) {
		for (int i=0;i<uss.size();i++) {
			uss.get(i).addNotificacion(n);
		}
	}
}
