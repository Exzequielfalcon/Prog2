package Comparadores;

import empleados.User;

public class PorMensajes extends Comparadores {
	public int compare(User u, User c) {
		return Integer.compare(u.getCantMsjs(), c.getCantMsjs());
	}
}
