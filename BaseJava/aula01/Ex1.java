package aula01;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primero cateto: ");
		double cat1 = scanner.nextInt();
		System.out.print("Digite o segundo cateto: ");
		double cat2 = scanner.nextInt();
		
		double hipotenusa = Math.pow(cat1, 2) + Math.pow(cat2, 2);
		
		System.out.println("O valor da hipotenusa é "+Math.sqrt(hipotenusa));
		
	}
}
