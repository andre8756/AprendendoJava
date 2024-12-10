package MainApplication;

import java.time.LocalTime;

import Strategy.*;
import TransacaoBancaria.*;

public class Main {
	public static void main(String[] args) {
		//Definindo Transacao
		Transacao transacao = new Transacao();
		
		//Setando valores transacao
		transacao.setValor(100);
		transacao.setSaldoDisponivel(5000);
		transacao.setLimiteTransacional(3000);
		transacao.setTipo(new CartaoCredito());
		//transacao.setHoraTransacao(LocalTime.now());
		
		LocalTime horaEspecifica = LocalTime.of(14, 30);
		transacao.setHoraTransacao(horaEspecifica);
		
		//Configurando Handlers
		Autorizador verificaSaldo = new VerificadorSaldo();
		Autorizador verificaLimite = new VerificadorLimiteTransacional();
		Autorizador verificaHorario = new VerificadorHorario();
		//Setando o proximo Handler		
		verificaSaldo.setProximo(verificaLimite);
		verificaLimite.setProximo(verificaHorario);
		
		//Chamando a primeira verificação da cadeia (verificador de saldo)
		verificaSaldo.autorizar(transacao);
		
		
		
	}		
}
