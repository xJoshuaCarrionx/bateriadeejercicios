package bateriadeejercicio;

import java.util.Scanner;

public class claseUno {

	public static void main(String[] args) {
		
		int A = 0, B = 0;
		int resultado;
		
Scanner Lector = new Scanner(System.in);
		
	do{
	    {
			
		System.out.println("ingrese un valor para A: ");
			A = Lector.nextInt();
			
	    }
		
		{
	    System.out.println("ingrese un valor para B: " );
		   B = Lector.nextInt();
		
		}
		
		resultado = (int) ( A + B );
		
		{
		System.out.println("El valor final es: " + resultado);	
			
		}
		
		{
		System.out.println("Le gustaria intercambiar valores? 1.si 2.no");
		
		}
	  } while(1 > 2); 
	
	    System.out.println("Fin del programa");
		 
}

}
