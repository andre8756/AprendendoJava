package Aula3.copy;

public class Agenda {
	private String nome;
	private String[] contatos;
	
	Agenda(String nome){
		this.nome = nome;
	}
	
	public void setContatos(String nome, String telefone, String email) {
		Contato c1 = new Contato(nome, telefone, email);
	}
}
