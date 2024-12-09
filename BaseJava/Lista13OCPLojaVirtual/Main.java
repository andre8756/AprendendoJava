package Lista13OCPLojaVirtual;

public class Main {
	public static void main(String[] args) {
		Produto produtoA = new Produto("Esporte", 100);
		Produto produtoB = new Produto("Roupa", 130);
		
		Desconto descontoA = new DescontoEsporte();
		Desconto descontoB = new DescontoRoupa();
		
		CalculadoraDesconto calcular = new CalculadoraDesconto();
		calcular.addDesconto(descontoA);
		calcular.addDesconto(descontoB);

		calcular.addProduto(produtoA);
		calcular.addProduto(produtoB);
		
		System.out.println(calcular.calcularDescontoTotal());
		
		
	}
}
