package aula02;
import java.util.Scanner;

public class Case {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o dia de 1 a 7: ");
		int dia = scanner.nextInt();
		
		switch (dia/2) {
		case 1: {
			System.out.print("Seguda-feira");
			break;
		}
		case 2: {
			System.out.print("Terça-feira");
			break;
		}
		case 3: {
			System.out.print("Quarta-feira");
			break;
		}
		case 4: {
			System.out.print("Quinta-feira");
			break;
		}
		case 5: {
			System.out.print("Sexta-feira");
			break;
		}
		case 6: {
			System.out.print("Sábado");
			break;
		}
		case 7: {
			System.out.print("Domingo");
			break;
		}
		default:
			System.out.print("Dia inválido");
		}		
	}
}
