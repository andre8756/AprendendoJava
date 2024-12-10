package br.com.Bridge.ConversorDeFormatos.conversor;

public class CVS implements Conversor{

	@Override
	public void converter() {
		System.out.println("Convertendo com o CVS");
	}
	
	public void converter(String nome, int idade, double salario) {
		System.out.println("Convertendo com o CVS");
		System.out.println("");
		System.out.println(nome+","+idade+","+salario);
	}

}
