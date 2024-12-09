package aula04;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int [] [] m2 = new int [3][3];
		int [] [] matrizes = {{1,2,3},{4,5,6,7},{8,9,10}};
		
		for(int linha = 0; linha < matrizes.length; linha++) {
			for(int coluna = 0; coluna < matrizes.length; coluna++) {
				System.out.print("Digite os valores da linha "+linha+": ");
				matrizes[0][0] = scanner.nextInt();
			}
		}
										// 3
		for (int linha = 0; linha < matrizes.length; linha++) {
			for(int coluna=0; coluna < matrizes[linha].length; coluna++) {
				m2[linha][coluna] = matrizes[linha][coluna];
				
				System.out.println(m2[linha][coluna]);
			}
			System.out.println();
		}
		
		System.out.println(matrizes.length);
	}
}
