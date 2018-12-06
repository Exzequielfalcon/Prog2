package Gastos;

public abstract class TipodeGasto extends Dinero{
	Dinero d;

	public TipodeGasto(int fecha, int monto, Dinero d) {
		super(fecha, monto);
		this.d = d;
	}
}
