package aseguradora;

import java.time.LocalDate;
import java.util.Date;

public class SeguroEspecialViajero extends SeguroCompuesto{
	
	private Date inicio;
	private Date fin;
	
	public SeguroEspecialViajero(double descuento, Date inicio, Date fin) {
		super(descuento);
		this.inicio=inicio;
		this.fin=fin;
	}
	
	public boolean estaActivo() {
		if((fin.compareTo(new Date())<0)&&(inicio.compareTo(new Date())>0)) {
			return true;
		}else return false;
	}
	
	public double getPrecio() {
		if(estaActivo()) {
			return this.getPrecio()*descuento;
		} else return 0;
	}
	
}
