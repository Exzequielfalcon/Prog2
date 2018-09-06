package elemGeometricos;

public class PuntoGeometrico {
	private int x=0;
	private int y=0;
	
	public void Desplazar(int x, int y) {
		this.x+=x;
		this.y+=y;
	}
	
	public double DistanciaE() {
		double x=(double)this.x;
		double y=(double)this.y;
		
	}
}
