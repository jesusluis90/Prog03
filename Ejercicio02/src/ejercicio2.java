import java.util.Scanner;
public class ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int numero, resultado=0 , multi=1;
		
		System.out.print("Tabla de multiplicar de ");
		numero=teclado.nextInt();
		
		if (numero>=1 && numero<=100){
			while ( multi <=10){
				resultado= numero*multi;
				System.out.println(numero+"*"+multi +"="+ resultado);
				multi=multi+1;
			}
			
	}
	}
}
