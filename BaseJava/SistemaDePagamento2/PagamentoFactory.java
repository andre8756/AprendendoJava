package SistemaDePagamento2;

public abstract class PagamentoFactory {
	public abstract Pagamento processarPagamento(double valor);
}
