package aula01;
import java.util.Scanner;

public class OutInt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double total;
		int paginas;
		
		System.out.println("Entre com o número de folhas para fazer a copia: ");
		paginas = scanner.nextInt();
		total = paginas * 0.08;
		System.out.println("O total é: "+total);
	}
}
