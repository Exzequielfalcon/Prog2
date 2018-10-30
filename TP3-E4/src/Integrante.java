import java.util.Calendar;

public abstract class Integrante {
	protected String nombre;
	protected String apellido;
	protected int pasaporte;
	protected Calendar nacimiento;
	protected String estado;
	
	public Integrante(String nombre, String apellido, int pasaporte, String estado, int a�o, int mes,int dia) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.pasaporte = pasaporte;
		setNacimiento(a�o,mes,dia);
		this.estado = estado;
	}

	public boolean Disponible() {
		return (this.estado=="En pais de origen")?true:false;
	}
	
	private void setNacimiento(int a�o, int mes, int dia) {
		this.nacimiento = Calendar.getInstance();
		this.nacimiento.set(a�o, mes, dia);
	}
}
