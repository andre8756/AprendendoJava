package aula02;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro positivo: ");
		double numero = scanner.nextInt();
		
		if (numero%2 == 0) {
			System.out.print("O número "+numero+" é par ");
			System.out.println(numero);
		} else {
			System.out.print("O número "+numero+" é impar ");
			System.out.println(numero);
		}
		
	}
}
