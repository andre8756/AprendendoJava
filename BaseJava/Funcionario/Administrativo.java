package Funcionario;

public class Administrativo extends Funcionario {
	
	String setor;
	
	public Administrativo(String nome, double salario,String setor) {
		super(nome, salario);
		this.setor = setor;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	
	
}
