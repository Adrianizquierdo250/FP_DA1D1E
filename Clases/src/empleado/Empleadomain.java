package empleado;


import javax.swing.*; 

public class Empleadomain {
	
public static void main(String[] args) {
		

		
			
			int numero_emple=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos empleados hay?"));
	  
	String nombreEmple[]={"Juan","Alberto","Ana","Maria","Pilar","Sergio","Roberto","Angela","Alejandro","Carmen"};
	String apellidoEmple[]= {"Alcantara","Duque","Diaz","Martinez","Pozo","Olmo","Garcia","Perez","Hernandez","Fernandez"};
	
	//Array donde se guardaran los empleados 
	Empleado [] empleado= new Empleado[numero_emple];
	int cont=0;
	int contPlus=0;

	//creación de n usuarios
	for (int i = 0; i < empleado.length; i++) {
		//Numero aleatorio para determinar la posicion del array con los nombres
		int nnombre=(int)(Math.random()*9)+1;
		//Numero aleatorio para determinar la posicion del array con los apellidos
		int napellido=(int)(Math.random()*9)+1;
		//Edad aleatoria
		int nedad=(int) Math.floor(Math.random()*(65-16+1)+16);
		//Salario aleatorio
		int nsalario=(int) Math.floor(Math.random()*(4500-855+1)+855);	
		//creacion de usuario
		Empleado emple=new Empleado(nombreEmple[nnombre],apellidoEmple[napellido],nedad,nsalario);
		//contador de empleados
		cont++;
		System.out.println("El salario del empleado "+ emple.getNombre()+ " "+emple.getApellido()+" es "+emple.getSalario());
		//Plus salario
		if (emple.plusSalario(emple.getSalario(), emple.getEdad())==true) {
			System.out.println("El empleado "+emple.getNombre()+" "+ emple.getApellido()+" puede tener un aumento de sueldo por tener mas de 40 años");
			
			contPlus++;
		}else {
			System.out.println("El empleado "+emple.getNombre()+" "+ emple.getApellido()+" no puede tener un aumento de sueldo por tener mas de 40 años");
		}
		System.out.println("Nombre: "+emple.getNombre()+" Apellido: "+emple.getApellido()+" Edad: "+ emple.getEdad()+" Salario: "+ emple.getSalario());
		
		System.out.println("");
	}

	System.out.println("El numero de empleados es "+cont );
	System.out.println("El numero de empleados a los que se les ha añadido un plus en su salario es "+contPlus);
}	
}
