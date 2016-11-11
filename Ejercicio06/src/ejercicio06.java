import java.util.Scanner;
public class ejercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int N,sumaP=0,sumaI=0,resultado;
		
		System.out.print("Introducir numero");
		N=teclado.nextInt();
		
		while (N!=0){
			if (N%2 == 0){	
				sumaP=N+sumaP;
				System.out.print("Introducir numero");
				N=teclado.nextInt();
				
			} else{
				sumaI=N+sumaI;
				System.out.print("Introducir numero");
				N=teclado.nextInt();
				
			}
		}
		System.out.println("la suma de los pares es: " + sumaP);
		System.out.println("la suma de los impares es: " + sumaI);
	}
}	
