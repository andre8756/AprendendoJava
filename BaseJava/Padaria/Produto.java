package Padaria;

public class Produto {
	private String nome;
	private double preco;
	private int qnt;
	
	Produto(){
	}
	Produto(String nome, double preco, int qnt){
		this.nome = nome;
		this.preco = preco;
		this.qnt = qnt;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
	
	public int getQnt() {
		return qnt;
	}
	
	@Override
    public String toString() {
        return "Pessoa [nome= " + nome + ", preco=" + preco +" Quantidade="+qnt+ "]";
    }
}
