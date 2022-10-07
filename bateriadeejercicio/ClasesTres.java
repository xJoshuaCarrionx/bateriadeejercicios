package bateriadeejercicio;

import java.util.Scanner;

public class ClasesTres {

	public static void main(String[] args) {
		// Solo funciona con enteros
		// Seleccionar que numero es el mayor
		
       int numero1;
       int numero2;
       int numero3;
Scanner Lector = new Scanner(System.in);
    
    System.out.println("Ingrese el primer numero");
    numero1 =Lector.nextInt();
    
    System.out.println("Ingrese el segundo numero");
    numero2 =Lector.nextInt();
    
    System.out.println("Ingrese el trecer numero");
    numero3 =Lector.nextInt();
    
    
	if(numero1 > numero2 && numero1 > numero3) {
		System.out.println("El numero: " + numero1 + " Es mayor que: " + numero2 + " y " + numero3);
		
	} else if (numero2 > numero1 && numero2 > numero3) {
		System.out.println("El numero: " + numero2 + " Es mayor que: " + numero1 + " y " + numero3);
		
	} else if (numero3 > numero1 && numero3 > numero2) {
		System.out.println("El numero: " + numero3 + " Es mayor que: " + numero2 + " y " + numero1);
		
	}
	
}

}
