package aseguradora;

import java.util.List;

public interface Seguro {
	public abstract double getPrecio();
	public abstract boolean contiene(Filtro f);
}
