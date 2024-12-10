package br.com.facktory.AbstractFactory.FabricaDeTemas;

import br.com.model.AbstractFactory.FabricaDeTemas.*;

public class ClaroAbstractFactory implements GuiAbstractFactory {

	@Override
	public Label createLabel() {
		return new TemaClaroLabel();
	}

	@Override
	public Textbox createTextobox() {
		return new TemaClaroTextbox();
	}

}
