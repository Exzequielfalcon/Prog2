package aseguradora;

public class FiltroPorPoliza extends Filtro{
	private String s;
	
	public boolean seCumple(SeguroIndiv i) {
		return i.getTipopoliza().equals(s);
	}
}
