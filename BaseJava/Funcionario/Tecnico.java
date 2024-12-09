package Funcionario;

public class Tecnico extends Assistente {
	
	String supervisor;
	
	public Tecnico(String nome, double salario, String matricula, String supervisor) {
		super(nome, salario, matricula);
		this.supervisor = supervisor;
	}

	public String getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}

}
