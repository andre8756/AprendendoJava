package AulaSRP.copy;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Autor autor = new Autor("George Orwell");
        Categoria categoria1 = new Categoria("Politica");
        Livro livro1 = new Livro("1984",autor, categoria1);
        Aluguel aluguel = new Aluguel("1984",autor, "25/05/2022", "20/04/2022", categoria1);        
        
        autor.setNome("Miguel de Cervantes");
        Livro livro2 = new Livro("Dom Quixote",autor, categoria1);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        aluguel.alugar();
        aluguel.gerarRelatorio();

        
    }
}