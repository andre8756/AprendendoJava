package aula03;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String senha = "123";
		String tentativa;
		int cont = 0;
		
		do {
			System.out.println("Digite a senha: ");
			tentativa = scanner.nextLine();
			
			if(!tentativa.equals(senha)) {
				System.out.println("Senha incorreta!");
				cont += 1;
			}
			
			
		}while(!tentativa.equals(senha) && cont < 3);
		
		if(cont > 3) {
			System.out.println("Acesso permitido!");
		} else {
			System.out.println("Acesso negado!");
		}
		
	}
}
