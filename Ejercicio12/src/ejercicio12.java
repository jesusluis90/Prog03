import java.util.Scanner;
public class ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String figura;
		int base, altura;
		
		System.out.println("Elige la figura entre triangulo, cuadrado o rectangulo:");
		figura=teclado.next();
		
		switch (figura){
		
		case "triangulo":
			System.out.print("Introduce valor de la base: ");
			base=teclado.nextInt();
			System.out.println("Introduce valor de la altura: ");
			altura=teclado.nextInt();
			System.out.print("El area del triangulo es "+ (base*altura)/2);
			break;
		case "cuadrado":
			System.out.print("Introduce valor del lado: ");
			base=teclado.nextInt();
			System.out.print("El area del cuadrado es "+ base*base);
			break;
		case "rectangulo":
			System.out.print("Introduce valor de la base: ");
			base=teclado.nextInt();
			System.out.println("Introduce valor de la altura: ");
			altura=teclado.nextInt();
			System.out.print("El area del rectangulo es "+ base*altura);
			break;
		}
	}

}
