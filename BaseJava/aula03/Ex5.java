package aula03;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int chute = 0;
		
		do {
			System.out.println("Digite um número de 1 a 10: ");
			chute = scanner.nextInt();
			
			if(chute > 10) {
				System.out.println("Este número é maior que 10, digite outro");
			}
			
		}while(chute != 10);
		
		System.out.println("Você acertou o número!");
		}
		
	}


