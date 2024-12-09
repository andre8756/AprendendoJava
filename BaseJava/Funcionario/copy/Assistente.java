package Funcionario.copy;

public class Assistente extends Funcionario {
	private String matricula;
	
	public Assistente(String nome, double salario, String matricula) {
		super(nome, salario);
		this.matricula = matricula;
	}
	
	public String exibeDados() {
		return "Funcionario [nome=" + getNome() + ", salario=" + getSalario() + ", Matricula=" + matricula + "]";
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
}
