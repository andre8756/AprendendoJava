package br.com.facktory.AbstractFactory.FabricaDeTemas;

import br.com.model.AbstractFactory.FabricaDeTemas.*;

public class EscuroAbstractFactory implements GuiAbstractFactory {

	@Override
	public Label createLabel() {
		return new TemaEscuroLabel();
	}

	@Override
	public Textbox createTextobox() {
		return new TemaEscuroTextbox();
	}

}
