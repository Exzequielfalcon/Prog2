package productos;

import java.math.BigInteger;
import java.sql.Date;
import java.time.LocalDate;

public class ProductosRefrigerados extends ProductosFrescos {
	protected BigInteger codigo;
	protected int temp;
	
	public ProductosRefrigerados(Date vecimiento, BigInteger lote, LocalDate envasado, String granja, BigInteger codigo,
			int temp) {
		super(vecimiento, lote, envasado, granja);
		this.codigo = codigo;
		this.temp = temp;
	}
	
	
}
