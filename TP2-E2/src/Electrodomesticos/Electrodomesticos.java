package Electrodomesticos;

public class Electrodomesticos {
	private String nombre;
	private double precio=100;
	private String color="gris plata";
	private int energia=10;
	private double peso=2;
	
	public Electrodomesticos(String nombre) {
		this.nombre = nombre;
	}

	public Electrodomesticos(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public Electrodomesticos(String nombre, double precio, String color) {
		this.nombre = nombre;
		this.precio = precio;
		this.color = color;
	}

	public Electrodomesticos(String nombre, double precio, String color, int energia) {
		this.nombre = nombre;
		this.precio = precio;
		this.color = color;
		this.energia = energia;
	}

	public Electrodomesticos(String nombre, double precio, String color, int energia, double peso) {
		this.nombre = nombre;
		this.precio = precio;
		this.color = color;
		this.energia = energia;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public boolean BajoConsumo() {
		return (this.energia < 45)?true:false;
	}
	
	public double Balance() {
		return (this.precio/this.peso);
	}
	
	public boolean AltaGama() {
		return (Balance()>3?true:false);
	}
}
