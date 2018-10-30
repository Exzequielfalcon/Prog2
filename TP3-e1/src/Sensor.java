
public class Sensor {
	private boolean on;
	private String nombre;
	
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Sensor(boolean on, String nombre) {
		this.on = on;
		this.nombre = nombre;
	}
	
	
}
