package elemGeometricos;

public class Rectangulo extends PuntoGeometrico {
	
	public Rectangulo (int x, int y) {
		super(x,y);
	}
	
	public int Area() {
		return this.getX()*this.getY();
	}
	
	public int Compara(Rectangulo r1) {
		if (this.Area()<r1.Area()) {
			return 1;
		} else if(this.Area()==r1.Area()) {
			return 0;
		} else {
			return -1;
		}
	}
	
	public void Invertir() {
		int aux=getX();
		this.setX(getY());
		this.setY(aux);
	}
	
	public boolean EsCuadrado() {
		return getX()==getY()?true:false;
	}
	
	public int LadoSuperior() {
		return getX();
	}
	
	public String Posicion() {
		if(!EsCuadrado()) {
		return getX()>getY()?"Acostado":"Parado";
		} else return "Es cuadrado";
	}
}	 
