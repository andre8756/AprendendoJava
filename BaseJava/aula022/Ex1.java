package aula022;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int compra = 725;
		int valor = 1000;
		int troco = valor - compra;
		System.out.println("Troco...");
		
		if(troco>100) {
			int notas100 = troco/100;
			System.out.println(notas100+" notas de 100");
			troco = troco - notas100*100;
		} else if (troco>10) {
			int notas10 = troco/10;
			System.out.println(notas10+" notas de 10");
			troco = troco - notas10*10;
		} else {
			System.out.println(troco +" notas de 10");
		}
		
	}
}
