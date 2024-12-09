package aula01;
import java.util.Scanner;
public class Ex2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o lado do quadrado: ");
		double lado = scanner.nextDouble();
		
		double area = lado * lado;
		System.out.println("A area do quadrado é: "+area);
	}
}
