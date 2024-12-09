package Armazenamento;

public class ArquivoTexto extends Armazenamento {

	public ArquivoTexto(String dado) {
		super(dado);
	}

	@Override
	public void armazenar(String dado) {
		super.dado = dado;
	}
	
}
