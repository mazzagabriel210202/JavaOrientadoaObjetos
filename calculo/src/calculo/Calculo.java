package calculo;


import java.util.Scanner;

import entities.Erros;

import java.util.Locale;
import trapezio.Trapezio;

public class Calculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
	try {
         System.out.println("digite o valor da base maior: ");
	     int baseMaior = sc.nextInt();
	  
	     System.out.println("digite o valor da base menor: ");

	     int baseMenor = sc.nextInt();
	   
	     System.out.println("digite aqui o valor da altura :");
	     int altura = sc.nextInt();
	   
	     int area = (baseMaior + baseMenor) * altura/2;
	}
	catch (Exception e) {
		  System.out.println("erro encontrado");
		
     

	
	}
	     sc.close();
}

}
