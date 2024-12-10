package br.com.model.AbstractFactory.FabricaDeTemas;

import br.com.facktory.AbstractFactory.FabricaDeTemas.*;

public class TemaEscuroTextbox implements Textbox{

	@Override
	public void paint() {
		System.out.println("Textbox tema escuro");
		
	}

}
