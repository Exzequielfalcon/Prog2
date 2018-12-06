package Condicion;

import java.util.HashSet;
import java.util.Map.Entry;

import Gastos.Gasto;

public class PorDetalle implements Condicion{
	private String key;
	private String value;
	
	public PorDetalle(String key, String value) {
		this.key = key;
		this.value = value;
	}
	
	public boolean cumple(Gasto g) {
		for(Entry<String,String> entry:g.getDetalles().entrySet()) {
			if((entry.getKey().equals(this.key) && entry.getValue().equals(this.value))) {
				return true;
			}
		}
		HashSet<String> e = new HashSet<>(g.getDetalles().keySet());
		HashSet<String> d = new HashSet<>(g.getDetalles().values());
 		return false;
	}
}
