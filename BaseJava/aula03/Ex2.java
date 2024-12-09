package aula03;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o limite Inferior: ");
		int lmtInferior = scanner.nextInt();
		System.out.print("Digite o limite Superior: ");
		int lmtSuperior = scanner.nextInt();
		int soma = 0;
		
		System.out.println("Números no escopo: ");
		
		if (lmtInferior % 2 != 0) {
			lmtInferior += 1;
		}

		for (int i = lmtInferior; i <= lmtSuperior; i += 2) {
			System.out.print(" "+i+" ");
			soma += i;
		}
		
		System.out.println("");
		System.out.println("Soma dos números: "+soma);

	}
}
