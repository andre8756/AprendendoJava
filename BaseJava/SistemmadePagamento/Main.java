package SistemmadePagamento;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Pagamento> pagamentos = new ArrayList<>();
		pagamentos.add(new CartaoDeCredito());
		pagamentos.add(new Paypal());
		pagamentos.add(new Bitcoin());
		
		double valor = 50;
		
		for (Pagamento pagamento : pagamentos) {
			pagamento.processarPagamento(valor);
		}
	}
}
