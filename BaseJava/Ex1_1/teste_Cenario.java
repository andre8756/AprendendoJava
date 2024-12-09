package Ex1_1;

public class teste_Cenario {
	//ATRIBUTOS 
	String nome;
	int telefoneCliente;
	String Endereco;
	String[] tema = {"Castelo", "Boneca de Cinderela", "Bruxa"};
	String data;
	String horaInicio;
	String horaFinal;
	String corTema;
	
	teste_Cenario(){
		
	}
	teste_Cenario(String nome, int telefone, String dataIni, String dataFinal){
		this.nome = nome;
		this.telefoneCliente = telefone;
		this.horaInicio = dataIni;
		this.horaFinal= dataFinal;
		
	}
	
	void Status() {
		System.out.println(nome);
		System.out.println(telefoneCliente);
		System.out.println(tema[0]);
		System.out.println(horaInicio);
		System.out.println(horaFinal);
	}
	
	void valorAluguel() {
		
	}
	void desconto() {
		
	}
	
	
}
