package promedio;

import javax.swing.JOptionPane;

public class Promediomain {

	public static void main(String[] args) {
//		2.-  Implementa una clase en Java que permita realizar promedios. La clase debe tener dos m�todos, uno para ingresar un nuevo n�mero, llamado agregarNumero(int numero)
//		y otro para obtener el promedio hasta el momento, llamado obtenerPromedio(). Determina qu� atributos son necesarios para implementarla.		
//		Implementa luego una clase de prueba que permita introducir algunos valores y que muestre el promedio. 

		
	double  cantidad=Double.parseDouble(JOptionPane.showInputDialog("�Cuantos numeros tiene?")) ;
	
	for (int i = 0; i < cantidad; i++) {
		Promedio numero = new Promedio();
		
		double  numero1=Double.parseDouble(JOptionPane.showInputDialog("�Que numero quiere a�adir?")) ;
		numero.agregarNumeros((int) numero1);
	}

	}

}
