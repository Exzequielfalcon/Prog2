package Serie;

public class Serie {
	private String titulo;
	private String descripcion;
	private String creador;
	private String genero;
	private Episodio episodios[];
	private int temporada[];
	
	
	public Serie(String titulo, String descripcion, String creador, String genero, int[] temporada,
			Episodio[] episodios) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.creador = creador;
		this.genero = genero;
		this.temporada = temporada;
		this.episodios = episodios;
	}
	
	
}
