package aseguradora;

import java.util.HashMap;
import java.util.List;

public class SeguroIndiv implements Seguro{
	private double precio;
	private int numeropoliza;
	private String tipopoliza;
	private HashMap<String, Object> atributos;
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getNumeropoliza() {
		return numeropoliza;
	}
	public void setNumeropoliza(int numeropoliza) {
		this.numeropoliza = numeropoliza;
	}
	public String getTipopoliza() {
		return tipopoliza;
	}
	public void setTipopoliza(String tipopoliza) {
		this.tipopoliza = tipopoliza;
	}
	
	public boolean esTipoSeguro(String s) {
		return this.tipopoliza.equals(s);
	}
	
	public Object getAtributo(String s) {
		return atributos.get(s);
	}
	
	public boolean contiene(Filtro f) {
		return f.seCumple(this);
	}
}
