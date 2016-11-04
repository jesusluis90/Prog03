import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int A,B,resultado = 0;
		int indice;	//recorre valores desde a+1 hasta b-1
		
		System.out.print("Valor A:");
		A=teclado.nextInt();
		
		System.out.print("Valor B:");
		B=teclado.nextInt();
		
		indice = A++;
		 while (indice <= B-1) {
			 resultado=indice+resultado;
			 indice=indice+1;
		 }
	
		 System.out.println(resultado);
		 
		 
		 
		
		 }
			 
		 
		
		
	}



