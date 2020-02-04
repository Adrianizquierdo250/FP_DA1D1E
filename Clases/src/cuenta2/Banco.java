package cuenta2;

import java.util.Scanner;

public class Banco {

	public static final int MAX_OPC = 6;
	public static final int MAX_CUEN = 5;

	static int menu(int tope_op, Scanner sc) {
		int opcion_menu;

		System.out.println();
		System.out.println("\t1. Abrir cuenta");
		System.out.println("\t2. Ingresar dinero en cuenta");
		System.out.println("\t3. Sacar dinero de cuenta");
		System.out.println("\t4. Mostrar cuenta");
		System.out.println("\t5. Mostrar todas las cuentas");
		System.out.println("\t6. Salir.");
		do {
			System.out.print("\n\n\tElija opcion:");
			opcion_menu = Integer.parseInt(sc.nextLine());
		} while (opcion_menu < 1 || opcion_menu > tope_op);

		return opcion_menu;
	}

	public static void main(String args[]) {

		int opcion = 0;

		Scanner sc = new Scanner(System.in);
		Cuenta banco[] = new Cuenta[MAX_CUEN];
		Cuenta unaCuenta;
		int numCuenta;
		double cantidad;

		while (opcion != MAX_OPC) {
			opcion = menu(MAX_OPC, sc);
			switch (opcion) {
			case 1:
				System.out.println("Introduzca la cantidad para abrir cuenta");
				unaCuenta = new Cuenta(Double.parseDouble(sc.nextLine()));
				banco[Cuenta.numCuentasCreadas() - 1] = unaCuenta;
				break;
			case 2:
				System.out.println("Introduzca el numero de cuenta");
				numCuenta = Integer.parseInt(sc.nextLine());
				if (numCuenta <= Cuenta.numCuentasCreadas()) {
					// Suponemos que las cuentas están consecutivas
					// ya que no las borramos
					System.out.println("Introduzca la cantidad a ingresar");
					cantidad = Double.parseDouble(sc.nextLine());
					banco[numCuenta - 1].ingresar(cantidad);
					System.out.println(banco[numCuenta - 1]);
				} else
					System.out.println("La cuenta no existe.");

				break;
			case 3:
				System.out.println("Introduzca el numero de cuenta");
				numCuenta = Integer.parseInt(sc.nextLine());
				if (numCuenta <= Cuenta.numCuentasCreadas()) {
					// Suponemos que las cuentas están consecutivas
					// ya que no las borramos
					System.out.println("Introduzca la cantidad a sacar");
					cantidad = Double.parseDouble(sc.nextLine());
					if (banco[numCuenta - 1].sacar(cantidad) >= 0)
						System.out.println(banco[numCuenta - 1]);
					else
						System.out.println("No hay suficiente saldo");

				} else
					System.out.println("La cuenta no existe.");

				break;
			case 4:
				System.out.println("Introduzca el numero de cuenta");
				numCuenta = Integer.parseInt(sc.nextLine());
				if (numCuenta <= Cuenta.numCuentasCreadas()) {
					// Suponemos que las cuentas están consecutivas
					// ya que no las borramos
					System.out.println(banco[numCuenta - 1]);
				} else
					System.out.println("La cuenta no existe.");
				break;
			case 5:
				for (int i = 0; i < Cuenta.numCuentasCreadas(); i++)
					System.out.println(banco[i]);

				break;
			}
		}
		sc.close();
	}

}
