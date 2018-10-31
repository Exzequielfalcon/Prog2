import java.util.ArrayList;

public class main {
	public static void main (String [] args) {
		Candidato c1 = new Candidato("Marcelo","Agachate","Conocelo");
		Mesas m1 = new Mesas("Hinojo","Fonavi","Escuela 11",1,10);
		Votante v1= new Votante("Juan",4);
		v1.Votar(m1, "Marcelo");
		System.out.println(m1.ContarVotos(c1));
		ArrayList<String> a= new ArrayList();
		ArrayList<String> b= new ArrayList();
		a.add("a");
		b.add("a");
		v1.getA().add("a");
		if(a.size()==v1.getA().size()) {
			System.out.println("as");
		}
	}
}
