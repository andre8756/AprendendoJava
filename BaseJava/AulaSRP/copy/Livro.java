package AulaSRP.copy;

public class Livro {
    private String titulo;
    private Autor autor; // Associa��o
    private Categoria categoria; // Agrega��o
    private boolean alugado;

    public Livro(String titulo, Autor autor, Categoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.alugado = false;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	} 
    
}
