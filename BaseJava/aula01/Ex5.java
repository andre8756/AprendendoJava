package aula01;
import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor de a: ");
		double a = scanner.nextDouble();
		System.out.println("Digite o valor de b: ");
		double b = scanner.nextDouble();
		System.out.println("Digite o valor de c: ");
		double c = scanner.nextDouble();
		System.out.println("Digite o valor de d: ");
		double d = scanner.nextDouble();
		System.out.println("Digite o valor de e: ");
		double e = scanner.nextDouble();
		System.out.println("Digite o valor de f: ");
		double f = scanner.nextDouble();
		
		double y = ((a * f) - (c*d)) / (a*e) - (b*d);
		double x = ((c*e) - (b * f)) / ((a*e)-(b*d));
		
		System.out.println(x);
		System.out.println(y);
		
	}
}
