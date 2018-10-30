package Sueldos;

public class Empleado {
	private String nombre;
	private String apellido;
	private Sueldo sueldo;
	
	public Empleado(String nombre, String apellido, Sueldo sueldo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldo= sueldo;
	}
	
	public int getSueldo() {
		return sueldo.getMonto();
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", sueldo=" + sueldo + "]";
	}
	
	
}
