package circulo;

public class Circulo {

	double x=0,y=0,radio=1;

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	public Circulo(double x, double y, double radio) {
		super();
		this.x = x;
		this.y = y;
		this.radio = radio;
	}

	public Circulo() {}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	//Area Circulo PI*r^2
	
	public double calcularArea(double radio) {
		double area=Math.PI*Math.pow(radio,2);
		return area;
	}
	
	//L=2*PI*r
	
	public double calcularLongitud(double radio) {
		double longitud=2*Math.PI*radio;
		return longitud;
	}
	
	public void mostrarResultados() {
		
		System.out.println(calcularArea(radio)); 
		System.out.println(calcularLongitud(radio));
	}
	
	
	
	
}
