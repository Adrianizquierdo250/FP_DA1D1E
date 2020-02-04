package datosAlumno;
//4.- Realiza un programa en Java que, mediante un menú con varias opciones haga las siguientes tareas (hazlo con Scanner y con la clase JOptionPane):
//
//Opción 1: Pide los datos de un alumno (nombre, apellido, curso, nota) y da de alta al alumno en nuestro programa.
//
//Opción 2: Muestra los datos de los alumnos cuya nota media es mayor o igual a 5 y el número de ellos que hay que cumplan esa media.
//
//Opción 3: Muestra los datos de los alumnos cuya nota media es menor a 5 y el número de ellos que hay que cumplan esa media.
//
//Utiliza funciones (métodos estáticos) para llevar a cabo las tareas pedidas.

public class Alumno {
	private String nombre;
	private String apellido;
	private String curso;
	private double nota;
	
	public Alumno() {
		
	}

	public Alumno(String nombre, String apellido, String curso, double nota) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.curso = curso;
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public static void pedirDatos() {
		
		
		
		
		
		
	}

	public static int alumnosAprobados(String nombre,String apellido,double nota) {
		int contApr=0;
		if (nota>=5) {
			System.out.println("El alumno "+nombre+ " "+ apellido+ " supera la media de 5 con una nota de "+nota);
	
		contApr++;
		}
		return contApr;
	}
	
	public static int alumnosSuspensos(String nombre,String apellido,double nota) {
		int contSus=0;
		if (nota<5) {
			System.out.println("El alumno "+nombre+ " "+ apellido+ " no supera la media de 5 con una nota de "+nota);
	
		contSus++;
		}
		
		return contSus;
	}
	
}
