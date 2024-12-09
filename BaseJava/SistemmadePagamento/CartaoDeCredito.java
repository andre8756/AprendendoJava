package SistemmadePagamento;

public class CartaoDeCredito implements Pagamento{

	@Override
	public void processarPagamento(double valor) {
		System.out.println("Pagamento via Cartão de Crédito:"+
	valor);
	}

}
