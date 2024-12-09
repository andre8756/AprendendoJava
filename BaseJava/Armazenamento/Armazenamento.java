package Armazenamento;

public abstract class Armazenamento {
	
	protected String dado;
	
	public Armazenamento(String dado) {
		this.dado = dado;
	}
	
	public abstract void armazenar(String dado);
}
