package paquetedeejercicios; //Un programa que calcule el cuadrado de los 9 primeros numeros naturales

import java.util.Scanner;

public class claseonce {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int num1, num2, num3, num4, num5, num6, num7, num8, num9;
		int res1 = 1, res2 = 2 , res3 = 3, res4 = 4, res5 = 5, res6 = 6, res7 = 7, res8 = 8, res9 = 9;
		
		System.out.println("Ingrese el primer numero natural: ");
		num1 = lector.nextInt();
		System.out.println("Ingrese el segundo numero natural: ");
		num2 = lector.nextInt();
		System.out.println("Ingrese el tercer numero natural: ");
		num3 = lector.nextInt();
		System.out.println("Ingrese el cuarto numero natural: ");
		num4 = lector.nextInt();
		System.out.println("Ingrese el quinto numero natural: ");
		num5 = lector.nextInt();
		System.out.println("Ingrese el sexto numero natural: ");
		num6 = lector.nextInt();
		System.out.println("Ingrese el septimo numero natural: ");
		num7 = lector.nextInt();
		System.out.println("Ingrese el octavo numero natural: ");
		num8 = lector.nextInt();
		System.out.println("Ingrese el noveno numero natural: ");
		num9 = lector.nextInt();
		
		if(num1 == 1) {
			res1 = (int) Math.pow(num1, 2);
		} else if(num2 == 2 ) {
			res2 = (int) Math.pow(num2, 2);
		}else if(num3 == 3){
		    res3 = (int) Math.pow(num3, 2);
		}else if(num4 == 4){
		    res4 = (int) Math.pow(num4, 2);
		}else if(num5 == 5){
		    res5 = (int) Math.pow(num5, 2);
		}else if(num6 == 6){
			res6 = (int) Math.pow(num6, 2);
		}else if(num7 == 7){
			res7 = (int) Math.pow(num7, 2);
		}else if(num8 == 8){
			res8 = (int) Math.pow(num8, 2);
		}else if(num9 == 9){
		    res9 = (int) Math.pow(num9, 2);
		}else {
			System.out.println("Usted eligio un numero que no son los primeros nueves numeros reales");
		}
		
		System.out.println("El numero al cuadrado del primer numero es: " + res1);
		System.out.println("El numero al cuadrado del segundo numero es: " + res2);
		System.out.println("El numero al cuadrado del tercer numero es: " + res3);
		System.out.println("El numero al cuadrado del cuarto numero es: " + res4);
		System.out.println("El numero al cuadrado del quinto numero es: " + res5);
		System.out.println("El numero al cuadrado del sexto numero es: " + res6);
		System.out.println("El numero al cuadrado del septimo numero es: " + res7);
		System.out.println("El numero al cuadrado del octavo numero es: " + res8);
		System.out.println("El numero al cuadrado del noveno numero es: " + res9);
		
	}
	
}
