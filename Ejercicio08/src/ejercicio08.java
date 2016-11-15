import java.util.Scanner;
public class ejercicio08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int N, contadorMultiplicador =1;
		long resultado =1;
		
		System.out.print("Introducir numero: ");
		N= teclado.nextInt();
		if (N > 0) {
			while (contadorMultiplicador <= N){
				resultado = contadorMultiplicador*resultado;
				contadorMultiplicador++;
			}
			System.out.print("El factorial es: " + resultado);
		

	}else
			System.out.print("El numero no es mayor que 0, has fracasado.");
 }			

}
