package aula03;

import java.util.Scanner;

public class Exemplo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a tabuada desejada: ");
		int tabuada = scanner.nextInt();

		for (int i = 0; i <= 10; i++) {

			int mult = i * tabuada;
			System.out.println(i + " X " + tabuada + " = " + mult);

		}

		scanner.close();
	}

}
