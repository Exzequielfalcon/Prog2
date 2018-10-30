package Serie;

import java.util.Arrays;

public class Serie {
	private String titulo;
	private String descripcion;
	private String creador;
	private String genero;
	private Temporada temporada[];
	
	public Serie(String titulo, String descripcion, String creador, String genero, int cantemp) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.creador = creador;
		this.genero = genero;
		this.temporada = new Temporada[cantemp];
		IniTemporada();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Temporada getTemporada(int i) {
		return temporada[i];
	}

	public void setTemporada(Temporada[] temporada) {
		this.temporada = temporada;
	}
	
	public int SerieVistos() {
		int cont=0;
		for(int i=0;i<temporada.length;i++) {
			cont+=this.temporada[i].EpiVistosret();
		}
		return cont;
	}
	
	public double Promediout() {
		double total=0;
		for (int i=0;i<this.temporada.length;i++) {
			total+=this.temporada[i].Promedioret();
		}
		return total;
	}
	
	public boolean VisteTodos() {
		for(int i=0;i<temporada.length;i++) {  //si no lo vio retorna false
			if(temporada[i].Vistos()==false) {
				return false;
			}
		}
		return true;
	}

	public void IniTemporada() {
		for (int i=0;i<temporada.length;i++) {
			temporada[i]= new Temporada("");
		}
	}
	
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", descripcion=" + descripcion + ", creador=" + creador + ", genero="
				+ genero + ", temporada=" + Arrays.toString(temporada) + "]";
	}
	
	
}
