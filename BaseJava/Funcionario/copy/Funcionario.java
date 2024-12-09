package Funcionario.copy;

public class Funcionario {
	private String nome;
	private double salario;
	protected double ganhoAnual;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public void addAumento(double valor) {
		this.salario = valor + (valor*(valor/100));
	}
	public double ganhoAnual() {
		ganhoAnual = salario*12;
		return ganhoAnual;
	}
	
	public String exibeDados() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + ", ganhoAnual=" + ganhoAnual + "]";
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + ", ganhoAnual=" + ganhoAnual + "]";
	}
	
	
}
