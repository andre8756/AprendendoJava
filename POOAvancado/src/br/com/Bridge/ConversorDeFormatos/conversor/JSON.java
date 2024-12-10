package br.com.Bridge.ConversorDeFormatos.conversor;

public class JSON implements Conversor{

	@Override
	public void converter() {
		System.out.println("Convertendo com o JSON");
	}

	@Override
	public void converter(String nome, int idade, double salario) {
		System.out.println("Convertendo com o JSON");
		System.out.println("");
		System.out.println("{ ");
		System.out.println("'Nome:' '"+nome+"'");
		System.out.println("'Idade:' '"+idade+"'");
		System.out.println("'Salario:' '"+salario+"'");
		System.out.println("}");
		
	}

}
