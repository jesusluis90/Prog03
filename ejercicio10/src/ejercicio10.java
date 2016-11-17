import java.util.Scanner;
public class ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int N,P,contador=0, divisor=1;
		boolean primo=false;
		System.out.println("Introduzca el numero: ");
		N=teclado.nextInt();
		P=N;
		while (!primo && P>=N){
				contador=0;
				divisor=1;
		while (P>=divisor){
			if(P%divisor == 0)
				contador++;
				divisor++;
				}
			if(contador == 2)
				primo=true;
			else
				P++;
			
		}
		System.out.println("El numero primo mas cercano es: " + P);
				
			
	}
	
}