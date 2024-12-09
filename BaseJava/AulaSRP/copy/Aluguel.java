package AulaSRP.copy;

public class Aluguel  extends Livro {
	
	private String dataInicio;
	private String dataFinal;
	private boolean alugado;

	public Aluguel(String titulo, Autor autor, String dataInicio, String dataFinal, Categoria categoria) {
		super(titulo, autor, categoria);
		this.dataFinal = dataFinal;
		this.dataInicio = dataInicio;
		// TODO Auto-generated constructor stub
	}

	public void alugar() {
        if (!alugado) {
            alugado = true;
            System.out.println("O livro " + super.getTitulo() + " foi alugado.");
        } else {
            System.out.println("O livro " + super.getTitulo() + " j� est� alugado.");
        }
    }

    // Fun��o para gerar relat�rio de livros
    public void gerarRelatorio() {
        System.out.println("T�tulo: " + super.getTitulo());
        System.out.println("Autor: " + super.getAutor());
        System.out.println("Status: " + (alugado ? "Alugado" : "Dispon�vel"));
        System.out.println("Data Alugado: " + dataInicio);
        System.out.println("Data Alugado: " + dataFinal);
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

	public boolean isAlugado() {
		return alugado;
	}

	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}  
    
    
    
}
