package Sueldos;

public class Sueldo {
	protected int monto;

	public Sueldo(int monto) {
		this.monto = monto;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "Sueldo [monto=" + monto + "]";
	}
	
	
}
