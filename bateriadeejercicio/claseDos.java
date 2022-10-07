package bateriadeejercicio;

import java.util.*;
import java.util.Scanner;

public class claseDos {

	public static void main(String[] args) {
		int numero1;
		int numero2;
		Scanner Lector= new Scanner(System.in);
		
		
    //Solo funciona con enteros.
	//leer dos numeros y que la consola diga que numero es mayor, menor o igual.

		
		System.out.println("Ingrese su primer numero");
		numero1 =Lector.nextInt();
		
		System.out.println("Ingrese su segundo numero");
		numero2 =Lector.nextInt();

		if(numero1 > numero2) {
			System.out.println("El numero que selecciono: " + numero1 + " Es mayor que " + numero2);
			
		}else if(numero1 == numero2) {
			System.out.println("El numero que selecciono: " + numero1 + " Es igual a: " + numero2);
				
		} else {
			System.out.println("El primer numero: "+ numero1 + " Es menor que: " + numero2);
		}
		
		
		
}

}
