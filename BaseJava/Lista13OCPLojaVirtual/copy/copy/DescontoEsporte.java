package Lista13OCPLojaVirtual.copy.copy;

public class DescontoEsporte implements Desconto {

	@Override
	public double calcularDesconto(Produto produto) {
		return produto.getPreco() * 0.25;
	}

}
