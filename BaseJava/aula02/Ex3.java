package aula02;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String fruta;
		double preco;
		int unidade;
		
		System.out.print("Digite a fruta: ");
		fruta = scanner.next();
		System.out.println("Digite o preco da fruta: ");
		preco = scanner.nextDouble();
		System.out.println("Digite quantas unidades desejadas: ");
		unidade = scanner.nextInt();
		
		System.out.println("A fruta "+fruta+" ficou por "+preco*unidade+" ao total");
	}

}
