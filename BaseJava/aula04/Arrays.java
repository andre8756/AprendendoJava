package aula04;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		/*
		
	--------------------------------------------
		
		  
		double[] numeros = {45,85,56,89};
		double[] temperaturas = new double[10];
		
		temperaturas[5] = 5;
		
		for(int i = 0; i<numeros.length; i++) {
			System.out.println(numeros[i]);
		
		
		}
	--------------------------------------------
	*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do vetor:");
		int tamanho = scanner.nextInt();
		
		int[] A = new int[tamanho];
		int[] B = new int[5];
		
		for(int i = 0; i < tamanho; i++) {
			
			System.out.print("Digite o valor de A["+i+"]: ");
			A[i] = scanner.nextInt();
		}

		for(int i = 0; i < A.length; i++) {
			B[i] = A[i];
			System.out.println("B["+i+"] = "+B[i]+"  A["+i+"] = "+A[i]);
		}
	}
	
}
