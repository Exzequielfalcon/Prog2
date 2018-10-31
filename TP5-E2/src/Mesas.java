import java.util.Hashtable;

public class Mesas {
	private String localidad;
	private String barrio;
	private String establecimiento;
	private Hashtable<Integer,String> votos = new Hashtable(); 
	private int desdedni;
	private int hastadni;
	
	public Mesas(String localidad, String barrio, String establecimiento, int desdedni, int hastadni) {
		this.localidad = localidad;
		this.barrio = barrio;
		this.establecimiento = establecimiento;
		this.desdedni = desdedni;
		this.hastadni = hastadni;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getBarrio() {
		return barrio;
	}
	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}
	public String getEstablecimiento() {
		return establecimiento;
	}
	public void setEstablecimiento(String establecimiento) {
		this.establecimiento = establecimiento;
	}

	public int getDesdedni() {
		return desdedni;
	}
	public void setDesdedni(int desdedni) {
		this.desdedni = desdedni;
	}
	public int getHastadni() {
		return hastadni;
	}
	public void setHastadni(int hastadni) {
		this.hastadni = hastadni;
	}
	
	public void AddVote(String voto, int dni) {
		votos.put(dni,voto);
	}
	
	public Hashtable<Integer, String> getVotos() {
		return votos;
	}
	
	public boolean HashEmpty() {
		return (this.votos.isEmpty())?true:false;
	}
	
	public int ContarVotos(String candidato) {
		int count=0;
		for (int key : this.votos.keySet()) {
			if(votos.get(key)==candidato) {
				count++;
			}
		}
		return count;
	}
	
	public int ContarVotos(Candidato candidato) {
		int count=0;
		for (int key : this.votos.keySet()) {
			if(votos.get(key)==candidato.getNombre()) {
				count++;
			}
		}
		return count;
	}
	
	
}
