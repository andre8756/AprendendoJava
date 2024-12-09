package SistemaDePagamento2;

public class PagamentoCartao extends Pagamento {
	
	private double valor;
	
	public PagamentoCartao() {
	}
	
	public PagamentoCartao(double valor) {
		this.valor = valor;
	}
	
	@Override
	public void processarPagamento() {
		System.out.println("Pagamento via Cartão de R$ "+getValor());
		
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	

}
