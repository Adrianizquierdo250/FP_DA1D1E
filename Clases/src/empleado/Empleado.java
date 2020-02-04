package empleado;

import javax.swing.JOptionPane;

public class Empleado {

	private String nombre;
	private String apellido;
	private int edad;
	private int salario;
	
	public Empleado() {}
	
	public Empleado(String nombre, String apellido, int edad, int salario) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public  boolean plusSalario(int salario,int edad) {
		if (edad>40) {
			
			this.salario+=50;
			return true;
		}else {
			return false;
		}
		
	}
	
	
}
