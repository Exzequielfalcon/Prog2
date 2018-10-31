package Computos;

import java.util.ArrayList;

public class Computadora extends Computos{
	private ArrayList<Procesos> procesos;

	public Computadora(String nombre, int memoria, ArrayList<Procesos> procesos) {
		super(nombre, memoria);
		this.procesos = procesos;
	}
	
	public void AgregarProceso(Procesos p) {
		for (int i=0;i<procesos.size();i++) {
			if(procesos.get(i)<p.)
		}
		procesos.add(p);
	}
	
	
}
