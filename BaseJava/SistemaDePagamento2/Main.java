package SistemaDePagamento2;

public class Main {
	
	public static void main(String[] args) {
		PagamentoFactory pagamentoFactory = new CartaoFactory();
		Pagamento pagamento = pagamentoFactory.processarPagamento(15);
		pagamento.processarPagamento(); // Processa o pagamento no cartão
		
		pagamentoFactory = new PixFactory();
		pagamento = pagamentoFactory.processarPagamento(20);
		pagamento.processarPagamento(); // Processa o pagamento no Pix
		
		
	}
}
