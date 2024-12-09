package Armazenamento;

public class BancoDeDados extends Armazenamento {
	
	public BancoDeDados(String dado) {
		super(dado);
	}

	@Override
	public void armazenar(String dado) {
		super.dado = dado;
		System.out.println("Dado armazenado");
	}
	
	public String mostrarDados() {
		return dado;
	}

}
