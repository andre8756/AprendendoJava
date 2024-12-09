package Fantasia;

public class Cliente {
	private String nome;
	private String telefone;
	
	public Cliente(String nome, String telefone){
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public void setCadastro(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public String getCliente() {
		return nome;
	}
	
	
	
}
