package elemGeometricos;

public class PuntoGeometrico {
	private int x=0;
	private int y=0;
	
	public void Desplazar(int x, int y) {
		this.x+=x;
		this.y+=y;
	}
	
	public double DistanciaE(double x2,double y2) {
		double x=(double)this.x;
		double y=(double)this.y;
		return Math.sqrt((Math.pow(x-y, 2)+(Math.pow(x2-y2, 2))));
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public PuntoGeometrico(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "PuntoGeometrico [x=" + x + ", y=" + y + "]";
	}
	
	
	
}
