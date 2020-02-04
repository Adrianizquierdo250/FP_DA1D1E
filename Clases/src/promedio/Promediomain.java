package promedio;

import javax.swing.JOptionPane;

public class Promediomain {

	public static void main(String[] args) {
//		2.-  Implementa una clase en Java que permita realizar promedios. La clase debe tener dos métodos, uno para ingresar un nuevo número, llamado agregarNumero(int numero)
//		y otro para obtener el promedio hasta el momento, llamado obtenerPromedio(). Determina qué atributos son necesarios para implementarla.		
//		Implementa luego una clase de prueba que permita introducir algunos valores y que muestre el promedio. 

		
	double  cantidad=Double.parseDouble(JOptionPane.showInputDialog("¿Cuantos numeros tiene?")) ;
	
	for (int i = 0; i < cantidad; i++) {
		Promedio numero = new Promedio();
		
		double  numero1=Double.parseDouble(JOptionPane.showInputDialog("¿Que numero quiere añadir?")) ;
		numero.agregarNumeros((int) numero1);
	}

	}

}
