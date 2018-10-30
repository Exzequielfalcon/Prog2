
public class AlarmaLuminosa extends Alarma {
	boolean luz=false;

	public AlarmaLuminosa(boolean vidrio, boolean movimiento, boolean puerta) {
		super(vidrio, movimiento, puerta);
		ComprobarLuz();
	}
	
	public boolean isLuz() {
		return luz;
	}

	public void setLuz(boolean luz) {
		this.luz = luz;
	}

	public void ComprobarLuz() {
		if(Comprobar()) {
			this.luz=true;
		} else this.luz=false;
	}
}
