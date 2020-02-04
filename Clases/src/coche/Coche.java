package coche;

public class Coche {
	String color, marca, matricula;
	int numero_puertas;
	
	public Coche(String color, String marca, String matricula, int numero_puertas) {
		super();
		this.color = color;
		this.marca = marca;
		this.matricula = matricula;
		this.numero_puertas = numero_puertas;
	}
	
	public String dameColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String dameMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String dameMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int dameNumero_puertas() {
		return numero_puertas;
	}
	public void setNumero_puertas(int numero_puertas) {
		this.numero_puertas = numero_puertas;
	}
	
	public void cambiarColor(String color) {
		String colores[]= {"Azul","Rojo","Verde","Amarillo","Negro","Blanco","Naranja","Morado","Gris"};
		System.out.println("El color actual de su coche es "+dameColor());
		System.out.println("¿De que color quieres pintar el coche? "+ " -1.Azul -2.Rojo -3 Verde -4.Amarillo -5.Negro -6.Blanco -7.Naranja -8.Morado -9.Gris");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
