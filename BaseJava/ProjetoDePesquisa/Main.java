package ProjetoDePesquisa;

public class Main {
	
	public static void main(String[] args) {
		ProjetoPesquisa projeto = new ProjetoPesquisa();
		
		Professor professorA = new Professor("Andre", 1700, "Biologia", "Professor");
		Professor professorB = new Professor("Luiz", 2400, "Informatica", "Professor");
		
		//Aluno alunos = new Aluno();
		
		Equipe equipe = new Equipe();
		
		equipe.addAluno(null);
		
		projeto.getEquipes();
		
		
	}
	
	
	
	
	
}
