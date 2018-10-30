package Serie;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Serie s1 = new Serie("Vikings","Hacha","YO","Accion",10);
		Episodio e1 = new Episodio("juancin","kasd",true,1);
		s1.getTemporada(1).setEpisodios(e1);
		System.out.println(s1.getTemporada(0).getEpisodios(1).getDescripcion());
	}

}
