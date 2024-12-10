package br.com.Bridge.ConversorDeFormatos.empregados;

import br.com.Bridge.ConversorDeFormatos.conversor.*;

public abstract class Empregado {
	protected Conversor conversor;
	private String nome;
	private int idade;
	private double salario;
	
	public Empregado(Conversor conversor, String nome, int idade, double salario) {
		this.conversor = conversor;
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}
	
	public abstract void dados();

	public Conversor getConversor() {
		return conversor;
	}

	public void setConversor(Conversor conversor) {
		this.conversor = conversor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
