package br.com.Bridge.ConversorDeFormatos.empregados;

import br.com.Bridge.ConversorDeFormatos.conversor.Conversor;

public class GerenteDeProejtos extends Empregado{

	public GerenteDeProejtos(Conversor conversor, String nome, int idade, double salario) {
		super(conversor, nome, idade, salario);
	}

	@Override
	public void dados() {
		System.out.println("Nome:"+super.getNome());
		System.out.println("Idade:"+super.getIdade());
		System.out.println("Salario:"+super.getSalario());
		conversor.converter(super.getNome(), super.getIdade(), super.getSalario());
	}

}
