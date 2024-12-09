package SistemaDePagamento2;

public class CartaoFactory extends PagamentoFactory {

	@Override
	public Pagamento processarPagamento(double valor) {
		return new PagamentoCartao(valor);
	}

}
