package br.com.model;

import br.com.facktory.Documento;

public class DocumentoPDF implements Documento {

	@Override
	public void abrir() {
		System.out.println("Você abriu um PDF");
		
	}

}
