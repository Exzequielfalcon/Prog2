package Sueldos;

import java.text.DecimalFormat;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Empleado e1= new Empleado("juan","asd",new SueldoExtra(1000,3,20));
		Empleado e2= new Empleado("Florencia","Kilowats",new SueldoVentas(4000,10,100));
		System.out.println(e1.getSueldo());
		System.out.println(e2);
		String a="1";
		
	}

}
