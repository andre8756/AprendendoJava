package teste;


public class Main
{
	public static void main(String[] args) {
		
		Caixa caixa = new Caixa();
		Gerente gerente = new Gerente();
		Diretor diretor = new Diretor();
		CEO ceo = new CEO();
		
		caixa.setSucessor(gerente);
	    gerente.setSucessor(diretor);
	    diretor.setSucessor(ceo);
	    
	    double usarCredito = 2000;
	    caixa.handlerAprovacao(usarCredito);
		
	}
}
