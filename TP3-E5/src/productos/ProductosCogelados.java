package productos;

import java.math.BigInteger;
import java.sql.Date;
import java.time.LocalDate;

public class ProductosCogelados extends ProductosRefrigerados {
	private Congelado congelado;

	public ProductosCogelados(Date vecimiento, BigInteger lote, LocalDate envasado, String granja, BigInteger codigo,
			int temp, Congelado congelado) {
		super(vecimiento, lote, envasado, granja, codigo, temp);
		this.congelado = congelado;
	}
	
	
}
