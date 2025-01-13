package TryCatch;

public class Main {
	
	public static void checarIdade(int idade) {
		if (idade < 18) {
			throw new ArithmeticException("Acesso bloqueado - Você tem menos de 25 anos. ");
		} else {
			System.out.println("Acesso permitido - Você é velho o suficiente!!!");
		}
	}
	
	public static void main(String[] args) {
		
		checarIdade(15);
		
	}
}
