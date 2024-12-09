package Aula2;

public class Ex1 {
	//ATRIBUTOS 
		private String nome;
		private int telefoneCliente;
		private String Endereco;
		private String[] tema = {"Castelo", "Boneca de Cinderela", "Bruxa"};
		private String data;
		private String horaInicio;
		private String horaFinal;
		private String corTema;
		
		Ex1(){
			
		}
		Ex1(String nome, int telefone, String dataIni, String dataFinal){
			this.nome = nome;
			this.telefoneCliente = telefone;
			this.horaInicio = dataIni;
			this.horaFinal= dataFinal;
			
		}
		
		public void getStatus() {
			System.out.println(nome);
			System.out.println(telefoneCliente);
			System.out.println(tema[0]);
			System.out.println(horaInicio);
			System.out.println(horaFinal);
		}
		
		void setValorAluguel() {
			
		}
		void setDesconto() {
			
		}
}
