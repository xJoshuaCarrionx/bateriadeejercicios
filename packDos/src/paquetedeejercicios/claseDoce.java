package paquetedeejercicios;// Se pide un programa que haga la suma de los primeros N numeros naturales 

import java.util.Scanner;

public class claseDoce {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int num1, num2, num3, num4, num5;
		int resultado, elec, elec2; 
		
	
		System.out.println("Ingreso primer numero natural: ");
		num1 = lector.nextInt();
		System.out.println("Ingreso segundo numero natural: ");
		num2 = lector.nextInt();
		System.out.println("Ingreso tercer numero natural: ");
		num3 = lector.nextInt();
		System.out.println("Ingreso cuarto numero natural: ");
		num4 = lector.nextInt();
		System.out.println("Ingreso quinto numero natural: ");
		num5 = lector.nextInt();
		
		do {
		System.out.println("Le gustaria hacer la suma de todos los numeros naturales?: ");
		System.out.println("1. si 2. no");
		elec = lector.nextInt();
		}while(elec > 2 || elec < 1);
		
		if(elec == 1){
			  resultado = num1 + num2 + num3 + num4 + num5;
			  System.out.println("La suma de todos los numeros dan: " + resultado);
		}else {
			System.out.println("fin del programa :3");
		}
		
  		
		
	}

}
