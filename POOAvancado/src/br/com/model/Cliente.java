package br.com.model;


import br.com.facktory.*;

public class Cliente {
	public static void main(String[] args) {
		DocumentoFactory documentofactory = new WordFactory();
		Documento documento = documentofactory.criarDocumento();
		documento.abrir(); // Printa: "VVocê abriu um documento no Word"
		
		documentofactory = new PDFFactory();
		documento = documentofactory.criarDocumento();
		documento.abrir(); //Printa: "Você abriu um PDF"
		
	}
}
