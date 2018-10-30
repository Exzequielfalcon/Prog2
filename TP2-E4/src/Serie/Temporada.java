package Serie;

import java.util.ArrayList;

public class Temporada {
	private ArrayList<Episodio> episodios;
	private String titulo="";

	public Temporada(String titulo) {
		this.titulo = titulo;
	}

	public Episodio getEpisodios(int i) {
		return this.episodios.get(i);
	}

	public void setEpisodios(Episodio episodio) {
		this.episodios.add(episodio);
		System.out.println(this.episodios.size());
	}

	public void EpiVistosout() {
		int cont=0;
		for (int i=0;i<this.episodios.size();i++) {
			if(this.episodios.get(i).isFlag()) {
				cont++;
			}
		}
		System.out.println("La cantidad de episodios vistos es de "+cont);
	}
	
	public int EpiVistosret() {
		int cont=0;
		for (int i=0;i<this.episodios.size();i++) {
			if(this.episodios.get(i).isFlag()) {
				cont++;
			}
		}
		return cont;
	}
	
	public void Promediout() {
		double total=0;
		for (int i=0;i<this.episodios.size();i++) {
			total+=this.episodios.get(i).getClasificacion();
		}
		total=total/(this.episodios.size()-1);
		System.out.println("El promedio es de "+total);
	}
	
	public double Promedioret() {
		double total=0;
		for (int i=0;i<this.episodios.size();i++) {
			total+=this.episodios.get(i).getClasificacion();
		}
		total=total/(this.episodios.size()-1);
		return total;
	}
	
	public boolean Vistos() {
		for (int i=0;i<this.episodios.size();i++) {
			if(!this.episodios.get(i).isFlag()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		return "Temporada [episodios=" + episodios + ", titulo=" + titulo + "]";
	}
	
}
