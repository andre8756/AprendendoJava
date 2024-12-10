package br.com.model;

import br.com.facktory.Documento;

public class DocumentoWord implements Documento {

	@Override
	public void abrir() {
		System.out.println("Você abriu um documento no Word");
		
	}

}
