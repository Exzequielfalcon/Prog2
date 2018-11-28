import java.util.ArrayList;
import java.util.List;

public class Recurso {
	List<String> materiales = new ArrayList<>();
	List<String> personas = new ArrayList<>();
	
	public void addMaterial(String material) {
		materiales.add(material);
	}
	
	public void addPersona(String persona) {
		personas.add(persona);
	}
}
