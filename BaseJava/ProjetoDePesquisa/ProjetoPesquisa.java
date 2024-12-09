package ProjetoDePesquisa;

public class ProjetoPesquisa {
	private int codigo;
	private String titulo;
	private String dataInicio;
	private String dataFinal;
	private Professores professores;
	private Alunos alunos;
	private Equipe equipe;
	//private ArrayList<Funcionario> professores = new ArrayList<>();
	//private ArrayList<Pesquisador> pesquisadores = new ArrayList<>();
	
	public Alunos getAlunos() {
		return alunos;
	}
	
	public Professores getProfessores() {
		return professores;
	}
	
	public Equipe getEquipes() {
		return equipe;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}
	
	
}
