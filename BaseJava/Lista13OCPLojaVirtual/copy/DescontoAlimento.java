package Lista13OCPLojaVirtual.copy;



public class DescontoAlimento implements Desconto {

    public double calcularDesconto(Produto produto) {
        return produto.getPreco() * 0.05; 
    }
}
