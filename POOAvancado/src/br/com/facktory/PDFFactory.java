package br.com.facktory;

import br.com.model.DocumentoPDF;

public class PDFFactory extends DocumentoFactory{

	@Override
	public Documento criarDocumento() {
		return new DocumentoPDF();
	}
	
}
