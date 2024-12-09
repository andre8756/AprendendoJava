package aula02;
import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		double n1 = scanner.nextDouble();
		System.out.println("Digite outro valor: ");
		double n2 = scanner.nextDouble();
		
		System.out.println("1. +");
		System.out.println("2. -");
		System.out.println("3. *");
		System.out.println("4. /");
		System.out.print("Escolha a operação desejada: ");
		int opcao = scanner.nextInt();
		
		switch(opcao) {
		case 1:{
			System.out.println("Soma: ");
			double soma = n1+n2;
			System.out.println(n1+" + "+n2+" = "+soma);
			break;
		}
		case 2:{
			System.out.println("Subtração: ");
			double soma = n1-n2;
			System.out.println(n1+" - "+n2+" = "+soma);
			break;
		}
		case 3:{
			System.out.println("Multiplicação: ");
			double soma = n1*n2;
			System.out.println(n1+" * "+n2+" = "+soma);
			break;
		}
		case 4:{
			System.out.println("Divisão: ");
			double soma = n1/n2;
			System.out.println(n1+" / "+n2+" = "+soma);
			
		}
		}
	}
}
