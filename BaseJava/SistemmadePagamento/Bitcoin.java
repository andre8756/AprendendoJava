package SistemmadePagamento;

public class Bitcoin implements Pagamento{

	@Override
	public void processarPagamento(double valor) {
		System.out.println("Pagamento processado via Bitcoin de R$"+valor);
		
	}

}
