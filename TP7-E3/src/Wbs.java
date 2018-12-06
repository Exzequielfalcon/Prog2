import java.util.List;

public abstract class Wbs {
	protected String descripcion;
	protected Recurso recursos;
	
	public abstract List<Wbs> getTareas();
}
