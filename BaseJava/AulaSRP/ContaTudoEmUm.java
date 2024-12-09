package AulaSRP;


import java.util.ArrayList;
import java.util.List;

public class ContaTudoEmUm {
    private String titular;
    private double saldo;
    private List<String> transacoes;
    private Transacao transacao;

    public ContaTudoEmUm(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.transacoes = new ArrayList<>();
        transacoes.add("Conta criada com saldo inicial de: " + saldoInicial);
        transacao = new Transacao();
    }
    
    public String getDepositar(double valor) {
    	Transacao novaTransacao = new Transacao();
    	novaTransacao.depositar(valor);
    	return "Transacao concluida";
    }
    
    public String getSacar(double valor) {
    	Transacao novaTransacao = new Transacao();
    	novaTransacao.sacar(valor);
    	return "Transacao concluida";
    }
    
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

    // Fun��o para gerar relat�rio de saldo
    public void gerarRelatorioSaldo() {
        System.out.println("Relat�rio de Saldo");
        System.out.println("Titular: " + titular);
        System.out.println("Saldo atual: " + saldo);
    }

    // Fun��o para gerar relat�rio de transa��es
    public void gerarRelatorioTransacoes() {
        System.out.println("Relat�rio de Transa��es");
        for (String transacao : transacoes) {
            System.out.println(transacao);
        }
    }

    // Fun��o para obter saldo atual
    public double obterSaldo() {
        return saldo;
    }
}

