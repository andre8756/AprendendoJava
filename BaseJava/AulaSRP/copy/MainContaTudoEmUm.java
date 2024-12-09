package AulaSRP.copy;

public class MainContaTudoEmUm {
	
    public static void main(String[] args) {
        ContaTudoEmUm conta = new ContaTudoEmUm("Jo�o Silva", 500.0);
        conta.getDepositar(200);
        conta.getSacar(150);
        conta.gerarRelatorioSaldo();
        conta.gerarRelatorioTransacoes();
    }
}