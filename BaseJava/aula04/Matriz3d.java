package aula04;

public class Matriz3d {
	public static void main(String[] args) {
		int[][][] m3 = new int [3][3][3];
		int soma = 0; 
		int soma2 = 0;
		int soma3 = 0;
		
		for (int linha = 0; linha< m3.length; linha++) {
			for(int coluna = 0; coluna < m3[linha].length; coluna++) {
				for(int profundidade = 0; profundidade < m3[linha][coluna].length; profundidade++) {
					System.out.print(profundidade+1);
					soma = profundidade+linha+coluna;
				}
				System.out.println();
				soma2 = soma+soma2;
			}
			System.out.println();
			soma3 = soma2+soma3;
		}
		System.out.println();
		System.out.println(soma);
	}
}
