package Sueldos;

public class SueldoVentas extends Sueldo {
	private int ventas;
	private int precioventas;
	
	public SueldoVentas(int monto,int ventas, int precioventas) {
		super(monto);
		this.ventas = ventas;
		this.precioventas = precioventas;
		Calcular();
	}
	
	private void Calcular() {
		this.monto+=(int) ((double)this.ventas*this.precioventas*0.10);
	}
}
