package aseguradora;

public class FIltroPorAtributo {
	private String clave;
	private Object valor;
	
	public FIltroPorAtributo(String c, Object v) {
		clave = c;
		valor = v;
	}
	
	public boolean seCumple(SeguroIndiv s) {
		return s.getAtributo(clave).equals(valor);
	}
}
