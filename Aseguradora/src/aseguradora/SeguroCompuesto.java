package aseguradora;

import java.util.ArrayList;
import java.util.List;

public class SeguroCompuesto implements Seguro{
	protected double descuento;
	protected List<Seguro> seguros;
	
	public SeguroCompuesto(double descuento) {
		this.descuento=descuento;
	}
	
	public double getPrecio() {
		double aux=0;
		for(Seguro p:seguros) {
			aux+=p.getPrecio();
		}
		return aux + (aux * this.descuento/100);
	}
	
	public List<Seguro> getSeguros(Filtro f){
		ArrayList<Seguro> aux = new ArrayList<>();
		for (Seguro s:seguros) {
			if(s.contiene(f)) {
				aux.add(s);
			}
		}
		return aux;
	}
	
	public boolean contiene(Filtro f) {
		for(Seguro s:seguros) {
			if(s.contiene(f)) {
				return true;
			}
		}
		return false;
	}
}
