package aula02;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua idade(necessário ter mais de 5 anos): ");
		int idade = scanner.nextInt();
		
		if (idade >= 18) {
			System.out.println("Adulto");
		} else if(idade >= 14) {
			System.out.println("Juvenil B");
		} else if(idade >= 11) {
			System.out.println("Juvenil A");
		} else if (idade >= 8) {
			System.out.println("Infantil B");
		} else if (idade >= 5) {
			System.out.println("Infantil A");
		} else {
			System.out.println("A idade mínima é de 5 anos");
		}
		
	}
}
