package Aula3;

public class Contato {
	private String nome;
	private String telefone;
	private String email;
	
	Contato(){
	}
	
	Contato(String nome, String telefone, String email){
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String gerNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
    @Override
    public String toString() {
        return "Pessoa [nome= " + nome + ", email=" + email +" telefone="+telefone+ "]";
    }
	
	
}
