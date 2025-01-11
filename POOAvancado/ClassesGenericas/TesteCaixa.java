package ClassesGenericas;

public class TesteCaixa {
	public static void main(String[] args) {
		
		Caixa<String> caixaDeTexto = new Caixa<>();
		caixaDeTexto.setConteudo("Guarda texto na minha caixa!!");
		System.out.println(caixaDeTexto.somaConteudoNaCaixa("Mais um textoo"));
		
		Caixa<Integer> caixaDeNumeros = new Caixa<>();
		caixaDeNumeros.setConteudo(17);
		System.out.println(caixaDeNumeros.somaConteudoNaCaixa(23));
		
		Caixa<Double> caixaDeDouble = new Caixa<>();
		caixaDeDouble.setConteudo(11.45);
		System.out.println(caixaDeDouble.somaConteudoNaCaixa(55.78));
		System.out.println(caixaDeDouble.somaConteudoNaCaixa("texto"));
			
	}
}
