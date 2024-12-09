package Calculadora.copy;

public class Soma {
	int n1;
	int n2;
	int soma;
	
	Soma(int a, int b){
		n1 = a;
		n2 = b;
	}
	
	public void setSoma(int a, int b) {
		n1 = a;
		n2 = b;
		soma = n1 + n2;
	}
	
	public int getSoma() {
		System.out.println(soma);
		return soma;
	}

}
