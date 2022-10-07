package bateriadeejercicio;

import java.util.Scanner;

public class claseCuatro {

	public static void main(String[] args) {
		// Pedir por teclado 3 numeros; si el primero es negativo, debe imprimir el producto de los tres si no lo es se imprime la suma.
       // Solo numeros enteros.
		int numero1;
		int numero2;
		int numero3;
		int resultado = 0;
		
Scanner Lector =new Scanner(System.in);
		
		{
		System.out.println("Seleccione su primer numero");
		numero1 =Lector.nextInt();
		}

		{
		System.out.println("Selecione su segundo numero");
		numero2 =Lector.nextInt();
		}
		
		{
         System.out.println("Seleccione su tercer numero");
        numero3 =Lector.nextInt();
        		 
		}
		
		
		if(numero1 > numero2 && numero1 > numero3){
			resultado = (int) (numero1 + numero2 + numero3);
		}else if (numero1 < numero2 && numero1 < numero3){
			System.out.print("Como el primer numero es menor su resultado es: " + numero1 + numero2 + numero3);
		}else {
			System.out.println("Su resultado es el siguiente: " + resultado);
		}
		
		
		
		
		
		
		
	
}

}
