package Gastos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Condicion.Condicion;

public class Gasto extends Dinero{
	private String descripcion;
	
	public Gasto(int fecha, int monto, String descripcion) {
		super(fecha, monto);
		this.setDescripcion(descripcion);
	}
	
	public int getMonto() {
		return this.monto;
	}
	
	public int getFecha() {
		return this.fecha;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Gasto> getTotal(Condicion c) {
		ArrayList<Gasto> aux = new ArrayList<>();
		if(c.cumple(this)) {
			aux.add(this);
		}
		return aux;
	}
	
	public List<Gasto> getGasto(){
		List<Gasto> a =new ArrayList<Gasto>();
		a.add(this);
		return a;
	}
	
	public HashMap<String,String> getDetalles(){
		return new HashMap<String,String>(this.detalles);
	}
}
