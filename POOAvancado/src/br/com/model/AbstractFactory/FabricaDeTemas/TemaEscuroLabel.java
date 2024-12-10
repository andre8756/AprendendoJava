package br.com.model.AbstractFactory.FabricaDeTemas;

import br.com.facktory.AbstractFactory.FabricaDeTemas.Label;

public class TemaEscuroLabel implements Label {
	@Override
	public void paint() {
		System.out.println("Label tema escuro");
	}

}
