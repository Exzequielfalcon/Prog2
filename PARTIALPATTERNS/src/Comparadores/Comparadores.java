package Comparadores;
import java.util.Comparator;

import empleados.User;
public abstract class Comparadores implements Comparator<User> {
	public abstract int compare(User u, User c);
}
