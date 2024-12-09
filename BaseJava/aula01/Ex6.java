package aula01;
import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double acre = 4046.86;
		double ft2 = 10.76390090094542;
		double hectares = 0.0001;
				
		System.out.println("Digite o valor em m2: ");
		double m2 = scanner.nextDouble();
		System.out.println("Em acre: "+m2/acre);
		System.out.println("Em ft2(pés quadrados): "+m2*ft2);
		System.out.println("Em Hectares: "+m2*hectares);
		
		
	}
}
