package aula01;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de ações compradas: ");
		double qntAcoes = scanner.nextDouble();
		
		System.out.println("Digite o valor de cada ação comprada: ");
		double compraAcao = scanner.nextDouble();
		
		System.out.println("Digite a taxa de corretagem da compra: ");
		double taxaCompra = scanner.nextDouble();
		
		System.out.println("Digite o valor de cada ação vendida: ");
		double vendaAcao = scanner.nextDouble();

		
		System.out.println("Digite a taxa de corretagem da venda: ");
		double taxaVenda = scanner.nextDouble();
		
		
		double valorCompra = compraAcao * qntAcoes;
		double valorTaxaCompra = valorCompra * (taxaCompra/100);
		
		double valorCompraTaxada = valorCompra - valorTaxaCompra;
		
		double valorVenda = vendaAcao * qntAcoes;
		double valorTaxaVenda = valorVenda * (taxaVenda/100);
		
		double valorVendaTaxada = valorVenda - valorTaxaVenda;
		
		double lucro = valorVendaTaxada - valorCompraTaxada;
		
		System.out.println("Valor da compra: "+valorCompra);
		System.out.println("Valor da taxa de compra: "+valorTaxaCompra);
		System.out.println("Valor total da compra: "+valorCompraTaxada);
		System.out.println("Valor total da Venda: "+valorVendaTaxada);
		System.out.println("Valor total da taxa de venda: "+valorTaxaVenda);
		System.out.println("Lucro Líquido: "+lucro);

		
		
		
	}
	
}
