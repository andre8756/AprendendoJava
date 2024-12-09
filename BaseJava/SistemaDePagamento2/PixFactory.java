package SistemaDePagamento2;

public class PixFactory extends PagamentoFactory{

	@Override
	public Pagamento processarPagamento(double valor) {
		return new PagamentoPix(valor);
	}

}
