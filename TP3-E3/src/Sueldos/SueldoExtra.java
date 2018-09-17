package Sueldos;

public class SueldoExtra extends Sueldo {
	private int preciohoras;
	private int horas;

	public SueldoExtra(int monto, int horas, int preciohoras) {
		super(monto);
		this.horas = horas;
		this.preciohoras = preciohoras;
		Calcular();
	}
	
	private void Calcular() {
		this.monto+=this.horas*this.preciohoras;
	}
}
