package Gastos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Condicion.Condicion;

public class GastoDetallado extends Dinero{
	protected ArrayList<Dinero> gastos = new ArrayList<>();
	
	public GastoDetallado(int fecha, int monto, Gasto gasto) {
		super(fecha,monto);
		gastos.add(gasto);
	}
	
	public int getMonto() {
		int aux=0;
		for (Dinero i:gastos) {
			aux+=i.getMonto();
		}
		return aux;
	}
	
	public List<Gasto> getTotal(Condicion c){
		ArrayList<Gasto> lista = new ArrayList<>();
		for (Dinero j:gastos) {
			lista.addAll(j.getGasto());
		}
		return lista;
	}
	
	public List<Gasto> getGasto(){
		List<Gasto> a = new ArrayList<>();
		for(Dinero i:gastos) {
			a.addAll(i.getGasto());
		}
		return a;
	}
	
	public HashMap<String,String> getDetalles(){
		HashMap<String,String> det = new HashMap<String,String>();
		for(Dinero i:gastos) {
			det.putAll(i.getDetalles());
		}
		return det;
	}
}
