package aula01;
import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a velocidade desejada(km) : ");
		double velocidade = scanner.nextDouble();
		
		System.out.println("estaria a uma distancia de...");
		System.out.println("O veículo a 5h de viajem: "+velocidade*5);
		System.out.println("O veículo a 8h de viajem: "+velocidade*8);
		System.out.println("O veículo a 12h de viajem: "+velocidade*12);
		
		
		
		
	}
}
