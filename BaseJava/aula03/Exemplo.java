package aula03;

import java.util.Scanner;

public class Exemplo {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int opcao = 1;

		while (opcao != 0) {
			System.out.print("Tente adivinhar o número: ");
			opcao = scanner.nextInt();
		}
		System.out.println("Parabéns você acertou!!!");
		do {
			System.out.println("Digite 1 para parar a aplicação: ");
			opcao = scanner.nextInt();
		} while (opcao != 1);
		System.out.println("Aplicação finalizada!");
	}
}
