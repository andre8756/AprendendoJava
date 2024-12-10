package br.com.Bridge.BridgeDeFormas.bridge.formas;

import br.com.Bridge.BridgeDeFormas.bridge.cores.Cor;
import br.com.Bridge.BridgeDeFormas.bridge.estilos.Estilo;

public class Triangulo extends Forma{

	public Triangulo(Cor cor, Estilo estilo) {
		super(cor, estilo);
	}

	@Override
	public void desenhar() {
		System.out.println("Desenhando um triangulo");
		cor.aplicarCor();
		estilo.aplicarEstilo();
	}

}
