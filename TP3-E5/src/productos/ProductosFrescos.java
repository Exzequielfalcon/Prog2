package productos;

import java.math.BigInteger;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Hashtable;

public class ProductosFrescos {
	protected Date vecimiento;
	protected BigInteger lote;
	protected LocalDate envasado;
	protected String granja;
	protected Hashtable producto;
	
	public ProductosFrescos(Date vecimiento, BigInteger lote, LocalDate envasado, String granja, Hashtable producto) {
		this.vecimiento = vecimiento;
		this.lote = lote;
		this.envasado = envasado;
		this.granja = granja;
		this.producto = producto;
	}
	
	
}
