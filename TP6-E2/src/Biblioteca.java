import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Biblioteca {
	private ArrayList<Libro> libros= new ArrayList();
	private String nombre;
	
	public Biblioteca(String nombre, Libro l1) {
		this.nombre= nombre;
		this.libros.add(l1);
	}
	
	public void addLibro(Libro l1) {
		this.libros.add(l1);
	}
	
	public void OrdenarbyIsbn() {
		Collections.sort(this.libros, new CompareISBN());
	}
	
	public void OrdenarbyAutor() {
		Collections.sort(this.libros, new CompareAutor());
	}
	
	public void MostrarLibros() {
		for (int i=0; i<this.libros.size();i++) {
			System.out.println(this.libros.get(i).getIsbn());
		}
	}
	
	public void MostrarAutores() {
		for (int i=0; i<this.libros.size();i++) {
			System.out.println(this.libros.get(i).getAutor());
		}
	}
	
	public Iterator<String> Autores() {
		ArrayList<String> a= new ArrayList();
		for (int i=0;i<this.libros.size();i++) {
			a.add(this.libros.get(i).getAutor());
		}
		Iterator<String> acc = a.iterator();
		return acc;
	}
	
	public Iterator<Libro> getLibros() {
		return this.libros.iterator();
	}
	
	
}
