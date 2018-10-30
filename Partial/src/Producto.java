import java.util.ArrayList;
public class Producto {
	private ArrayList<String> plagas= new ArrayList();
	private ArrayList<String> observaciones = new ArrayList();
	private double precio;
	
	public boolean TrataPlaga(String plaga) {
		if(plagas.contains(plaga)) {
			return true;
	} else return false;
		
	
}	
