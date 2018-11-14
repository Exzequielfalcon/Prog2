package Sistema;

import java.util.ArrayList;
import java.util.List;

import Condicion.Condicion;
import Gastos.Dinero;
import Gastos.Gasto;

public class Sistema {
	private ArrayList<Dinero> gastos;
	
	public Sistema(Dinero gastos) {
		this.gastos.add(gastos);

	}
	
	public List<Gasto> getTotal(Condicion c){
		ArrayList<Gasto> lista = new ArrayList<>();
		for (Dinero i:gastos) {
			lista.addAll(i.getTotal(c));
		}
		return lista;
	}
	
}
