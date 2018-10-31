import java.util.ArrayList;

public class Votante {
	private String nombre;
	private int dni;
	private boolean voto;
	private ArrayList<String> a=new ArrayList();
	
	
	public ArrayList<String> getA() {
		return a;
	}

	public void setA(ArrayList<String> a) {
		this.a = a;
	}

	public Votante(String nombre, int dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public void Votar(Mesas m, String a) {
		if((m.getDesdedni()<=this.dni)&&(m.getHastadni()>=this.dni)) {
			if((m.getVotos()==null)) {
				m.AddVote(a,this.dni);
			} else if (!(m.getVotos().contains(this.dni))) {
				m.AddVote(a,this.dni);
			} else System.out.println("Ya votaste");
		} else System.out.println("Esta no es tu mesa");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		result = prime * result + dni;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + (voto ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Votante other = (Votante) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (dni != other.dni)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (voto != other.voto)
			return false;
		return true;
	}
	
	
}
