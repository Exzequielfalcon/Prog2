
public class Alarma {
	boolean vidrio;
	boolean movimiento;
	boolean puerta;
	
	public Alarma(boolean vidrio, boolean movimiento, boolean puerta) {
		this.vidrio = vidrio;
		this.movimiento = movimiento;
		this.puerta = puerta;
	}

	public boolean isVidrio() {
		return vidrio;
	}

	public void setVidrio(boolean vidrio) {
		this.vidrio = vidrio;
	}

	public boolean isMovimiento() {
		return movimiento;
	}

	public void setMovimiento(boolean movimiento) {
		this.movimiento = movimiento;
	}

	public boolean isPuerta() {
		return puerta;
	}

	public void setPuerta(boolean puerta) {
		this.puerta = puerta;
	}
	
	public boolean Comprobar() {
		if (this.vidrio||this.movimiento||this.puerta) {
			System.out.println("MEEEEEEEEEEE");
			return true;
		} else return false;
	}
	
	
}
