import java.util.Scanner;
public class ejercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int N, a=1,b =0;
		System.out.println("Introducir numero: ");
		N=teclado.nextInt();
		while (N>=a){
			if(N%a == 0)
				b++;
				a++;
				}
			if(b == 2)
				System.out.print(N +" es primo");
			else
				System.out.print(N + "no es primo");
	}
}	
	

