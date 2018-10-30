import java.util.Comparator;

public class CompareAutor implements Comparator<Libro>{
	
	public int compare(Libro l1, Libro l2) {
		return l1.getAutor().compareTo(l2.getAutor());
	}
}
