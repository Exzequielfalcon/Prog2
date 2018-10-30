import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Biblioteca b = new Biblioteca("La", new Libro(5,"juan",12,"ficcion"));
		b.addLibro(new Libro(3,"suan",12,"ficcion"));
		b.addLibro(new Libro(2,"auan",12,"ficcion"));
		b.MostrarAutores();
		b.OrdenarbyAutor();
		b.MostrarAutores();
		Iterator<String> it = b.Autores();
		System.out.println(it.next());
	}

}
