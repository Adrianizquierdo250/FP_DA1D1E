package enunciados2;

public class Libromain {
	public static void main(String[] args) {
		Libro[] estanteria= new Libro[3];
		
		Libro l1=new Libro("Origen", "Dan Brown", 4, 0);
		Libro l2=new Libro("El fuego invisible", "Javier Sierra", 2, 1);
		
		estanteria[0]=l1;
		estanteria[1]=l2;
		
		System.out.println(estanteria[1].toString());
		
		System.out.println("¿El libro se ha podido prestar? "+estanteria[1].prestamo());
		
		System.out.println(estanteria[0].toString());
		
		System.out.println("¿El libro "+ "'"+estanteria[1].getTitulo()+"'"+" se ha podido prestar? "+estanteria[1].prestamo());
		
		System.out.println("¿El libro se ha devuelto?"+estanteria[0].devolucion());

		System.out.println("¿El libro se ha devuelto?"+estanteria[1].devolucion());
	}
	
}