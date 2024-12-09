package aula022;
import java.util.Scanner;

public class Ex5 {
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
			
			if(soma%2 == 0) {
				System.out.println("O número é par");
			} else {
				System.out.println("O número é ímpar");
			}
			
			if (soma >=0) {
				System.out.println("O número é positivo");
			} else {
				System.out.println("O número é negativo");
			}
			
			break;
		}
		case 2:{
			System.out.println("Subtração: ");
			double subtracao = n1-n2;
			System.out.println(n1+" - "+n2+" = "+subtracao);
			
			if(subtracao%2 == 0) {
				System.out.println("O número é par");
			} else {
				System.out.println("O número é ímpar");
			}
			
			if (subtracao >=0) {
				System.out.println("O número é positivo");
			} else {
				System.out.println("O número é negativo");
			}
			break;
		}
		case 3:{
			System.out.println("Multiplicação: ");
			double mult = n1*n2;
			System.out.println(n1+" * "+n2+" = "+mult);
			
			if(mult%2 == 0) {
				System.out.println("O número é par");
			} else {
				System.out.println("O número é ímpar");
			}
			
			if (mult >=0) {
				System.out.println("O número é positivo");
			} else {
				System.out.println("O número é negativo");
			}
			
			break;
		}
		case 4:{
			System.out.println("Divisão: ");
			double div = n1/n2;
			System.out.println(n1+" / "+n2+" = "+div);
			if(div%2 == 0) {
				System.out.println("O número é par");
			} else {
				System.out.println("O número é ímpar");
			}
			
			if (div >=0) {
				System.out.println("O número é positivo");
			} else {
				System.out.println("O número é negativo");
			}
			
		}
		}
	}
}
