package Lista13OCPLojaVirtual;


public class DescontoEletronico implements Desconto {
	

    public double calcularDesconto(Produto produto) {
        return produto.getPreco() * 0.10; 
    }

}
