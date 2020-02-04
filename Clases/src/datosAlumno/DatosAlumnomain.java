package datosAlumno;

import javax.swing.JOptionPane;

public class DatosAlumnomain {

	public static void main(String[] args) {
//		4.- Realiza un programa en Java que, mediante un menú con varias opciones haga las siguientes tareas (hazlo con Scanner y con la clase JOptionPane):
//
//			Opción 1: Pide los datos de un alumno (nombre, apellido, curso, nota) y da de alta al alumno en nuestro programa.
//
//			Opción 2: Muestra los datos de los alumnos cuya nota media es mayor o igual a 5 y el número de ellos que hay que cumplan esa media.
//
//			Opción 3: Muestra los datos de los alumnos cuya nota media es menor a 5 y el número de ellos que hay que cumplan esa media.
//
//			Utiliza funciones (métodos estáticos) para llevar a cabo las tareas pedidas.

		int numero_Alumno=Integer.parseInt(JOptionPane.showInputDialog("¿Cual es el numero de alumnos?"));
		Alumno[]  alumnos= new Alumno[numero_Alumno];
		
		
		int i = JOptionPane.showOptionDialog(null, 
				"1. Crear Alumno \n 2.Comprobar alumnos aprobados \n 3.Comprobar alumnos suspensos", 
				JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
				  
				System.out.println(i);
				switch (i) {
				case 0:
					System.out.println("No, nada");
					break;
				case 1:
					System.out.println("Un poquito");
					break;
				case 2:
					System.out.println("Me estalla");
					break;
				}

		alumnos[0] = new Alumno();
		for (int j = 0; i < numero_Alumno; i++) {
			
			
		}
		
		
		
		
		
	}
}
