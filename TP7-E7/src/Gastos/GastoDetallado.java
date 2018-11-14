package Gastos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Condicion.Condicion;

public class GastoDetallado extends Dinero{
	protected ArrayList<Gasto> gastos = new ArrayList<>();
	
	public GastoDetallado(int fecha, int monto, Gasto gasto) {
		super(fecha,monto);
		gastos.add(gasto);
	}
	
	public int getMonto() {
		int aux=0;
		for (Gasto i:gastos) {
			aux+=i.getMonto();
		}
		return aux;
	}
	
	public List<Gasto> getTotal(Condicion c){
		ArrayList<Gasto> lista = new ArrayList<>();
		for (Gasto i:gastos) {
			if(c.cumple(i)) {
				lista.add(i);
			}
		}
		return lista;
	}
	
	public HashMap<String,String> getDetalles(){
		HashMap<String,String> det = new HashMap<String,String>();
		for(Gasto i:gastos) {
			det.putAll(i.getDetalles());
		}
		return det;
	}
}
