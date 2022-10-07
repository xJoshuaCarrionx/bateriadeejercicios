package bateriadeejercicio; //Un colegio desea saber el porcentaje de niños y niñas

import java.util.Scanner;

public class claseSeis {
   public static void main(String[] args) {

	   int numeroMujeres, numeroHombres;
       double porcentajeHombre;
       double porcentajeMujer;
       int total;
	   
Scanner Lector= new Scanner(System.in);

  do{	  
       System.out.println("Ingrese la cantidad de Hombres(Limite 30)");
       numeroHombres = Lector.nextInt();
    }while(numeroHombres > 30 || numeroHombres < 0);
  
      System.out.println("---------------------------------------------- " );
      
  do{
	  System.out.println("Ingrese la cantidad de mujeres(Limite 30)");
	  numeroMujeres = Lector.nextInt();
	}while(numeroMujeres > 30 || numeroMujeres < 0);
  
  
  System.out.println("La cantidad de Hombres son: " + numeroHombres);
  System.out.println("La cantidad de Mujeres son: " + numeroMujeres);
 
  System.out.println("---------------------------------------------- " ); 
   total = numeroHombres + numeroMujeres;
   System.out.println("El total de alumnos en el salon son: " + total);
   System.out.println("---------------------------------------------- " );
   
  porcentajeHombre = numeroHombres * 100 / total;
  porcentajeMujer =  numeroMujeres * 100 / total;
  System.out.println("El porcentaje de los hombres es de: " + porcentajeHombre + " por ciento ");
  System.out.println("El porcentaje de las mujeres es de: " + porcentajeMujer + " por ciento ");
  
   

}
}
