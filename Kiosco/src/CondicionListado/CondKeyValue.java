package CondicionListado;

import kiosco.Producto;

public class CondKeyValue implements CondicionListado{
	
	private String key;
	private Integer value;
	
	public CondKeyValue(String key, int value) {
		this.key=key;
		this.value=value;
	}

	@Override
	public boolean cumple(Producto p) {
		if(p.containsKey(key)) {
			return ((int)p.getValue(key))<this.value;
		} else return false;
	}
	
}
