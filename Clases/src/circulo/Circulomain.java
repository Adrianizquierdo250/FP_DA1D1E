package circulo;

import java.util.Scanner;

public class Circulomain {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("¿Cual es el radio del circulo 1?");
		double radio=sc.nextDouble();
		
	Circulo c1=new Circulo();
	
	System.out.println("El area del circulo es "+c1.calcularArea(radio)+" y su longitud es "+c1.calcularLongitud(radio));
	
	System.out.println("¿Cual es el radio del circulo 2?");
	 radio=sc.nextDouble();
	
	 Circulo c2=new Circulo();

	 System.out.println("El area del circulo es "+c2.calcularArea(radio)+" y su longitud es "+c2.calcularLongitud(radio));

	 System.out.println("¿Cual es el radio del circulo 3?");
	 radio=sc.nextDouble();
	
	 Circulo c3=new Circulo();

	 System.out.println("El area del circulo es "+c3.calcularArea(radio)+" y su longitud es "+c3.calcularLongitud(radio));


	}
}
