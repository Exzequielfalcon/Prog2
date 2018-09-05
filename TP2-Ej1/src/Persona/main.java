package Persona;

import java.time.LocalDate;
import java.util.Date;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("deprecation")
		Persona p1 = new Persona("Juan","Rodriguqz",19, new Date(2000,10,2),54376,'m',100,2);
		System.out.println(p1.CorporalMass());
		p1.Cumple();
		
		System.out.println(p1.getEdad());
		
		Date date = java.sql.Date.valueOf(LocalDate.now());
	}

}
