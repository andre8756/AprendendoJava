package AulaSRP;

import java.util.List;

public class Transacao {
	private String titular;
    private double saldo;
    private List<String> transacoes;

	
	// Fun��o para depositar dinheiro
    public void depositar(double valor) {
        saldo += valor;
        transacoes.add("Dep�sito de: " + valor);
    }

    // Fun��o para sacar dinheiro
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            transacoes.add("Saque de: " + valor);
        } else {
            transacoes.add("Tentativa de saque sem saldo suficiente: " + valor);
        }
    }
    
    public void gerarRelatorioTransacoes() {
        System.out.println("Relat�rio de Transa��es");
        for (String transacao : transacoes) {
            System.out.println(transacao);
        }
    }
    
}
