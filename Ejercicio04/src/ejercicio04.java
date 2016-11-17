import java.util.Scanner;
public class ejercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int N, divisor=1,contador =0;
		System.out.println("Introducir numero: ");
		N=teclado.nextInt();
		while (N>=divisor){
			if(N%divisor == 0)
				contador++;
				divisor++;
				}
			if(contador == 2)
				System.out.print(N +" es primo");
			else
				System.out.print(N + "no es primo");
	}
}	
	

