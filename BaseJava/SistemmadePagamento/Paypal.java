package SistemmadePagamento;

public class Paypal implements Pagamento{

	@Override
	public void processarPagamento(double valor) {
		System.out.println("Pagamento processado via PayPal de R$"+valor);
	}

}
