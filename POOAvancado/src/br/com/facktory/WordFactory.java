package br.com.facktory;

import br.com.model.DocumentoWord;


public class WordFactory extends DocumentoFactory{

	@Override
	public Documento criarDocumento() {
		return new DocumentoWord();
	}

}
