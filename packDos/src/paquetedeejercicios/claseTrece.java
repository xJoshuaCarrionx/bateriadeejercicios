package paquetedeejercicios;//Un propgrama que calcule los N numeros pares y si sale un numero impar que haga una suma de 6+8+9+10+12

import java.util.Scanner;

public class claseTrece {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int num1, num2, num3, num4, num5, num6, num7, num8 = 8, num9, num10 = 10, num11, num12 = 12, num13, num14 = 14;
		int resultado, elec, resultado2; 
		int Nimpares = 5;
		
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
		System.out.println("Ingreso sexto numero natural: ");
		num6 = lector.nextInt();
		System.out.println("Ingreso septimo numero natural: ");
		num7 = lector.nextInt();
		System.out.println("Ingreso octavo numero natural: ");
		num8 = lector.nextInt();
		System.out.println("Ingreso noveno numero natural: ");
		num9 = lector.nextInt();
		System.out.println("Ingreso decimo numero natural: ");
		num10 = lector.nextInt();
		System.out.println("Ingreso onceavo numero natural: ");
		num11 = lector.nextInt();
		System.out.println("Ingreso doceavo numero natural: ");
		num12 = lector.nextInt();
		System.out.println("Ingreso terceavo numero natural: ");
		num13 = lector.nextInt();
		
		
		if(num1 == Nimpares) {
			resultado = num8 + num10 + num12;
			System.out.println("hubo un 5 por ende se hace la suma del 8, 10,12 que es: " + resultado);
		} else if(num2 == Nimpares ) {
			resultado = num8 + num10 + num12;
			System.out.println("hubo un 5 por ende se hace la suma del 8, 10,12 que es: " + resultado);
			
		}else if(num3 == Nimpares){
			resultado = num8 + num10 + num12;
			System.out.println("hubo un 5 por ende se hace la suma del 8, 10,12 que es: " + resultado);
			
		}else if(num4 == Nimpares){
			resultado = num8 + num10 + num12;
			System.out.println("hubo un 5 por ende se hace la suma del 8, 10,12 que es: " + resultado);
			
		}else if(num5 == Nimpares){
			resultado = num8 + num10 + num12;
			System.out.println("hubo un 5 por ende se hace la suma del 8, 10,12 que es: " + resultado);
		   
		}else if(num6 == Nimpares){
			resultado = num8 + num10 + num12;
			System.out.println("hubo un 5 por ende se hace la suma del 8, 10,12 que es: " + resultado);
			
		}else if(num7 == Nimpares){
			resultado = num8 + num10 + num12;
			System.out.println("hubo un 5 por ende se hace la suma del 8, 10,12 que es: " + resultado);
		
		}else if(num8 == Nimpares){
			resultado = num8 + num10 + num12;
			System.out.println("hubo un 5 por ende se hace la suma del 8, 10,12 que es: " + resultado);
			
		}else if(num9 == Nimpares){
			resultado = num8 + num10 + num12;
			System.out.println("hubo un 5 por ende se hace la suma del 8, 10,12 que es: " + resultado);
		  
		}else if(num10== Nimpares){
			resultado = num8 + num10 + num12;
			System.out.println("hubo un 5 por ende se hace la suma del 8, 10,12 que es: " + resultado);
			
		}else if(num11 == Nimpares){
			resultado = num8 + num10 + num12;
			System.out.println("hubo un 5 por ende se hace la suma del 8, 10,12 que es: " + resultado);
			
		}else if(num12 == Nimpares){
			resultado = num8 + num10 + num12;
			System.out.println("hubo un 5 por ende se hace la suma del 8, 10,12 que es: " + resultado);
			
		}else if(num13 == Nimpares){
			resultado = num8 + num10 + num12;
			System.out.println("hubo un 5 por ende se hace la suma del 8, 10,12 que es: " + resultado);
			
		}else{
			do {
			System.out.println("Le gustaria sumar todos los numeros que selecciono?");
			System.out.println("1. si 2.no");
			elec = lector.nextInt();
			}while(elec < 1 || elec > 2);
			
			if(elec == 1){
				resultado2 = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10 + num11 + num12 + num13;
				System.out.println("La suma de todos los numeros que selecciono es: " + resultado2);
				
			}else if(elec == 2) {
				System.out.println("los numeros que usted selecciono fueron: " + num1 + "," + num2+ "," + num3+ "," + num4+ "," + num5+ "," + num6+ "," + num7+ "," + num8+ "," + num9+ "," + num10+ "," + num11+ "," + num12+ "," + num13+ ",");
				
				
			}
		}
		
	}
	
}
