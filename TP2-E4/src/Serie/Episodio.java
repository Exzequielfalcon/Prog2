package Serie;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Episodio {
	private String titulo;
	private String descripcion;
	private boolean flag;
	private int clasificacion;
	
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
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public int getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(int clasificacion) {
		this.clasificacion = clasificacion;
	}
	
	public Episodio(String titulo, String descripcion, boolean flag) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.flag = flag;
	}
	public Episodio(String titulo, String descripcion, boolean flag, int clasificacion) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.flag = flag;
		this.clasificacion = clasificacion;
		CheckClasf();
	}
	
	private void CheckClasf() {
		if (this.flag==false) {
			this.clasificacion=-1;
		}
	}
	
	public void Calificar() {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			System.out.println("Ingrese una clasificacion entre 1 y 5");
			int a=new Integer(entrada.readLine());
			while (a<1||a>5) {
				System.out.println("Ingrese una clasificacion entre 1 y 5");
			}
			this.clasificacion=a;
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
	}
	
	
	
}
