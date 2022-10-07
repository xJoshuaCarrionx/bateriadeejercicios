package bateriadeejercicio;//Si ingresa un cero o menor, lo saca del programa, calcula la raiz mas el cuadrado de x numero.

import java.util.Scanner;

public class claseCinco {
    public static void main(String [] args) {
	
	double numeros;
     double resultado = 0;
    double raiz; 
    
Scanner Lector = new Scanner(System.in);
	
	    
	   {
		System.out.println("Favor ingresar su numero");
		numeros = Lector.nextDouble();
    	}	
		
		
	  if(numeros <= 0){
		System.out.println("Error su numero es menor o igual a cero, por ende lo saco del programa ;) ");
		
    } else if(numeros > 0) {
       System.out.println("---------------------------------------------- " );
		System.out.println("El numero que escogio fue: " + numeros);
		 System.out.println("---------------------------------------------- " );
		  raiz = Math.sqrt(numeros);
		   System.out.println("La raiz cuadrada del numero es: " + raiz);
		  System.out.println("---------------------------------------------- " );
		 numeros =(double) Math.pow(raiz, 2);
        System.out.println("El cuadrado de: " + raiz + " es " + numeros);
       System.out.println("---------------------------------------------- " );
		 
    } else {
	   System.out.println("Su resultado es: " + resultado);
    }
	
}	
}


