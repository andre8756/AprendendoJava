package aula03;

public class Ex1 {
	public static void main(String[] args) {
		
		double alt1 = 1.50;
		double crescimento1 = 0.02;
		double alt2 = 1.10;
		double crescimento2 = 0.03;
		int anos = 0;
		
		do {
			alt1 = alt1 + crescimento1;
			alt2 = alt2 + crescimento2;
			
			anos += 1;
			
		}while(alt1>alt2);
		
		
		System.out.println("Em "+anos+" anos, Juca ficará maior que João.");
		
		System.out.println("João não será maior que Chico, pois o ser humano só cresce até os 21 anos de idade");
		
	}
}
