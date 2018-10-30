
public class Libro {
	private int isbn;
	private String autor;
	private int año;
	private String genero;
	
	public Libro(int isbn, String autor, int año, String genero) {
		this.isbn = isbn;
		this.autor = autor;
		this.año = año;
		this.genero = genero;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public boolean equals(Libro l1) {
		if(this.isbn == l1.getIsbn()) {
			return true;
		} else return false;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", autor=" + autor + ", año=" + año + ", genero=" + genero + "]";
	}
	
	
}